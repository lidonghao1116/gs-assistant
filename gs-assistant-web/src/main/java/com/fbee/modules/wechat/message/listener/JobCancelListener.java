package com.fbee.modules.wechat.message.listener;

import com.fbee.modules.bean.consts.Constants;
import com.fbee.modules.bean.consts.JobConst;
import com.fbee.modules.core.page.form.TenantJobResumeForm;
import com.fbee.modules.mybatis.dao.*;
import com.fbee.modules.mybatis.entity.TenantsUsersEntity;
import com.fbee.modules.mybatis.model.Orders;
import com.fbee.modules.mybatis.model.TenantsJobResume;
import com.fbee.modules.mybatis.model.TenantsJobs;
import com.fbee.modules.redis.JedisTemplate;
import com.fbee.modules.redis.JedisUtils;
import com.fbee.modules.utils.JsonUtils;
import com.fbee.modules.wechat.message.config.WechatConfig;
import com.fbee.modules.wechat.message.model.BusinessModel;
import com.fbee.modules.wechat.message.model.PushModel;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class JobCancelListener extends PushWechatListener {

    private final static Logger log = LoggerFactory.getLogger("messageLogger");

    private JedisTemplate mq = JedisUtils.getJedisMessage();

    @Autowired
    private TenantsUserSubscribeMapper tenantsUserSubscribeMapper;

    @Autowired
    private TenantsJobsMapper tenantsJobsMapper;

    @Autowired
    private TenantsJobResumesMapper tenantsJobResumesMapper;

    @Autowired
    private OrdersMapper ordersMapper;

    @Autowired
    private TenantsUsersMapper tenantsUsersMapper;

    /**
     * 合作抢单（职位招聘） 取消
     *
     * @param channel
     * @param message
     */
    @Override
    public void onMessage(String channel, String message) {
        log.info(String.format("[Listener] job finish: received messageKey [%s] on channel [%s]", message, channel));
        if (StringUtils.isBlank(message)) {
            return;
        }
        try {
            //等待业务处理事务提交
            Thread.sleep(1000);
            String orderNo = message;
            Orders order = ordersMapper.selectByPrimaryKey(orderNo);
            if (!Integer.valueOf(0).equals(order.getIsLocalStaff())) {
                return;
            }
            TenantsJobs job = tenantsJobsMapper.getByOrderNo(orderNo);
            if (job == null) {
                return;
            }

            //查询所有简历
            TenantJobResumeForm pm = new TenantJobResumeForm();
            pm.setJobId(job.getId());
            pm.setRowNum(100);
            List<TenantsJobResume> resumes = tenantsJobResumesMapper.getMyResumesBoxList(pm);
            if (resumes == null || resumes.size() < 1) {
                return;
            }
            for (TenantsJobResume re : resumes) {
                if(re.getStatus().equals(JobConst.ResumeStatus.REJECTS.getCode())){
                    continue;
                }
                log.info("finish resume:"+JsonUtils.toJson(re));
                TenantsUsersEntity user = tenantsUsersMapper.getById(re.getResumeTenantUserId());
                //推送职位取消通知
                BusinessModel model = new BusinessModel();
                model.setTitle("业务处理通知");
                model.setKeywordFirst("合作抢单");
                model.setKeywordSecond("取消");
                model.setKeywordThird(re.getRemarks());

                PushModel data = new PushModel();
                data.setTouser(user.getOpenId());
                data.setTemplateId(WechatConfig.Template.BUISNESS_TEMPLATE.getId());
                data.setUrl(Constants.MOBILE_HOST_NAME + "/#/grap/grapdetail/" + re.getId() + "/4");
                data.addData("first", model.getTitle() + "\n", null)
                        .addData("keyword1", model.getKeywordFirst(), "#173177")
                        .addData("keyword2", model.getKeywordSecond(), "#173177")
                        .addData("keyword3", model.getKeywordThird(), "#173177");
                push(data);

            }

        } catch (Exception e) {
            log.error(e.getMessage());
        }

    }


}

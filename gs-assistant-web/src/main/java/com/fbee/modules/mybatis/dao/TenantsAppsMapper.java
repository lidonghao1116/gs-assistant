package com.fbee.modules.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.fbee.modules.core.persistence.CrudDao;
import com.fbee.modules.core.persistence.annotation.MyBatisDao;
import com.fbee.modules.mybatis.entity.TenantsAppsEntity;
import com.fbee.modules.mybatis.model.TenantsApps;
import com.fbee.modules.mybatis.model.TenantsAppsExample;

@MyBatisDao
public interface TenantsAppsMapper extends CrudDao<TenantsAppsEntity>{
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_apps
	 * @mbggenerated  Mon Mar 27 09:30:54 CST 2017
	 */
	int countByExample(TenantsAppsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_apps
	 * @mbggenerated  Mon Mar 27 09:30:54 CST 2017
	 */
	int deleteByExample(TenantsAppsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_apps
	 * @mbggenerated  Mon Mar 27 09:30:54 CST 2017
	 */
	int deleteByPrimaryKey(Integer tenantId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_apps
	 * @mbggenerated  Mon Mar 27 09:30:54 CST 2017
	 */
	int insert(TenantsApps record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_apps
	 * @mbggenerated  Mon Mar 27 09:30:54 CST 2017
	 */
	int insertSelective(TenantsApps record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_apps
	 * @mbggenerated  Mon Mar 27 09:30:54 CST 2017
	 */
	List<TenantsApps> selectByExample(TenantsAppsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_apps
	 * @mbggenerated  Mon Mar 27 09:30:54 CST 2017
	 */
	TenantsApps selectByPrimaryKey(Integer tenantId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_apps
	 * @mbggenerated  Mon Mar 27 09:30:54 CST 2017
	 */
	int updateByExampleSelective(@Param("record") TenantsApps record, @Param("example") TenantsAppsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_apps
	 * @mbggenerated  Mon Mar 27 09:30:54 CST 2017
	 */
	int updateByExample(@Param("record") TenantsApps record, @Param("example") TenantsAppsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_apps
	 * @mbggenerated  Mon Mar 27 09:30:54 CST 2017
	 */
	int updateByPrimaryKeySelective(TenantsApps record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_apps
	 * @mbggenerated  Mon Mar 27 09:30:54 CST 2017
	 */
	int updateByPrimaryKey(TenantsApps record);

	/**
	 *
	 * @param tenantId 根据添加人查询
	 * @return
	 */
	TenantsApps selectByLoginAccount(Map<String, Object> map);

	/**
	 * 
	 * @MethodName:getWebSiteById
	 * @Type:TenantsAppsMapper
	 * @Description:获取门店名称
	 * @Return:String
	 * @Param:@param tenantId
	 * @Param:@return
	 * @Thrown:
	 * @Date:Sep 20, 2017 2:17:28 PM
	 */
	String getWebSiteById(Integer tenantId);
}
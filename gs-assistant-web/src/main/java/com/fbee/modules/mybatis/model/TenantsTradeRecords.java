package com.fbee.modules.mybatis.model;

import java.math.BigDecimal;
import java.util.Date;

public class TenantsTradeRecords {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_trade_records.TRADE_NO
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    private String tradeNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_trade_records.TENANT_ID
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    private Integer tenantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_trade_records.TRADE_TIME
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    private Date tradeTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_trade_records.FINANCE_TYPE
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    private String financeType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_trade_records.TRADE_AMOUNT
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    private BigDecimal tradeAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_trade_records.STATUS
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_trade_records.COUNTER_FEE
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    private BigDecimal counterFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_trade_records.IN_OUT_NO
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    private String inOutNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_trade_records.TRADE_TYPE
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    private String tradeType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_trade_records.REMARKS
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_trade_records.add_time
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    private Date addTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_trade_records.add_account
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    private String addAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_trade_records.modify_time
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_trade_records.modify_account
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    private String modifyAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_trade_records.is_usable
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    private String isUsable;

    private String orderNo;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_trade_records.TRADE_NO
     *
     * @return the value of tenants_trade_records.TRADE_NO
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_trade_records.TRADE_NO
     *
     * @param tradeNo the value for tenants_trade_records.TRADE_NO
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_trade_records.TENANT_ID
     *
     * @return the value of tenants_trade_records.TENANT_ID
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public Integer getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_trade_records.TENANT_ID
     *
     * @param tenantId the value for tenants_trade_records.TENANT_ID
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_trade_records.TRADE_TIME
     *
     * @return the value of tenants_trade_records.TRADE_TIME
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public Date getTradeTime() {
        return tradeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_trade_records.TRADE_TIME
     *
     * @param tradeTime the value for tenants_trade_records.TRADE_TIME
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_trade_records.FINANCE_TYPE
     *
     * @return the value of tenants_trade_records.FINANCE_TYPE
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public String getFinanceType() {
        return financeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_trade_records.FINANCE_TYPE
     *
     * @param financeType the value for tenants_trade_records.FINANCE_TYPE
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public void setFinanceType(String financeType) {
        this.financeType = financeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_trade_records.TRADE_AMOUNT
     *
     * @return the value of tenants_trade_records.TRADE_AMOUNT
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_trade_records.TRADE_AMOUNT
     *
     * @param tradeAmount the value for tenants_trade_records.TRADE_AMOUNT
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_trade_records.STATUS
     *
     * @return the value of tenants_trade_records.STATUS
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_trade_records.STATUS
     *
     * @param status the value for tenants_trade_records.STATUS
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_trade_records.COUNTER_FEE
     *
     * @return the value of tenants_trade_records.COUNTER_FEE
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public BigDecimal getCounterFee() {
        return counterFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_trade_records.COUNTER_FEE
     *
     * @param counterFee the value for tenants_trade_records.COUNTER_FEE
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public void setCounterFee(BigDecimal counterFee) {
        this.counterFee = counterFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_trade_records.IN_OUT_NO
     *
     * @return the value of tenants_trade_records.IN_OUT_NO
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public String getInOutNo() {
        return inOutNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_trade_records.IN_OUT_NO
     *
     * @param inOutNo the value for tenants_trade_records.IN_OUT_NO
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public void setInOutNo(String inOutNo) {
        this.inOutNo = inOutNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_trade_records.TRADE_TYPE
     *
     * @return the value of tenants_trade_records.TRADE_TYPE
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public String getTradeType() {
        return tradeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_trade_records.TRADE_TYPE
     *
     * @param tradeType the value for tenants_trade_records.TRADE_TYPE
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_trade_records.REMARKS
     *
     * @return the value of tenants_trade_records.REMARKS
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_trade_records.REMARKS
     *
     * @param remarks the value for tenants_trade_records.REMARKS
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_trade_records.add_time
     *
     * @return the value of tenants_trade_records.add_time
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_trade_records.add_time
     *
     * @param addTime the value for tenants_trade_records.add_time
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_trade_records.add_account
     *
     * @return the value of tenants_trade_records.add_account
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public String getAddAccount() {
        return addAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_trade_records.add_account
     *
     * @param addAccount the value for tenants_trade_records.add_account
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public void setAddAccount(String addAccount) {
        this.addAccount = addAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_trade_records.modify_time
     *
     * @return the value of tenants_trade_records.modify_time
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_trade_records.modify_time
     *
     * @param modifyTime the value for tenants_trade_records.modify_time
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_trade_records.modify_account
     *
     * @return the value of tenants_trade_records.modify_account
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public String getModifyAccount() {
        return modifyAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_trade_records.modify_account
     *
     * @param modifyAccount the value for tenants_trade_records.modify_account
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public void setModifyAccount(String modifyAccount) {
        this.modifyAccount = modifyAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_trade_records.is_usable
     *
     * @return the value of tenants_trade_records.is_usable
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public String getIsUsable() {
        return isUsable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_trade_records.is_usable
     *
     * @param isUsable the value for tenants_trade_records.is_usable
     *
     * @mbggenerated Mon Feb 27 09:57:14 CST 2017
     */
    public void setIsUsable(String isUsable) {
        this.isUsable = isUsable;
    }
}
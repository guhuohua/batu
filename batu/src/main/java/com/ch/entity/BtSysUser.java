package com.ch.entity;

import java.util.Date;

public class BtSysUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_user.user_id
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_user.username
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_user.password
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_user.phone
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_user.update_time
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_user.status
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_user.user_id
     *
     * @return the value of bt_sys_user.user_id
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_user.user_id
     *
     * @param userId the value for bt_sys_user.user_id
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_user.username
     *
     * @return the value of bt_sys_user.username
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_user.username
     *
     * @param username the value for bt_sys_user.username
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_user.password
     *
     * @return the value of bt_sys_user.password
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_user.password
     *
     * @param password the value for bt_sys_user.password
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_user.phone
     *
     * @return the value of bt_sys_user.phone
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_user.phone
     *
     * @param phone the value for bt_sys_user.phone
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_user.update_time
     *
     * @return the value of bt_sys_user.update_time
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_user.update_time
     *
     * @param updateTime the value for bt_sys_user.update_time
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_user.status
     *
     * @return the value of bt_sys_user.status
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_user.status
     *
     * @param status the value for bt_sys_user.status
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}
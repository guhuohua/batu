package com.ch.entity;

import java.util.Date;

public class BtSysPermission {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_permission.permission_id
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    private String permissionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_permission.name
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_permission.path
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    private String path;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_permission.parent_id
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    private Integer parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_permission.icon
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_permission.component
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    private String component;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_permission.sort
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    private Integer sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_permission.keep_status
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    private String keepStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_permission.type
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_permission.create_time
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_permission.update_time
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_permission.del_flag
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    private String delFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_permission.desc
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    private String desc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_permission.permission_id
     *
     * @return the value of bt_sys_permission.permission_id
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public String getPermissionId() {
        return permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_permission.permission_id
     *
     * @param permissionId the value for bt_sys_permission.permission_id
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId == null ? null : permissionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_permission.name
     *
     * @return the value of bt_sys_permission.name
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_permission.name
     *
     * @param name the value for bt_sys_permission.name
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_permission.path
     *
     * @return the value of bt_sys_permission.path
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_permission.path
     *
     * @param path the value for bt_sys_permission.path
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_permission.parent_id
     *
     * @return the value of bt_sys_permission.parent_id
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_permission.parent_id
     *
     * @param parentId the value for bt_sys_permission.parent_id
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_permission.icon
     *
     * @return the value of bt_sys_permission.icon
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_permission.icon
     *
     * @param icon the value for bt_sys_permission.icon
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_permission.component
     *
     * @return the value of bt_sys_permission.component
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public String getComponent() {
        return component;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_permission.component
     *
     * @param component the value for bt_sys_permission.component
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public void setComponent(String component) {
        this.component = component == null ? null : component.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_permission.sort
     *
     * @return the value of bt_sys_permission.sort
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_permission.sort
     *
     * @param sort the value for bt_sys_permission.sort
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_permission.keep_status
     *
     * @return the value of bt_sys_permission.keep_status
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public String getKeepStatus() {
        return keepStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_permission.keep_status
     *
     * @param keepStatus the value for bt_sys_permission.keep_status
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public void setKeepStatus(String keepStatus) {
        this.keepStatus = keepStatus == null ? null : keepStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_permission.type
     *
     * @return the value of bt_sys_permission.type
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_permission.type
     *
     * @param type the value for bt_sys_permission.type
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_permission.create_time
     *
     * @return the value of bt_sys_permission.create_time
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_permission.create_time
     *
     * @param createTime the value for bt_sys_permission.create_time
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_permission.update_time
     *
     * @return the value of bt_sys_permission.update_time
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_permission.update_time
     *
     * @param updateTime the value for bt_sys_permission.update_time
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_permission.del_flag
     *
     * @return the value of bt_sys_permission.del_flag
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_permission.del_flag
     *
     * @param delFlag the value for bt_sys_permission.del_flag
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_permission.desc
     *
     * @return the value of bt_sys_permission.desc
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_permission.desc
     *
     * @param desc the value for bt_sys_permission.desc
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}
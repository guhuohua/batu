package com.ch.entity;

import java.util.Date;

public class BtViewMenu {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_menu.id
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_menu.parent_id
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    private String parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_menu.name
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_menu.sort_order
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    private Integer sortOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_menu.create_time
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_menu.creater
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    private String creater;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_menu.id
     *
     * @return the value of bt_view_menu.id
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_menu.id
     *
     * @param id the value for bt_view_menu.id
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_menu.parent_id
     *
     * @return the value of bt_view_menu.parent_id
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_menu.parent_id
     *
     * @param parentId the value for bt_view_menu.parent_id
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_menu.name
     *
     * @return the value of bt_view_menu.name
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_menu.name
     *
     * @param name the value for bt_view_menu.name
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_menu.sort_order
     *
     * @return the value of bt_view_menu.sort_order
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_menu.sort_order
     *
     * @param sortOrder the value for bt_view_menu.sort_order
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_menu.create_time
     *
     * @return the value of bt_view_menu.create_time
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_menu.create_time
     *
     * @param createTime the value for bt_view_menu.create_time
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_menu.creater
     *
     * @return the value of bt_view_menu.creater
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    public String getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_menu.creater
     *
     * @param creater the value for bt_view_menu.creater
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }
}
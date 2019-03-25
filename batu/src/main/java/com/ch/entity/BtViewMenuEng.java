package com.ch.entity;

import java.util.Date;
import java.util.List;

public class BtViewMenuEng {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_menu_eng.id
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_menu_eng.parent_id
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    private String parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_menu_eng.name
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_menu_eng.sort_order
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    private Integer sortOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_menu_eng.create_time
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_menu_eng.creater
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    private String creater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_menu_eng.status
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_menu_eng.path
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    private String path;



    private List<BtViewMenuEng> children;

    public List<BtViewMenuEng> getChildren() {
        return children;
    }

    public void setChildren(List<BtViewMenuEng> children) {
        this.children = children;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_menu_eng.id
     *
     * @return the value of bt_view_menu_eng.id
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_menu_eng.id
     *
     * @param id the value for bt_view_menu_eng.id
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_menu_eng.parent_id
     *
     * @return the value of bt_view_menu_eng.parent_id
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_menu_eng.parent_id
     *
     * @param parentId the value for bt_view_menu_eng.parent_id
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_menu_eng.name
     *
     * @return the value of bt_view_menu_eng.name
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_menu_eng.name
     *
     * @param name the value for bt_view_menu_eng.name
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_menu_eng.sort_order
     *
     * @return the value of bt_view_menu_eng.sort_order
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_menu_eng.sort_order
     *
     * @param sortOrder the value for bt_view_menu_eng.sort_order
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_menu_eng.create_time
     *
     * @return the value of bt_view_menu_eng.create_time
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_menu_eng.create_time
     *
     * @param createTime the value for bt_view_menu_eng.create_time
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_menu_eng.creater
     *
     * @return the value of bt_view_menu_eng.creater
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    public String getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_menu_eng.creater
     *
     * @param creater the value for bt_view_menu_eng.creater
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_menu_eng.status
     *
     * @return the value of bt_view_menu_eng.status
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_menu_eng.status
     *
     * @param status the value for bt_view_menu_eng.status
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_menu_eng.path
     *
     * @return the value of bt_view_menu_eng.path
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_menu_eng.path
     *
     * @param path the value for bt_view_menu_eng.path
     *
     * @mbg.generated Thu Mar 21 14:40:43 CST 2019
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }
}
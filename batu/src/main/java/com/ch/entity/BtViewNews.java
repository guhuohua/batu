package com.ch.entity;

import java.util.Date;

public class BtViewNews {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_news.id
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_news.status
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_news.new_content
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    private String newContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_news.title
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_news.update_time
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_news.status_str
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    private String statusStr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_news.picture_url
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    private String pictureUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_news.new_category_id
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    private String newCategoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_news.menu_id
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    private String menuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_news.create_time
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_view_news.browse_number
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    private Integer browseNumber;

    private String creater;

    private String rangeApplication;

    public String getRangeApplication() {
        return rangeApplication;
    }

    public void setRangeApplication(String rangeApplication) {
        this.rangeApplication = rangeApplication;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_news.id
     *
     * @return the value of bt_view_news.id
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_news.id
     *
     * @param id the value for bt_view_news.id
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_news.status
     *
     * @return the value of bt_view_news.status
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_news.status
     *
     * @param status the value for bt_view_news.status
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_news.new_content
     *
     * @return the value of bt_view_news.new_content
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    public String getNewContent() {
        return newContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_news.new_content
     *
     * @param newContent the value for bt_view_news.new_content
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    public void setNewContent(String newContent) {
        this.newContent = newContent == null ? null : newContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_news.title
     *
     * @return the value of bt_view_news.title
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_news.title
     *
     * @param title the value for bt_view_news.title
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_news.update_time
     *
     * @return the value of bt_view_news.update_time
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_news.update_time
     *
     * @param updateTime the value for bt_view_news.update_time
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_news.status_str
     *
     * @return the value of bt_view_news.status_str
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    public String getStatusStr() {
        return statusStr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_news.status_str
     *
     * @param statusStr the value for bt_view_news.status_str
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr == null ? null : statusStr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_news.picture_url
     *
     * @return the value of bt_view_news.picture_url
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    public String getPictureUrl() {
        return pictureUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_news.picture_url
     *
     * @param pictureUrl the value for bt_view_news.picture_url
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_news.new_category_id
     *
     * @return the value of bt_view_news.new_category_id
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    public String getNewCategoryId() {
        return newCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_news.new_category_id
     *
     * @param newCategoryId the value for bt_view_news.new_category_id
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    public void setNewCategoryId(String newCategoryId) {
        this.newCategoryId = newCategoryId == null ? null : newCategoryId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_news.menu_id
     *
     * @return the value of bt_view_news.menu_id
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_news.menu_id
     *
     * @param menuId the value for bt_view_news.menu_id
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_news.create_time
     *
     * @return the value of bt_view_news.create_time
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_news.create_time
     *
     * @param createTime the value for bt_view_news.create_time
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_view_news.browse_number
     *
     * @return the value of bt_view_news.browse_number
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    public Integer getBrowseNumber() {
        return browseNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_view_news.browse_number
     *
     * @param browseNumber the value for bt_view_news.browse_number
     *
     * @mbg.generated Thu Mar 14 14:09:05 CST 2019
     */
    public void setBrowseNumber(Integer browseNumber) {
        this.browseNumber = browseNumber;
    }
}
package com.ch.entity;

import java.util.List;

public class BtSysMenu {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_menu.id
     *
     * @mbg.generated Mon Mar 18 16:47:12 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_menu.parent_id
     *
     * @mbg.generated Mon Mar 18 16:47:12 CST 2019
     */
    private String parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_menu.label
     *
     * @mbg.generated Mon Mar 18 16:47:12 CST 2019
     */
    private String label;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_menu.icon
     *
     * @mbg.generated Mon Mar 18 16:47:12 CST 2019
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_menu.component
     *
     * @mbg.generated Mon Mar 18 16:47:12 CST 2019
     */
    private String component;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_menu.path
     *
     * @mbg.generated Mon Mar 18 16:47:12 CST 2019
     */
    private String path;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_menu.sort_order
     *
     * @mbg.generated Mon Mar 18 16:47:12 CST 2019
     */
    private Integer sortOrder;

    private List<BtSysMenu> children;

    public List<BtSysMenu> getChildren() {
        return children;
    }

    public void setChildren(List<BtSysMenu> children) {
        this.children = children;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_menu.id
     *
     * @return the value of bt_sys_menu.id
     *
     * @mbg.generated Mon Mar 18 16:47:12 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_menu.id
     *
     * @param id the value for bt_sys_menu.id
     *
     * @mbg.generated Mon Mar 18 16:47:12 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_menu.parent_id
     *
     * @return the value of bt_sys_menu.parent_id
     *
     * @mbg.generated Mon Mar 18 16:47:12 CST 2019
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_menu.parent_id
     *
     * @param parentId the value for bt_sys_menu.parent_id
     *
     * @mbg.generated Mon Mar 18 16:47:12 CST 2019
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_menu.label
     *
     * @return the value of bt_sys_menu.label
     *
     * @mbg.generated Mon Mar 18 16:47:12 CST 2019
     */
    public String getLabel() {
        return label;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_menu.label
     *
     * @param label the value for bt_sys_menu.label
     *
     * @mbg.generated Mon Mar 18 16:47:12 CST 2019
     */
    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_menu.icon
     *
     * @return the value of bt_sys_menu.icon
     *
     * @mbg.generated Mon Mar 18 16:47:12 CST 2019
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_menu.icon
     *
     * @param icon the value for bt_sys_menu.icon
     *
     * @mbg.generated Mon Mar 18 16:47:12 CST 2019
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_menu.component
     *
     * @return the value of bt_sys_menu.component
     *
     * @mbg.generated Mon Mar 18 16:47:12 CST 2019
     */
    public String getComponent() {
        return component;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_menu.component
     *
     * @param component the value for bt_sys_menu.component
     *
     * @mbg.generated Mon Mar 18 16:47:12 CST 2019
     */
    public void setComponent(String component) {
        this.component = component == null ? null : component.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_menu.path
     *
     * @return the value of bt_sys_menu.path
     *
     * @mbg.generated Mon Mar 18 16:47:12 CST 2019
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_menu.path
     *
     * @param path the value for bt_sys_menu.path
     *
     * @mbg.generated Mon Mar 18 16:47:12 CST 2019
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_menu.sort_order
     *
     * @return the value of bt_sys_menu.sort_order
     *
     * @mbg.generated Mon Mar 18 16:47:12 CST 2019
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_menu.sort_order
     *
     * @param sortOrder the value for bt_sys_menu.sort_order
     *
     * @mbg.generated Mon Mar 18 16:47:12 CST 2019
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }
}
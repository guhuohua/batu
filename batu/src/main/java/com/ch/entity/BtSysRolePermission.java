package com.ch.entity;

public class BtSysRolePermission {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_role_permission.role_id
     *
     * @mbg.generated Tue Mar 12 15:34:19 CST 2019
     */
    private String roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bt_sys_role_permission.permission_id
     *
     * @mbg.generated Tue Mar 12 15:34:19 CST 2019
     */
    private String permissionId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_role_permission.role_id
     *
     * @return the value of bt_sys_role_permission.role_id
     *
     * @mbg.generated Tue Mar 12 15:34:19 CST 2019
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_role_permission.role_id
     *
     * @param roleId the value for bt_sys_role_permission.role_id
     *
     * @mbg.generated Tue Mar 12 15:34:19 CST 2019
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bt_sys_role_permission.permission_id
     *
     * @return the value of bt_sys_role_permission.permission_id
     *
     * @mbg.generated Tue Mar 12 15:34:19 CST 2019
     */
    public String getPermissionId() {
        return permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bt_sys_role_permission.permission_id
     *
     * @param permissionId the value for bt_sys_role_permission.permission_id
     *
     * @mbg.generated Tue Mar 12 15:34:19 CST 2019
     */
    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId == null ? null : permissionId.trim();
    }
}
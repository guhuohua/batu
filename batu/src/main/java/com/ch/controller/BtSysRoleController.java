package com.ch.controller;

import com.ch.base.ResponseResult;
import com.ch.dto.RoleDTO;
import com.ch.dto.RolePermissionDTO;
import com.ch.service.BtSysRoleService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping(value = "sys")
public class BtSysRoleController {

    private static final Logger LOGGER = LogManager.getLogger(BtSysRoleController.class);

    @Autowired
    BtSysRoleService btSysRoleService;

    @GetMapping(value = "role_list")
    @RequiresRoles(logical = Logical.AND, value = {"admin", "sysAdmin"})
    public ResponseResult roleList(HttpServletRequest req, HttpServletResponse res, @RequestParam int index, @RequestParam int size) {
        ResponseResult result = new ResponseResult();
        try {
            result = btSysRoleService.roleList(index, size);
        } catch (Exception e) {
            LOGGER.error("获取角色列表失败" + e.getMessage(), e);
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("获取角色列表失败");
        }
        return result;
    }

    @PostMapping(value = "insert_role")
    public ResponseResult insertRole(HttpServletRequest req, HttpServletResponse res, @RequestBody RoleDTO roleDTO) {
        ResponseResult result = new ResponseResult();
        try {
            result = btSysRoleService.insertRole(roleDTO);
        } catch (Exception e) {
            LOGGER.error("新增角色失败" + e.getMessage(), e);
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("新增角色失败");
        }
        return result;
    }

    @PostMapping(value = "delete_roles")
    public ResponseResult deleteRoles(HttpServletRequest req, HttpServletResponse res, @RequestBody List<String> roleIds) {
        ResponseResult result = new ResponseResult();
        try {
            result = btSysRoleService.deleteRoles(roleIds);
        } catch (Exception e) {
            LOGGER.error("删除角色失败" + e.getMessage(), e);
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("删除角色失败");
        }
        return result;
    }

    @PostMapping(value = "update_roles")
    public ResponseResult updateRoles(HttpServletRequest req, HttpServletResponse res, @RequestBody RoleDTO roleDTO) {
        ResponseResult result = new ResponseResult();
        try {
            result = btSysRoleService.editRole(roleDTO);
        } catch (Exception e) {
            LOGGER.error("编辑角色失败" + e.getMessage(), e);
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("编辑角色失败");
        }
        return result;
    }

    @GetMapping(value = "find_permission")
    public ResponseResult findPermission(HttpServletRequest req, HttpServletResponse res, @RequestParam String roleId) {
        ResponseResult result = new ResponseResult();
        try {
            result = btSysRoleService.findPermissionByRoleId(roleId);
        } catch (Exception e) {
            LOGGER.error("查询权限失败" + e.getMessage(), e);
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("查询权限失败");
        }
        return result;
    }

    @PostMapping(value = "save_permission")
    public ResponseResult savePermission(HttpServletRequest req, HttpServletResponse res, @RequestBody RolePermissionDTO rolePermissionDTO) {
        ResponseResult result = new ResponseResult();
        try {
            result = btSysRoleService.insertPermission(rolePermissionDTO);
        } catch (Exception e) {
            LOGGER.error("添加权限失败" + e.getMessage(), e);
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("添加权限失败");
        }
        return result;
    }
}

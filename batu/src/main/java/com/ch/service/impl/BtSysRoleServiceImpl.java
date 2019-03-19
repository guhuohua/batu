package com.ch.service.impl;

import com.ch.base.ResponseResult;
import com.ch.dao.BtSysPermissionMapper;
import com.ch.dao.BtSysRoleMapper;
import com.ch.dao.BtSysRolePermissionMapper;
import com.ch.dao.BtSysUserMapper;
import com.ch.entity.*;
import com.ch.model.RoleDTO;
import com.ch.model.RolePermissionDTO;
import com.ch.model.RolePermissionModel;
import com.ch.service.BtSysRoleService;
import com.ch.util.IdUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class BtSysRoleServiceImpl implements BtSysRoleService {

    @Autowired
    BtSysRoleMapper btSysRoleMapper;

    @Autowired
    BtSysRolePermissionMapper btSysRolePermissionMapper;

    @Autowired
    BtSysPermissionMapper btSysPermissionMapper;

    @Autowired
    BtSysUserMapper btSysUserMapper;

    @Override
    public ResponseResult roleList(int index, int size) {
        ResponseResult result = new ResponseResult();
        PageHelper.startPage(index, size);
        List<BtSysRole> btSysRoleList = btSysRoleMapper.selectByExample(null);
        PageInfo<BtSysRole> btSysRolePageInfo = new PageInfo<>(btSysRoleList);
        result.setData(btSysRolePageInfo);
        return result;
    }

    @Override
    public ResponseResult insertRole(RoleDTO roleDTO) {
        ResponseResult result = new ResponseResult();
        BtSysRole btSysRole = new BtSysRole();
        btSysRole.setRoleId(IdUtil.createIdByUUID());
        btSysRole.setRoleName(roleDTO.getRoleName());
        btSysRole.setRoleDesc(roleDTO.getRoleDesc());
        btSysRole.setCreateTime(new Date());
        btSysRole.setParentId(0);
        btSysRole.setUpdateTime(new Date());
        try {
            int insert = btSysRoleMapper.insert(btSysRole);
            result.setData(insert > 0 ? true :false);
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("新增角色失败");
            result.setData(false);
        }
        return result;
    }

    @Override
    @Transactional
    public ResponseResult deleteRoles(List<String> stringList) {
        ResponseResult result = new ResponseResult();
        BtSysRoleExample example = new BtSysRoleExample();
        example.createCriteria().andRoleIdIn(stringList);
        try {
            int delete = btSysRoleMapper.deleteByExample(example);
            result.setData(delete > 0 ? true :false);
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("删除角色失败");
            result.setData(false);
        }
        return result;
    }

    @Override
    public ResponseResult editRole(RoleDTO roleDTO) {
        ResponseResult result = new ResponseResult();
        BtSysRole btSysRole = new BtSysRole();
        btSysRole.setRoleId(roleDTO.getRoleId());
        btSysRole.setRoleName(roleDTO.getRoleName());
        btSysRole.setRoleDesc(roleDTO.getRoleDesc());
        try {
            int delete = btSysRoleMapper.update(btSysRole);
            result.setData(delete > 0 ? true :false);
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("更新角色失败");
            result.setData(false);
        }
        return result;
    }

    public Comparator<RolePermissionModel> order() {
        Comparator<RolePermissionModel> comparator = new Comparator<RolePermissionModel>() {
            @Override
            public int compare(RolePermissionModel o1, RolePermissionModel o2) {
                if (o1.getSortOrder() != o2.getSortOrder()) {
                    return o1.getSortOrder() - o2.getSortOrder();
                }
                return 0;
            }
        };
        return comparator;
    }

    @Override
    public ResponseResult findPermissionByRoleId(String roleId) {
        ResponseResult result = new ResponseResult();
        List<RolePermissionModel> allMenu = btSysUserMapper.findAll(roleId);
        //根节点
        List<RolePermissionModel> rootMenu = new ArrayList<RolePermissionModel>();
        for (RolePermissionModel nav : allMenu) {
            if (nav.getParentId().equals("0")) {
                rootMenu.add(nav);
            }
        }
        return result;
    }

    @Override
    @Transactional
    public ResponseResult insertPermission(RolePermissionDTO rolePermissionDTO) {
        ResponseResult result = new ResponseResult();
        String roleId = rolePermissionDTO.getRoleId();
        rolePermissionDTO.getPermissions().forEach(item -> {
            BtSysRolePermission btSysRolePermission = new BtSysRolePermission();
            btSysRolePermission.setRoleId(roleId);
            btSysRolePermission.setPermissionId(item);
            btSysRolePermissionMapper.insert(btSysRolePermission);
        });
        result.setData(true);
        return result;
    }

    @Override
    public ResponseResult roleList() {
        ResponseResult result = new ResponseResult();
        List<BtSysRole> btSysRoleList = btSysRoleMapper.selectByExample(null);
        result.setData(btSysRoleList);
        return result;
    }



}

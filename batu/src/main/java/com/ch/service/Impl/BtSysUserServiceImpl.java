package com.ch.service.Impl;

import com.ch.base.ResponseResult;
import com.ch.dao.*;
import com.ch.dto.UserDTO;
import com.ch.entity.*;
import com.ch.service.BtSysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class BtSysUserServiceImpl implements BtSysUserService {

    @Autowired
    BtSysUserMapper btSysUserMapper;

    @Autowired
    BtSysUserRoleMapper btSysUserRoleMapper;

    @Autowired
    BtSysRoleMapper btSysRoleMapper;

    @Autowired
    BtSysRolePermissionMapper btSysRolePermissionMapper;

    @Autowired
    BtSysPermissionMapper btSysPermissionMapper;

    @Override
    public UserDTO findById(String userId) {
        UserDTO dto = new UserDTO();
        BtSysUser user = btSysUserMapper.findByUserId(userId);
        if (user != null) {
            dto.setUserId(userId);
            dto.setPassword(user.getPassword());
            dto.setUserName(user.getUsername());
            List<BtSysUserRole> btSysUserRoles = btSysUserRoleMapper.findByUserId(userId);
            Set<String> roles = new HashSet<>();
            Set<String> permissions = new HashSet<>();
            btSysUserRoles.stream().forEach(userRole -> {
                BtSysRoleExample btSysRoleExample = new BtSysRoleExample();
                btSysRoleExample.createCriteria().andRoleIdEqualTo(userRole.getRoleId());
                List<BtSysRole> roleList = btSysRoleMapper.selectByExample(btSysRoleExample);
                roleList.forEach(role -> {
                    roles.add(role.getRoleName());
                });
                BtSysRolePermissionExample btSysRolePermissionExample = new BtSysRolePermissionExample();
                btSysRolePermissionExample.createCriteria().andRoleIdEqualTo(userRole.getRoleId());
                List<BtSysRolePermission> btSysRolePermissions = btSysRolePermissionMapper.selectByExample(btSysRolePermissionExample);
                btSysRolePermissions.forEach(rolePermission -> {
                    BtSysPermissionExample btSysPermissionExample= new BtSysPermissionExample();
                    btSysPermissionExample.createCriteria().andPermissionIdEqualTo(rolePermission.getPermissionId());
                    btSysPermissionMapper.selectByExample(btSysPermissionExample).forEach(permission -> {
                        permissions.add(permission.getName());
                    });
                });
            });
            dto.setRoles(roles);
            dto.setPermissions(permissions);
        }
        return dto;
    }

    @Override
    public ResponseResult login(UserDTO userDTO) {
        ResponseResult result = new ResponseResult();
        if (userDTO.getUserName() == null) {
            result.setCode(500);
            result.setError("用户名不能为空");
            result.setError_description("用户名不能为空");
            return result;
        }
        if (userDTO.getPassword() == null) {
            result.setCode(500);
            result.setError("密码不能为空");
            result.setError_description("密码不能为空");
            return result;
        }
        BtSysUserExample example = new BtSysUserExample();
        example.createCriteria().andUsernameEqualTo(userDTO.getUserName()).andPasswordEqualTo(userDTO.getPassword());
        BtSysUser user = btSysUserMapper.selectByExample(example).stream().findFirst().get();
        if (user == null) {
            result.setCode(500);
            result.setError("用户名或密码输入错误，请重新输入~");
            result.setError_description("用户名或密码输入错误，请重新输入~");
            return result;
        }
        UserDTO dto = findById(user.getUserId());
        result.setData(dto);
        return result;
    }
}

package com.ch.service;

import com.ch.base.ResponseResult;
import com.ch.dto.UserDTO;
import com.ch.entity.BtSysUser;

public interface BtSysUserService {

    /**
     * 根据主键ID进行查找实体对象
     * @param userId
     * @return
     */
    UserDTO findById(String userId);

    /**
     * 登录
     * @param userDTO
     * @return
     */
    ResponseResult login(UserDTO userDTO);
}

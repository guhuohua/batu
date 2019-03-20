package com.ch.service;

import com.ch.base.ResponseResult;
import com.ch.entity.BtSysMenu;

public interface BtSysMenuService {

    public ResponseResult findTree(String userId);
    public ResponseResult add(BtSysMenu btSysMenu);
    public ResponseResult update(BtSysMenu btSysMenu);
    public ResponseResult dele(Integer id);
}

package com.ch.service.impl;

import com.ch.base.ResponseResult;
import com.ch.dao.BtSysMenuMapper;
import com.ch.dao.BtSysPermissionMapper;
import com.ch.dao.BtSysRolePermissionMapper;
import com.ch.dao.BtSysUserRoleMapper;
import com.ch.entity.*;
import com.ch.service.BtSysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
@Transactional
public class BtSysMenuServiceImpl implements BtSysMenuService {
    @Autowired
    private BtSysMenuMapper btSysMenuMapper;



    @Override
    public ResponseResult findTree(String userId) {

        return null;
    }

    @Override
    public ResponseResult add(BtSysMenu btSysMenu) {
        ResponseResult result = new ResponseResult();
        btSysMenuMapper.insert(btSysMenu);
        return result;
    }

    @Override
    public ResponseResult update(BtSysMenu btSysMenu) {
       ResponseResult result = new ResponseResult();
        btSysMenuMapper.updateByPrimaryKey(btSysMenu);
        return result;
    }

    @Override
    public ResponseResult dele(Integer id) {
        ResponseResult result = new ResponseResult();

        BtSysMenu btSysMenu = btSysMenuMapper.selectByPrimaryKey(id);
        if(btSysMenu.getParentId()==0){

            BtSysMenuExample example = new BtSysMenuExample();
            BtSysMenuExample.Criteria criteria = example.createCriteria();
            criteria.andParentIdEqualTo(id);
            List<BtSysMenu> btViewMenus = btSysMenuMapper.selectByExample(example);
            if (btViewMenus!=null){
                for (BtSysMenu btSysMenu1 :btViewMenus){
                   // System.out.println(btSysMenu1.getId());
                    BtSysMenuExample example1 = new BtSysMenuExample();
                    BtSysMenuExample.Criteria criteria1 = example1.createCriteria();
                    criteria1.andParentIdEqualTo(btSysMenu1.getId());
                    List<BtSysMenu> btSysMenus = btSysMenuMapper.selectByExample(example1);

                   for (BtSysMenu btSysMenu2 :btSysMenus ){
                        btSysMenuMapper.deleteByPrimaryKey(btSysMenu2.getId());
                    }
                    btSysMenuMapper.deleteByPrimaryKey(btSysMenu1.getId());

                   /* BtSysMenuExample example1 = new BtSysMenuExample();
                    BtSysMenuExample.Criteria criteria1 = example.createCriteria();
                    criteria.andParentIdEqualTo(btSysMenu1.getId()+"");
                    List<BtSysMenu> btSysMenus = btSysMenuMapper.selectByExample(example1);
                    for (BtSysMenu btSysMenu2 :btSysMenus ){
                        btSysMenuMapper.deleteByExample(example1);
                    }*/
                }
            }else {
                btSysMenuMapper.deleteByPrimaryKey(id);
            }
            btSysMenuMapper.deleteByPrimaryKey(id);
        }else {
            BtSysMenuExample example = new BtSysMenuExample();
            BtSysMenuExample.Criteria criteria = example.createCriteria();
            criteria.andParentIdEqualTo(id);
            List<BtSysMenu> btSysMenus = btSysMenuMapper.selectByExample(example);
            if (btSysMenus!=null){
                for (BtSysMenu btSysMenus1 :btSysMenus){
                    btSysMenuMapper.deleteByExample(example);
                }
                btSysMenuMapper.deleteByPrimaryKey(id);
            }else {
                btSysMenuMapper.deleteByPrimaryKey(id);
            }
        }

        return result;
    }
}

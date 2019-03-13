package com.ch.service.Impl;

import com.ch.base.ResponseResult;
import com.ch.dao.BtViewMenuMapper;
import com.ch.entity.BtViewMenu;
import com.ch.entity.BtViewMenuExample;
import com.ch.service.BtSysUserService;
import com.ch.service.BtViewMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class BtViewMenuServiceImpl implements BtViewMenuService {
    @Autowired
    private BtViewMenuMapper btViewMenuMapper;

    @Override
    public long countByExample(BtViewMenuExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(BtViewMenuExample example) {
        return 0;
    }

    @Override
    public int insert(BtViewMenu record) {
        return 0;
    }

    @Override
    public int insertSelective(BtViewMenu record) {
        return 0;
    }

    @Override
    public List<BtViewMenu> selectByExample(BtViewMenuExample example) {
        return null;
    }

    @Override
    public int updateByExampleSelective(BtViewMenu record, BtViewMenuExample example) {
        return 0;
    }

    @Override
    public int updateByExample(BtViewMenu record, BtViewMenuExample example) {
        return 0;
    }

    @Override
    public ResponseResult findTree() {
        ResponseResult result = new ResponseResult();
        Map<String,Object> data = new HashMap<String,Object>();
        try {//查询所有菜单
            List<BtViewMenu> allMenu = btViewMenuMapper.selectByExample(null);
            //根节点
            List<BtViewMenu> rootMenu = new ArrayList<BtViewMenu>();
            for (BtViewMenu nav : allMenu) {
                if(nav.getParentId()!=null){
                    rootMenu.add(nav);
                }
            }
            /* 根据Menu类的order排序 */
            Collections.sort(rootMenu, order());
            //为根菜单设置子菜单，getClild是递归调用的
            for (BtViewMenu nav : rootMenu) {
                /* 获取根节点下的所有子节点 使用getChild方法*/
                List<BtViewMenu> childList = getChild(nav.getId(), allMenu);
                nav.setChildren(childList);//给根节点设置子节点
            }
            /**
             * 输出构建好的菜单数据。
             *
             */
            result.setCode(0);
            result.setData(rootMenu);
            return result;
        } catch (Exception e) {
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("菜单生成异常");
            return result;
        }


    }

    public List<BtViewMenu> getChild(String id,List<BtViewMenu> allMenu){
        //子菜单
        List<BtViewMenu> childList = new ArrayList<BtViewMenu>();
        for (BtViewMenu nav : allMenu) {
            // 遍历所有节点，将所有菜单的父id与传过来的根节点的id比较
            //相等说明：为该根节点的子节点。
            if((nav.getParentId()!=null) && nav.getParentId().equals(id)){
                childList.add(nav);
            }
        }
        //递归
        for (BtViewMenu nav : childList) {
            nav.setChildren(getChild(nav.getId(), allMenu));
        }
        Collections.sort(childList,order());//排序
        //如果节点下没有子节点，返回一个空List（递归退出）
        if(childList.size() == 0){
            return new ArrayList<BtViewMenu>();
        }
        return childList;
    }
    public Comparator<BtViewMenu> order(){
        Comparator<BtViewMenu> comparator = new Comparator<BtViewMenu>() {
            @Override
            public int compare(BtViewMenu o1, BtViewMenu o2) {
                if(o1.getSortOrder()!= o2.getSortOrder()){
                    return o1.getSortOrder() - o2.getSortOrder();
                }
                return 0;
            }
        };
        return comparator;
    }


}

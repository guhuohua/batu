package com.ch.service.impl;

import com.ch.base.ResponseResult;
import com.ch.dao.BtSysMenuMapper;
import com.ch.entity.BtSysMenu;
import com.ch.service.BtSysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
@Service
public class BtSysMenuServiceImpl implements BtSysMenuService {
   @Autowired
   private BtSysMenuMapper btSysMenuMapper;
    @Override
    public ResponseResult findTree() {
        ResponseResult result = new ResponseResult();
        try {//查询所有菜单
            List<BtSysMenu> allMenu = btSysMenuMapper.selectByExample(null);
            //根节点
            List<BtSysMenu> rootMenu = new ArrayList<BtSysMenu>();
            for (BtSysMenu nav : allMenu) {
                if (nav.getParentId().equals("0")) {
                    rootMenu.add(nav);
                }
            }
            /* 根据Menu类的order排序 */
            Collections.sort(rootMenu, order());
            //为根菜单设置子菜单，getClild是递归调用的
            for (BtSysMenu nav : rootMenu) {
                /* 获取根节点下的所有子节点 使用getChild方法*/
                List<BtSysMenu> childList = getChild(nav.getId(), allMenu);
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


    public List<BtSysMenu> getChild(String id, List<BtSysMenu> allMenu) {
        //子菜单
        List<BtSysMenu> childList = new ArrayList<BtSysMenu>();
        for (BtSysMenu nav : allMenu) {
            // 遍历所有节点，将所有菜单的父id与传过来的根节点的id比较
            //相等说明：为该根节点的子节点。
            if ((nav.getParentId() != null) && nav.getParentId().equals(id)) {
                childList.add(nav);
            }
        }
        //递归
        for (BtSysMenu nav : childList) {
            nav.setChildren(getChild(nav.getId(), allMenu));
        }
        Collections.sort(childList, order());//排序
        //如果节点下没有子节点，返回一个空List（递归退出）
        if (childList.size() == 0) {
            return new ArrayList<BtSysMenu>();
        }
        return childList;
    }

    public Comparator<BtSysMenu> order() {
        Comparator<BtSysMenu> comparator = new Comparator<BtSysMenu>() {
            @Override
            public int compare(BtSysMenu o1, BtSysMenu o2) {
                if (o1.getSortOrder() != o2.getSortOrder()) {
                    return o1.getSortOrder() - o2.getSortOrder();
                }
                return 0;
            }
        };
        return comparator;
    }
}

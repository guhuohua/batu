package com.ch.service.impl;

import com.ch.base.ResponseResult;
import com.ch.dao.ViewMenuMapper;
import com.ch.entity.ViewMenu;
import com.ch.entity.ViewMenuExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class ViewMenuServiceImpl implements ViewMenuMapper{

    @Resource
    private ViewMenuMapper viewMenuMapper;
    @Override
    public int countByExample(ViewMenuExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(ViewMenu record) {
        return 0;
    }

    @Override
    public int insertSelective(ViewMenu record) {
        return 0;
    }

    @Override
    public List<ViewMenu> selectByExample(ViewMenuExample example) {
        return null;
    }

    @Override
    public ViewMenu selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(ViewMenu record, ViewMenuExample example) {
        return 0;
    }

    @Override
    public int updateByExample(ViewMenu record, ViewMenuExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(ViewMenu record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(ViewMenu record) {
        return 0;
    }

    @Override
    public ResponseResult findMenuTree() {
        ResponseResult result = new ResponseResult();
        Map<String,Object> data = new HashMap<String,Object>();
        try {//查询所有菜单
            List<ViewMenu> allMenu = viewMenuMapper.findAllMenu();
            //根节点
            List<ViewMenu> rootMenu = new ArrayList<ViewMenu>();
            for (ViewMenu viewMenu : allMenu) {

                    rootMenu.add(viewMenu);

            }
            /* 根据Menu类的order排序 */
            Collections.sort(rootMenu, order());
            //为根菜单设置子菜单，getClild是递归调用的
            for (ViewMenu nav : rootMenu) {
                /* 获取根节点下的所有子节点 使用getChild方法*/
                List<ViewMenuMapper> childList = getChild(nav.getId(), allMenu);
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

    public List<ViewMenu> getChild(Long id,List<ViewMenu> allMenu){
        //子菜单
        List<ViewMenu> childList = new ArrayList<ViewMenu>();
        for (ViewMenu nav : allMenu) {
            // 遍历所有节点，将所有菜单的父id与传过来的根节点的id比较
            //相等说明：为该根节点的子节点。
            if( nav.getParentId().equals(id)){
                childList.add(nav);
            }
        }
        //递归
        for (ViewMenu nav : childList) {
            nav.setChildren(getChild(nav.getId(), allMenu));
        }
        Collections.sort(childList,order());//排序
        //如果节点下没有子节点，返回一个空List（递归退出）
        if(childList.size() == 0){
            return new ArrayList<TestMenuDO>();
        }
        return childList;
    }
    /*
     * 排序,根据order排序
     */
    public Comparator<ViewMenu> order(){
        Comparator<ViewMenu> comparator = new Comparator<ViewMenu>() {
            @Override
            public int compare(ViewMenu o1, ViewMenu o2) {
                if(o1.getSortOrder() != o2.getSortOrder()){
                    return o1.getSortOrder() - o2.getSortOrder();
                }
                return 0;
            }
        };
        return comparator;
    }
}



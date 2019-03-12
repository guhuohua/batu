package com.ch.dao;

import com.ch.base.ResponseResult;
import com.ch.entity.ViewMenu;
import com.ch.entity.ViewMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewMenuMapper {
    int countByExample(ViewMenuExample example);

    int deleteByPrimaryKey(String id);

    int insert(ViewMenu record);

    int insertSelective(ViewMenu record);

    List<ViewMenu> selectByExample(ViewMenuExample example);

    ViewMenu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ViewMenu record, @Param("example") ViewMenuExample example);

    int updateByExample(@Param("record") ViewMenu record, @Param("example") ViewMenuExample example);

    int updateByPrimaryKeySelective(ViewMenu record);

    int updateByPrimaryKey(ViewMenu record);

    /**
     * 展示网站首页菜单导航栏
     * @return
     */
    ResponseResult findMenuTree();

    /**
     * 查询所有的菜单
     * @return
     */
    List<ViewMenu> findAllMenu();



}
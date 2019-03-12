package com.ch.service;

import com.ch.base.ResponseResult;
import com.ch.entity.ViewMenu;
import com.ch.entity.ViewMenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ViewMenuService {
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
}

package com.ch.dao;

import com.ch.entity.BtViewNewsFan;
import com.ch.entity.BtViewNewsFanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BtViewNewsFanMapper {
    int countByExample(BtViewNewsFanExample example);

    int deleteByExample(BtViewNewsFanExample example);

    int deleteByPrimaryKey(String id);

    int insert(BtViewNewsFan record);

    int insertSelective(BtViewNewsFan record);

    List<BtViewNewsFan> selectByExample(BtViewNewsFanExample example);

    BtViewNewsFan selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BtViewNewsFan record, @Param("example") BtViewNewsFanExample example);

    int updateByExample(@Param("record") BtViewNewsFan record, @Param("example") BtViewNewsFanExample example);

    int updateByPrimaryKeySelective(BtViewNewsFan record);

    int updateByPrimaryKey(BtViewNewsFan record);
}
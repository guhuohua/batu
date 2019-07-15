package com.ch.dao;

import com.ch.entity.FeedBack;

public interface FeedBackMapper {
    int insert(FeedBack record);

    int insertSelective(FeedBack record);
}
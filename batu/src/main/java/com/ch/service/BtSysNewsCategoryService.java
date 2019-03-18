package com.ch.service;

import com.ch.base.ResponseResult;
import com.ch.entity.BtViewNews;
import com.ch.entity.BtViewNewsCategory;

import java.util.List;

public interface BtSysNewsCategoryService {
    /**
     * 增加
     * @param record
     * @return
     */
    public ResponseResult insert(BtViewNewsCategory record);

    /**
     * 编辑
     * @param record
     * @return
     */
    public ResponseResult updateByPrimaryKey(BtViewNewsCategory record);

    /**
     * 删除
     * @param id
     * @return
     */


    public ResponseResult delete(Integer id);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    public ResponseResult delete(List<Integer> ids);

}

package com.ch.service.impl;

import com.ch.base.ResponseResult;
import com.ch.dao.BtViewNewsCategoryMapper;
import com.ch.entity.BtViewNewsCategory;
import com.ch.service.BtSysNewsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BtSysNewsCategoryServiceImpl implements BtSysNewsCategoryService {
    @Autowired
    private BtViewNewsCategoryMapper btViewNewsCategoryMapper;
    ResponseResult result = new ResponseResult();
    @Override
    public ResponseResult insert(BtViewNewsCategory record) {
        btViewNewsCategoryMapper.insert(record);
        return result;
    }

    @Override
    public ResponseResult updateByPrimaryKey(BtViewNewsCategory record) {
        btViewNewsCategoryMapper.updateByPrimaryKey(record);
        return result;
    }

    @Override
    public ResponseResult delete(String id) {
        btViewNewsCategoryMapper.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public ResponseResult delete(List<String> ids) {
        for (String id : ids){
            btViewNewsCategoryMapper.deleteByPrimaryKey(id);
        }
        return result;
    }
}

package com.ch.service.impl;

import com.ch.base.ResponseResult;
import com.ch.dao.BtViewMessageMapper;
import com.ch.entity.BtViewMessage;
import com.ch.entity.BtViewMessageExample;
import com.ch.service.BtViewMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class BtViewMessageServiceImpl implements BtViewMessageService {
   @Autowired
    private BtViewMessageMapper btViewMessageMapper;

    @Override
    public long countByExample(BtViewMessageExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(BtViewMessageExample example) {
        return 0;
    }

    @Override
    public ResponseResult insert(BtViewMessage record) {
        ResponseResult result =new ResponseResult();
        record.setMessageTime(new Date());
        btViewMessageMapper.insert(record);
        return result;
    }

    @Override
    public int insertSelective(BtViewMessage record) {
        return 0;
    }

    @Override
    public List<BtViewMessage> selectByExampleWithBLOBs(BtViewMessageExample example) {
        return null;
    }

    @Override
    public List<BtViewMessage> selectByExample(BtViewMessageExample example) {
        return null;
    }

    @Override
    public int updateByExampleSelective(BtViewMessage record, BtViewMessageExample example) {
        return 0;
    }

    @Override
    public int updateByExampleWithBLOBs(BtViewMessage record, BtViewMessageExample example) {
        return 0;
    }

    @Override
    public int updateByExample(BtViewMessage record, BtViewMessageExample example) {
        return 0;
    }
}

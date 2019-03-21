package com.ch.service.impl;

import com.ch.base.ResponseResult;
import com.ch.dao.BtViewNewsEngMapper;
import com.ch.dao.BtViewNewsMapper;
import com.ch.entity.BtViewNews;
import com.ch.entity.BtViewNewsEng;
import com.ch.entity.BtViewNewsEngExample;
import com.ch.entity.BtViewNewsExample;
import com.ch.service.BtViewNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class BtViewNewsServiceImpl implements BtViewNewsService {

    @Autowired
    private BtViewNewsMapper btViewNewsMapper;

    @Autowired
    BtViewNewsEngMapper btViewNewsEngMapper;


    @Override
    public long countByExample(BtViewNewsExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(BtViewNewsExample example) {
        return 0;
    }

    @Override
    public int insert(BtViewNews record) {
        return 0;
    }

    @Override
    public int insertSelective(BtViewNews record) {
        return 0;
    }

    @Override
    public List<BtViewNews> selectByExampleWithBLOBs(BtViewNewsExample example) {
        return null;
    }

    @Override
    public List<BtViewNews> selectByExample(BtViewNewsExample example) {

        return null;
    }

    @Override
    public int updateByExampleSelective(BtViewNews record, BtViewNewsExample example) {
        return 0;
    }

    @Override
    public int updateByExampleWithBLOBs(BtViewNews record, BtViewNewsExample example) {
        return 0;
    }

    @Override
    public int updateByExample(BtViewNews record, BtViewNewsExample example) {
        return 0;
    }

    @Override
    public ResponseResult findViewNewsByMenuId(String menuId) {

        BtViewNewsExample example = new BtViewNewsExample();
        BtViewNewsExample.Criteria criteria = example.createCriteria();
        criteria.andMenuIdEqualTo(menuId);

        List<BtViewNews> newsList = btViewNewsMapper.selectByExample(example);
        for(BtViewNews btViewNews :  newsList){
            Integer browseNumber = btViewNews.getBrowseNumber();
            btViewNews.setBrowseNumber(++browseNumber);
            btViewNewsMapper.updateByPrimaryKey(btViewNews);
        }
        ResponseResult result = new ResponseResult();
        result.setData(newsList);
        return result;
    }

    @Override
    public ResponseResult findViewNewsEngByMenuId(String menuId) {
        BtViewNewsEngExample example = new BtViewNewsEngExample();
        BtViewNewsEngExample.Criteria criteria = example.createCriteria();
        criteria.andMenuIdEqualTo(menuId);
        List<BtViewNewsEng> newsList = btViewNewsEngMapper.selectByExample(example);
        for(BtViewNewsEng btViewNews :  newsList){
            Integer browseNumber = btViewNews.getBrowseNumber();
            btViewNews.setBrowseNumber(++browseNumber);
            btViewNewsEngMapper.updateByPrimaryKey(btViewNews);
        }
        ResponseResult result = new ResponseResult();
        result.setData(newsList);
        return result;
    }
}

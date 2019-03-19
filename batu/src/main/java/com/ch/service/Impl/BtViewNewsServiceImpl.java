package com.ch.service.Impl;

import com.ch.base.ResponseResult;
import com.ch.dao.BtViewNewsMapper;
import com.ch.entity.BtViewNews;
import com.ch.entity.BtViewNewsExample;
import com.ch.service.BtViewNewsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BtViewNewsServiceImpl implements BtViewNewsService {

    @Autowired
    private BtViewNewsMapper btViewNewsMapper;

    public static int count=0;


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


}

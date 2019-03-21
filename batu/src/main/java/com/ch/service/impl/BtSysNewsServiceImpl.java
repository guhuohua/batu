package com.ch.service.impl;

import com.ch.base.ResponseResult;
import com.ch.dao.BtViewNewsCategoryMapper;
import com.ch.dao.BtViewNewsEngMapper;
import com.ch.dao.BtViewNewsMapper;
import com.ch.dto.NewsParam;
import com.ch.entity.*;
import com.ch.service.BtSysNewsService;
import com.ch.util.BaiduTranslateUtil;
import com.ch.util.IdUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class BtSysNewsServiceImpl implements BtSysNewsService {
    @Autowired
    private BtViewNewsMapper btViewNewsMapper;
    @Autowired
    private BtViewNewsCategoryMapper btViewNewsCategoryMapper;

    @Autowired
    BtViewNewsEngMapper btViewNewsEngMapper;
    @Autowired
    BaiduTranslateUtil baiduTranslateUtil;


    @Override
    public long countByExample(BtViewNewsExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(BtViewNewsExample example) {
        return 0;
    }


    @Override
    public int insertSelective(BtViewNews record) {
        return 0;
    }

    @Override
    public List<BtViewNews> selectByExample(BtViewNewsExample example) {
        return null;
    }

    @Override
    public int updateByExampleSelective(BtViewNews record, BtViewNewsExample example) {
        return 0;
    }


    /**
     * 分页展示
     *
     * @return
     */
   /* @Override
    public ResponseResult findPage(NewsParam newsParam) {
        ResponseResult result = new ResponseResult();
        PageHelper.startPage(newsParam.getPageNum(), newsParam.getPageSize());
        List<BtViewNews> btViewNews = btViewNewsMapper.selectByExample(null);
        PageInfo<BtViewNews> page = new PageInfo<>(btViewNews);
        result.setData(page);
        return result;


    }*/
    @Override
    @Transactional
    public ResponseResult insert(BtViewNews record) {
        record.setCreateTime(new Date());
        String uuid = IdUtil.createIdByUUID();
        record.setId(uuid);
        record.setStatus(0);
        record.setStatusStr("zh");
        btViewNewsMapper.insert(record);
        BtViewNewsEng btViewNewsEng = new BtViewNewsEng();
        btViewNewsEng.setId(uuid);
        btViewNewsEng.setCreateTime(new Date());
        btViewNewsEng.setUpdateTime(new Date());
        btViewNewsEng.setBrowseNumber(record.getBrowseNumber());
        btViewNewsEng.setMenuId(record.getMenuId());
        btViewNewsEng.setNewCategoryId(record.getNewCategoryId());
        btViewNewsEng.setNewContent(baiduTranslateUtil.translate(record.getNewContent()));
        btViewNewsEng.setPictureUrl(record.getPictureUrl());
        btViewNewsEng.setStatusStr("en");
        btViewNewsEng.setTitle(baiduTranslateUtil.translate(record.getTitle()));
        btViewNewsEng.setStatus(record.getStatus());
        btViewNewsEngMapper.insert(btViewNewsEng);
        ResponseResult result = new ResponseResult();

        return result;
    }

    @Override
    @Transactional
    public ResponseResult delete(List<String> ids) {
        for (String id : ids) {
            BtViewNewsExample example = new BtViewNewsExample();
            BtViewNewsExample.Criteria criteria = example.createCriteria();
            criteria.andIdEqualTo(id);
            btViewNewsMapper.deleteByExample(example);
            BtViewNewsEngExample engExample = new BtViewNewsEngExample();
            engExample.createCriteria().andIdEqualTo(id);
            btViewNewsEngMapper.deleteByExample(engExample);
        }
        ResponseResult result = new ResponseResult();

        return result;
    }

    @Override
    @Transactional
    public ResponseResult updateByPrimaryKey(BtViewNews record) {
        ResponseResult result = new ResponseResult();
        record.setUpdateTime(new Date());
        btViewNewsMapper.updateByPrimaryKey(record);
        BtViewNewsEng btViewNewsEng = btViewNewsEngMapper.findById(record.getId());
        btViewNewsEng.setTitle(baiduTranslateUtil.translate(record.getTitle()));
        btViewNewsEng.setUpdateTime(new Date());
        btViewNewsEng.setNewContent(baiduTranslateUtil.translate(record.getNewContent()));
        btViewNewsEngMapper.updateByPrimaryKey(btViewNewsEng);
        return result;
    }

    @Override
    public ResponseResult updateStatus(String id, int status) {

        ResponseResult result = new ResponseResult();

        btViewNewsMapper.updateStatus(id, status);


        return result;
    }

    /**
     * 分页展示
     *
     * @return
     */
    @Override
    public ResponseResult findPage(NewsParam newsParam) {

        PageHelper.startPage(newsParam.getPageNum(), newsParam.getPageSize());

        BtViewNewsExample example = new BtViewNewsExample();
        BtViewNewsExample.Criteria criteria = example.createCriteria();
        BtViewNewsCategoryExample categoryExample = new BtViewNewsCategoryExample();
        BtViewNewsCategoryExample.Criteria categoryCriteria = categoryExample.createCriteria();

        if (newsParam != null) {
            if (newsParam.getTitle() != null && newsParam.getTitle().length() > 0) {
                criteria.andTitleLike("%" + newsParam.getTitle() + "%");

            }
            if (newsParam.getCategoryId() != null && newsParam.getCategoryId().length() > 0) {
                criteria.andNewCategoryIdEqualTo(newsParam.getCategoryId());

            } else if (newsParam.getPageNum()>0 && newsParam.getPageSize()>0){
                List<BtViewNews> btViewNews = btViewNewsMapper.selectByExample(null);
                PageInfo<BtViewNews> page = new PageInfo<>(btViewNews);
                ResponseResult result = new ResponseResult();
                result.setData(page);
                return result;
            }


        }
        List<BtViewNews> btViewNews = btViewNewsMapper.selectByExample(example);
        PageInfo<BtViewNews> page = new PageInfo<>(btViewNews);
        ResponseResult result = new ResponseResult();
        result.setData(page);
        return result;
    }
}






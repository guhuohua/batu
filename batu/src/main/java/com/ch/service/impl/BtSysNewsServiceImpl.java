package com.ch.service.impl;

import com.ch.base.ResponseResult;
import com.ch.dao.*;
import com.ch.dto.NewsParam;
import com.ch.entity.*;
import com.ch.model.NewsPageDTO;
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
    @Autowired
    BtSysUserMapper btSysUserMapper;

    @Autowired
    BtViewNewsFanMapper btViewNewsFanMapper;


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
    public ResponseResult insert(BtViewNews record, String userId) {
        record.setCreateTime(new Date());
        String uuid = IdUtil.createIdByUUID();
        record.setId(uuid);
        record.setStatus(0);
        record.setStatusStr("zh");
        record.setBrowseNumber(0);
        record.setCreateTime(new Date());
        BtSysUserExample example = new BtSysUserExample();
        BtSysUserExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<BtSysUser> btSysUsers = btSysUserMapper.selectByExample(example);
        record.setCreater(btSysUsers.get(0).getUsername());
        btViewNewsMapper.insert(record);


        BtViewNewsEng btViewNewsEng = new BtViewNewsEng();
        btViewNewsEng.setId(uuid);
        btViewNewsEng.setCreateTime(new Date());
        btViewNewsEng.setBrowseNumber(record.getBrowseNumber());
        btViewNewsEng.setMenuId(record.getMenuId());
        btViewNewsEng.setNewCategoryId(record.getNewCategoryId());
        btViewNewsEng.setNewContent(baiduTranslateUtil.translate(record.getNewContent()));
        btViewNewsEng.setPictureUrl(record.getPictureUrl());
        btViewNewsEng.setStatusStr("en");
        btViewNewsEng.setTitle(baiduTranslateUtil.translate(record.getTitle()));
        btViewNewsEng.setStatus(0);
        btViewNewsEngMapper.insert(btViewNewsEng);

        BtViewNewsFan btViewNewsFan = new BtViewNewsFan();
        btViewNewsFan.setId(uuid);
        btViewNewsFan.setCreateTime(new Date());
        btViewNewsFan.setUpdateTime(new Date());
        btViewNewsFan.setBrowseNumber(record.getBrowseNumber());
        btViewNewsFan.setMenuId(record.getMenuId());
        btViewNewsFan.setNewCategoryId(record.getNewCategoryId());
        btViewNewsFan.setNewContent(baiduTranslateUtil.translateFan(record.getNewContent()));
        btViewNewsFan.setPictureUrl(record.getPictureUrl());
        btViewNewsFan.setStatusStr("en");
        btViewNewsFan.setTitle(baiduTranslateUtil.translateFan(record.getTitle()));
        btViewNewsFan.setStatus(0);
        btViewNewsFanMapper.insert(btViewNewsFan);
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
            BtViewNewsFanExample fanExample = new BtViewNewsFanExample();
            fanExample.createCriteria().andIdEqualTo(id);
            btViewNewsFanMapper.deleteByExample(fanExample);

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


        BtViewNewsFan btViewNewsFan = btViewNewsFanMapper.findById(record.getId());
        btViewNewsFan.setTitle(baiduTranslateUtil.translateFan(record.getTitle()));
        btViewNewsFan.setUpdateTime(new Date());
        btViewNewsFan.setNewContent(baiduTranslateUtil.translateFan(record.getNewContent()));
        btViewNewsFanMapper.updateByPrimaryKey(btViewNewsFan);

        return result;
    }

    @Override
    public ResponseResult updateStatus(String id, int status) {

        ResponseResult result = new ResponseResult();
        if (status == 1) {
            btViewNewsMapper.updateStatus(id, status);
        } else {
            btViewNewsMapper.updateDate(id, status);
        }

        btViewNewsEngMapper.updateStatus(id, status);
        btViewNewsFanMapper.updateStatus(id, status);

        return result;
    }

    /**
     * 分页展示
     *
     * @return
     */
    @Override
    public ResponseResult findPage(NewsParam newsParam) {
        PageHelper.startPage(newsParam.getIndex(), newsParam.getSize());
        List<NewsPageDTO> btViewNews = btViewNewsMapper.findPage(newsParam);
        PageInfo<NewsPageDTO> page = new PageInfo<>(btViewNews);
        ResponseResult result = new ResponseResult();
        result.setData(page);
        return result;
    }

    public ResponseResult findById(String id) {
        ResponseResult result = new ResponseResult();
        BtViewNews btViewNews = btViewNewsMapper.selectByPrimaryKey(id);
        result.setData(btViewNews);
        return result;

    }
}






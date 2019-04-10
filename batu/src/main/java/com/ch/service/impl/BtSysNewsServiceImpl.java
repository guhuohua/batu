package com.ch.service.impl;

import com.ch.base.ResponseResult;
import com.ch.dao.*;
import com.ch.dto.BtViewNewsDto;
import com.ch.dto.NewsParam;
import com.ch.entity.*;
import com.ch.model.NewsPageDTO;
import com.ch.service.BtSysNewsService;
import com.ch.util.BaiduTranslateUtil;
import com.ch.util.IdUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Example;
import org.modelmapper.ModelMapper;
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
    BtViewMenuMapper btViewMenuMapper;

    @Autowired
    BtViewNewsFanMapper btViewNewsFanMapper;
    @Autowired
    ModelMapper modelMapper;

   /* @Autowired
    BtViewMenuMapper btViewMenuMapper;*/

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
    public ResponseResult insert(BtViewNewsDto record, String userId) {
        ResponseResult result = new ResponseResult();
        BtViewNews btViewNews = new BtViewNews();
        btViewNews.setCreateTime(new Date());
        String uuid = IdUtil.createIdByUUID();
        btViewNews.setId(uuid);
        btViewNews.setStatus(0);
        btViewNews.setStatusStr("zh");
        btViewNews.setBrowseNumber(0);
        btViewNews.setCreateTime(new Date());
        btViewNews.setMenuId(record.getMenuId());
        BtSysUserExample example = new BtSysUserExample();
        BtSysUserExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<BtSysUser> btSysUsers = btSysUserMapper.selectByExample(example);
        btViewNews.setCreater(btSysUsers.get(0).getUsername());
        btViewNews.setMenuId(record.getMenuId());
        btViewNews.setNewContent(record.getNewContent());
        btViewNews.setTitle(record.getTitle());
        btViewNews.setPictureUrl(record.getPictureUrl());
        btViewNews.setNewCategoryId(record.getNewCategoryId());
        btViewNewsMapper.insert(btViewNews);
        BtViewNewsEng btViewNewsEng = new BtViewNewsEng();
        btViewNewsEng.setId(uuid);
        btViewNewsEng.setCreateTime(new Date());
        btViewNewsEng.setBrowseNumber(record.getBrowseNumber());
        btViewNewsEng.setMenuId(record.getMenuId());
        btViewNewsEng.setNewCategoryId(record.getNewCategoryId());
        //if (baiduTranslateUtil.translate(record.getNewContent())!=null) {
        //    btViewNewsEng.setNewContent(baiduTranslateUtil.translate(record.getNewContent()));
        //}else {
        //    result.setCode(789);
        //    return result;
        //}
        btViewNewsEng.setPictureUrl(record.getPictureUrl());
        btViewNewsEng.setStatusStr("en");
        //if (baiduTranslateUtil.translate(record.getTitle())!=null) {
        //    btViewNewsEng.setTitle(baiduTranslateUtil.translate(record.getTitle()));
        //}else {
        //    result.setCode(789);
        //    return result;
        //}
        btViewNewsEng.setStatus(0);
        btViewNewsEng.setNewContent(record.getEngContent());
        btViewNewsEng.setTitle(record.getEngTitle());
        btViewNewsEngMapper.insert(btViewNewsEng);
        BtViewNewsFan btViewNewsFan = new BtViewNewsFan();
        btViewNewsFan.setId(uuid);
        btViewNewsFan.setCreateTime(new Date());
        btViewNewsFan.setUpdateTime(new Date());
        btViewNewsFan.setBrowseNumber(record.getBrowseNumber());
        btViewNewsFan.setMenuId(record.getMenuId());
        btViewNewsFan.setNewCategoryId(record.getNewCategoryId());
        //if (baiduTranslateUtil.translateFan(record.getNewContent())!=null) {
        //    btViewNewsFan.setNewContent(baiduTranslateUtil.translateFan(record.getNewContent()));
        //}else {
        //    result.setCode(789);
        //    return result;
        //}
        btViewNewsFan.setPictureUrl(record.getPictureUrl());
        btViewNewsFan.setStatusStr("cht");
        //if (baiduTranslateUtil.translateFan(record.getTitle())!=null) {
        //    btViewNewsFan.setTitle(baiduTranslateUtil.translateFan(record.getTitle()));
        //}else {
        //    result.setCode(789);
        //    return  result;
        //}

        btViewNewsFan.setStatus(0);
        btViewNewsFan.setNewContent(record.getFanContent());
        btViewNewsFan.setTitle(record.getFanTitle());
        btViewNewsFanMapper.insert(btViewNewsFan);
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
    public ResponseResult updateByPrimaryKey(BtViewNewsDto record) {
        ResponseResult result = new ResponseResult();
        if (record.getStatus() == 1) {
            result.setCode(500);
            result.setError("发布中的状态不允许编辑");
            result.setError_description("发布中的状态不允许编辑");
            return result;
        }
        BtViewNews btViewNews = new BtViewNews();
        modelMapper.map(record, btViewNews);
        btViewNewsMapper.updateByPrimaryKey(btViewNews);


        BtViewNewsEng btViewNewsEng = new BtViewNewsEng();
        modelMapper.map(record, btViewNewsEng);
        btViewNewsEng.setTitle(record.getEngTitle());
        btViewNewsEng.setNewContent(record.getEngContent());
        btViewNewsEngMapper.updateByPrimaryKey(btViewNewsEng);


        BtViewNewsFan btViewNewsFan = new BtViewNewsFan();
        modelMapper.map(record, btViewNewsFan);
        btViewNewsFan.setTitle(record.getFanTitle());
        btViewNewsFan.setNewContent(record.getFanContent());
        btViewNewsFanMapper.updateByPrimaryKey(btViewNewsFan);

        return result;
    }

    @Override
    public ResponseResult updateStatus(String id, int status) {
        ResponseResult result = new ResponseResult();
        if (status == 1) {
            BtViewNews viewNews = btViewNewsMapper.findById(id);
            BtViewMenu btViewMenu = btViewMenuMapper.findById(viewNews.getMenuId());
            if (!btViewMenu.getPage()) {
                btViewNewsMapper.updateUnpublished(viewNews.getMenuId());
                btViewNewsEngMapper.updateUnpublished(viewNews.getMenuId());
                btViewNewsFanMapper.updateUnpublished(viewNews.getMenuId());
            }
            btViewNewsMapper.updateStatus(id, status);
            btViewNewsEngMapper.updateStatus(id, status);
            btViewNewsFanMapper.updateStatus(id, status);
        }
        if (status == 0){
            btViewNewsMapper.updateDate(id, status);
            btViewNewsEngMapper.updateStatus(id, status);
            btViewNewsFanMapper.updateStatus(id, status);
        }
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
        BtViewNewsDto btViewNewsDto = new BtViewNewsDto();
        modelMapper.map(btViewNews, btViewNewsDto);
        BtViewNewsEngExample btViewNewsEngExample = new BtViewNewsEngExample();
        btViewNewsEngExample.createCriteria().andIdEqualTo(id);
        BtViewNewsEng btViewNewsEng = btViewNewsEngMapper.selectByExample(btViewNewsEngExample).stream().findFirst().get();
        btViewNewsDto.setEngTitle(btViewNewsEng.getTitle());
        btViewNewsDto.setEngContent(btViewNewsEng.getNewContent());
        BtViewNewsFan btViewNewsFan = btViewNewsFanMapper.selectByPrimaryKey(id);
        btViewNewsDto.setFanTitle(btViewNewsFan.getTitle());
        btViewNewsDto.setFanContent(btViewNewsFan.getNewContent());
        result.setData(btViewNewsDto);
        return result;

    }
}






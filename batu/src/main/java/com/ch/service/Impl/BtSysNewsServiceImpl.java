package com.ch.service.impl;

import com.ch.base.ResponseResult;
import com.ch.dao.BtViewNewsMapper;
import com.ch.dto.NewsParam;
import com.ch.entity.BtViewNews;
import com.ch.entity.BtViewNewsExample;
import com.ch.service.BtSysNewsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class BtSysNewsServiceImpl implements BtSysNewsService {
    @Autowired
    private BtViewNewsMapper btViewNewsMapper;

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
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public ResponseResult findPage(int pageNum, int pageSize) {
        ResponseResult result = new ResponseResult();
        PageHelper.startPage(pageNum, pageSize);
        List<BtViewNews> btViewNews = btViewNewsMapper.selectByExample(null);
        PageInfo<BtViewNews> page = new PageInfo<>(btViewNews);
        result.setData(page);
        return result;


    }

    @Override
    public ResponseResult insert(BtViewNews record) {
        record.setCreateTime(new Date());
        btViewNewsMapper.insert(record);

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
        }
        ResponseResult result = new ResponseResult();

        return result;
    }

    @Override
    @Transactional
    public ResponseResult updateByPrimaryKey(BtViewNews record) {
        ResponseResult result = new ResponseResult();
        btViewNewsMapper.updateByPrimaryKey(record);
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
        if (newsParam.getTitle() != null) {
                criteria.andTitleLike("%" + newsParam.getTitle() + "%");
            criteria.andNewCategoryIdEqualTo(newsParam.getCategory());
        }

        List<BtViewNews> btViewNews = btViewNewsMapper.selectByExample(example);
        PageInfo<BtViewNews> page = new PageInfo<>(btViewNews);
        ResponseResult result = new ResponseResult();

        result.setData(page);
        return result;


    }

}

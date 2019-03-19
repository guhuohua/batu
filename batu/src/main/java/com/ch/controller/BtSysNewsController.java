package com.ch.controller;

import com.ch.base.ResponseResult;
import com.ch.dto.NewsParam;
import com.ch.entity.BtViewNews;
import com.ch.service.BtSysNewsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sysNews")
@Api(value = "新闻管理",description = "新闻管理")
public class BtSysNewsController {

    @Autowired
    private BtSysNewsService btSysNewsService;
    private static final Logger LOGGER = LogManager.getLogger(BtSysNewsController.class);


    @RequestMapping(value = "/deleNews", method = RequestMethod.POST)
    @ApiOperation("删除新闻")
    public ResponseResult deleNews(@RequestBody List<String> ids){
        ResponseResult result = new ResponseResult();

        try {
            return btSysNewsService.delete(ids);
        } catch (Exception e) {
            LOGGER.error("删除失败"+e.getMessage(),e);
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("删除失败");
            return result;
        }
    }

    /*@RequestMapping(value = "/addNews", method = RequestMethod.POST)
    public ResponseResult addNews( @RequestBody BtViewNews record){
        ResponseResult result = new ResponseResult();

        try {
            return btSysNewsService.insert(record);
        } catch (Exception e) {
            LOGGER.error("添加失败"+e.getMessage(),e);
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("添加失败");
            return result;
        }
    }*/

    @RequestMapping(value = "/searchNews", method = RequestMethod.POST)
    public ResponseResult searchNews(@RequestBody NewsParam newsParam){
        ResponseResult result = new ResponseResult();
        try {
            return btSysNewsService.findPage(newsParam);
        } catch (Exception e) {
            LOGGER.error("查询失败"+e.getMessage(),e);
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("查询失败");
            return result;
        }
    }

    @PostMapping(value = "/editNews")
    @ApiOperation("增加或修改新闻")
    public ResponseResult updateNews(@RequestBody BtViewNews record){
        ResponseResult result = new ResponseResult();
        try {

            if (record.getId()!=null){
                return btSysNewsService.updateByPrimaryKey(record);
            }else {
                return btSysNewsService.insert(record);
            }

        } catch (Exception e) {
            LOGGER.error("修改失败"+e.getMessage(),e);
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("修改失败");
            return result;
        }
    }


}
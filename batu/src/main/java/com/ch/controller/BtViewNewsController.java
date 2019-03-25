package com.ch.controller;

import com.ch.base.ResponseResult;
import com.ch.entity.BtViewNews;
import com.ch.service.BtViewNewsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/viewNews")
public class BtViewNewsController {

    @Autowired
    private BtViewNewsService btViewNewsService;
    private static final Logger LOGGER = LogManager.getLogger(BtViewNewsController.class);

    @RequestMapping(value = "/news", method = RequestMethod.GET)
    public ResponseResult findViewNewsByNewId(String newId) {
        ResponseResult result = new ResponseResult();
        try {
            return  btViewNewsService.findViewNewsByNewId(newId);
        } catch (Exception e) {
            LOGGER.error("新闻展示失败"+e.getMessage(),e);
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("新闻展示失败");
            return result;
        }
    }

    @RequestMapping(value = "/news_eng", method = RequestMethod.GET)
    public ResponseResult findViewNewsEngByNewId(String newId) {
        ResponseResult result = new ResponseResult();
        try {
            return  btViewNewsService.findViewNewsEngByNewId(newId);
        } catch (Exception e) {
            LOGGER.error("新闻展示失败"+e.getMessage(),e);
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("新闻展示失败");
            return result;
        }
    }


    @RequestMapping(value = "/news_fan", method = RequestMethod.GET)
    public ResponseResult findViewNewsFanByNewId(String newId) {
        ResponseResult result = new ResponseResult();
        try {
            return  btViewNewsService.findViewNewsFanByNewId(newId);
        } catch (Exception e) {
            LOGGER.error("新闻展示失败"+e.getMessage(),e);
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("新闻展示失败");
            return result;
        }
    }
    @RequestMapping(value = "/newsByMenuId", method = RequestMethod.POST)
    public ResponseResult findViewNewsByMenuId(@RequestParam String menuId,Integer index,Integer size) {
        ResponseResult result = new ResponseResult();
        try {
            return  btViewNewsService.findViewNewsByMenId(menuId,index ,size);
        } catch (Exception e) {
            LOGGER.error("新闻展示失败"+e.getMessage(),e);
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("新闻展示失败");
            return result;
        }
    }


    @RequestMapping(value = "/newsEngByMenuId", method = RequestMethod.POST)
    public ResponseResult findViewNewsFanByNewId(@RequestParam String newId,Integer index,Integer size) {
        ResponseResult result = new ResponseResult();
        try {
            return  btViewNewsService.findViewNewsEngByMenId(newId,index,size);
        } catch (Exception e) {
            LOGGER.error("新闻展示失败"+e.getMessage(),e);
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("新闻展示失败");
            return result;
        }
    }


    @RequestMapping(value = "/newsFanByMenuId", method = RequestMethod.POST)
    public ResponseResult findViewNewsFanByMenuId(@RequestParam String menuId, Integer index, Integer size) {
        ResponseResult result = new ResponseResult();
        try {
            return  btViewNewsService.findViewNewsFanByMenId(menuId,index,size);
        } catch (Exception e) {
            LOGGER.error("新闻展示失败"+e.getMessage(),e);
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("新闻展示失败");
            return result;
        }
    }

}

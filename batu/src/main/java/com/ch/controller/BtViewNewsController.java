package com.ch.controller;

import com.ch.base.ResponseResult;
import com.ch.entity.BtViewNews;
import com.ch.service.BtViewNewsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/viewNews")
public class BtViewNewsController {

    @Autowired
    private BtViewNewsService btViewNewsService;
    private static final Logger LOGGER = LogManager.getLogger(BtViewNewsController.class);

    @RequestMapping(value = "/news", method = RequestMethod.GET)
    public ResponseResult findViewNewsByMenuId(String menuId) {
        ResponseResult result = new ResponseResult();
        try {
            return  btViewNewsService.findViewNewsByMenuId(menuId);
        } catch (Exception e) {
            LOGGER.error("新闻展示失败"+e.getMessage(),e);
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("新闻展示失败");
            return result;
        }
    }

    @RequestMapping(value = "/news_eng", method = RequestMethod.GET)
    public ResponseResult findViewNewsEngByMenuId(String menuId) {
        ResponseResult result = new ResponseResult();
        try {
            return  btViewNewsService.findViewNewsEngByMenuId(menuId);
        } catch (Exception e) {
            LOGGER.error("新闻展示失败"+e.getMessage(),e);
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("新闻展示失败");
            return result;
        }
    }


    @RequestMapping(value = "/news_fan", method = RequestMethod.GET)
    public ResponseResult findViewNewsFanByMenuId(String menuId) {
        ResponseResult result = new ResponseResult();
        try {
            return  btViewNewsService.findViewNewsFanByMenuId(menuId);
        } catch (Exception e) {
            LOGGER.error("新闻展示失败"+e.getMessage(),e);
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("新闻展示失败");
            return result;
        }
    }


}

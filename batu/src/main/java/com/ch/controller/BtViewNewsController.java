package com.ch.controller;

import com.ch.base.ResponseResult;
import com.ch.entity.BtViewNews;
import com.ch.service.BtViewMenuService;
import com.ch.service.BtViewNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/viewNews")
public class BtViewNewsController {

    @Autowired
    private BtViewNewsService btViewNewsService;

    @RequestMapping(value = "/news", method = RequestMethod.GET)
    public ResponseResult findViewNewsByMenuId(String menuId) {
       return  btViewNewsService.findViewNewsByMenuId(menuId);
    }
}

package com.ch.controller;

import com.ch.base.ResponseResult;
import com.ch.dao.ViewMenuMapper;
import com.ch.entity.ViewMenu;
import com.ch.service.ViewMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/viewMenu")
public class ViewMenuController {
    @Autowired
    private ViewMenuService viewMenuService;
    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public ResponseResult findMenu() {
        return viewMenuService.findMenuTree();
    }







}

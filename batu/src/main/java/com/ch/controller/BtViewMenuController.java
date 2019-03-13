package com.ch.controller;

import com.ch.base.ResponseResult;
import com.ch.service.BtViewMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/viewMenu")
public class BtViewMenuController {
    @Autowired
    private BtViewMenuService btViewMenuService;

    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public ResponseResult findMenu() {
        return btViewMenuService.findTree();
    }
}

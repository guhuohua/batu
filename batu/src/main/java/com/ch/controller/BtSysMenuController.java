package com.ch.controller;

import com.ch.base.ResponseResult;
import com.ch.service.BtSysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sysMenu")
public class BtSysMenuController {
   @Autowired
   private BtSysMenuService btSysMenuService;


   @RequestMapping("/findTree")
    public ResponseResult findTree(){
        return btSysMenuService.findTree();
    }
}

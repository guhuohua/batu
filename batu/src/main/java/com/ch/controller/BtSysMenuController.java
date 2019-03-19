package com.ch.controller;

import com.ch.base.ResponseResult;
import com.ch.service.BtSysMenuService;
import com.ch.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/sysMenu")
public class BtSysMenuController {
   @Autowired
   private BtSysMenuService btSysMenuService;


   @RequestMapping("/findTree")
    public ResponseResult findTree(HttpServletRequest req){
       String token = req.getHeader("Authorization");
       String userId = TokenUtil.getUserId(token);
        return btSysMenuService.findTree(userId);
    }
}

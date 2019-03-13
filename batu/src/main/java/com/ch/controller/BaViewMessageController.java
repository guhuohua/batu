package com.ch.controller;

import com.ch.base.ResponseResult;
import com.ch.entity.BtViewMessage;
import com.ch.service.BtViewMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/viewMessage")
public class BaViewMessageController {
    @Autowired
    private BtViewMessageService btViewMessageService;

    @PostMapping("message")
    public ResponseResult insert(@RequestBody BtViewMessage record){
        return btViewMessageService.insert(record);

    }
}

package com.ch.controller;

import com.ch.base.ResponseResult;
import com.ch.service.BtViewMenuService;
import com.ch.util.AddressUtil;
import com.ch.util.IpUtil;
import org.apache.ibatis.annotations.Delete;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.SocketException;

@RestController
@RequestMapping("/viewMenu")
public class BtViewMenuController {
    @Autowired
    private BtViewMenuService btViewMenuService;
    @Autowired
    IpUtil ipUtil;
    private static final Logger LOGGER = LogManager.getLogger(BtViewMenuController.class);

    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public ResponseResult findMenu(HttpServletRequest req, HttpServletResponse res) {
        String ipAddr = null;
        try {
            ipAddr = ipUtil.getInnetIp();
        } catch (SocketException e) {
            e.printStackTrace();
        }

        System.out.println(ipAddr);
        try {
            String addresses = ipUtil.getAddresses("ip=" + ipAddr, "utf-8");
            System.out.println(addresses);
            LOGGER.info(ipAddr);
            LOGGER.info(addresses);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return btViewMenuService.findTree();
    }
}

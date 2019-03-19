package com.ch.controller;

import com.ch.base.ResponseResult;
import com.ch.dto.MenuParam;
import com.ch.entity.BtViewMenu;
import com.ch.service.BtSysTrafficStatisticsService;
import com.ch.service.BtViewMenuService;
import com.ch.util.AddressUtil;
import com.ch.util.Ip138Util;
import com.ch.util.IpUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Delete;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.SocketException;

@RestController
@RequestMapping("/viewMenu")
@Api(value = "菜单管理",description = "菜单管理")
public class BtViewMenuController {
    @Autowired
    private BtViewMenuService btViewMenuService;
    @Autowired
    BtSysTrafficStatisticsService btSysTrafficStatisticsService;
    @Autowired
    IpUtil ipUtil;
    private static final Logger LOGGER = LogManager.getLogger(BtViewMenuController.class);

    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    @ApiOperation("展示菜单")
    public ResponseResult findMenu(HttpServletRequest req, HttpServletResponse res) {
        String ipAddr = null;
        try {
            ipAddr = ipUtil.getInnetIp();
            String addresses = Ip138Util.queryIP(ipAddr);
            btSysTrafficStatisticsService.saveTrafficStatistics(ipAddr, addresses);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return btViewMenuService.findTree();
    }

    @RequestMapping(value = "/pageMenu", method = RequestMethod.GET)
    public ResponseResult findPageTree(int pageNum, int pageSize){
        return btViewMenuService.findPageTree(pageNum,pageSize);
    }

    @RequestMapping(value = "/searchMenu", method = RequestMethod.POST)
    public ResponseResult searchMenu(@RequestBody MenuParam menuParam){
        return btViewMenuService.findPage(menuParam);
    }

    @RequestMapping(value = "/editMenu", method = RequestMethod.POST)
    @ApiOperation("添加或修改菜单")
    @RequiresPermissions(logical = Logical.OR, value = {"sys_mange_menu_edit","sys_mange_menu_insert","sys_mange_menu"})
    public ResponseResult editMenu(@RequestBody BtViewMenu btViewMenu){
       ResponseResult result = new ResponseResult();
        try {

            if (btViewMenu.getId()==null){
                result =  btViewMenuService.insert(btViewMenu);
            }else {
                result =  btViewMenuService.updateByPrimaryKey(btViewMenu);
            }


        } catch (Exception e) {
            LOGGER.error("添加菜单失败" + e.getMessage(), e);
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("添加菜单失败");
        }
        return result;
    }

  /*  @RequestMapping(value = "/updateMenu", method = RequestMethod.POST)
    public ResponseResult updateMenu( @RequestBody BtViewMenu btViewMenu){
        ResponseResult result = new ResponseResult();
        try {
            result =  btViewMenuService.updateByPrimaryKey(btViewMenu);
        } catch (Exception e) {
            LOGGER.error("编辑菜单失败" + e.getMessage(), e);
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("编辑菜单失败");
        }
        return result;
    }*/

    @RequestMapping(value = "/deleMenu", method = RequestMethod.GET)
    @ApiOperation("删除菜单")
    @RequiresPermissions(logical = Logical.OR, value = {"sys_mange_menu_delete","sys_mange_menu"})
    public ResponseResult deleMenu(String id){
        ResponseResult result = new ResponseResult();
        try {
            result = btViewMenuService.deleteByPrimaryKey(id);
        } catch (Exception e) {
            LOGGER.error("删除菜单失败" + e.getMessage(), e);
            result.setCode(500);
            result.setError(e.getMessage());
            result.setError_description("删除菜单失败");
        }
        return result;
    }
}

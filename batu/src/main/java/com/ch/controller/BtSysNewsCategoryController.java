package com.ch.controller;

import com.ch.base.ResponseResult;
import com.ch.entity.BtViewNewsCategory;
import com.ch.service.BtSysNewsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("category")
public class BtSysNewsCategoryController {
    @Autowired
    private BtSysNewsCategoryService btSysNewsCategoryService;
    @RequestMapping(value = "/insertCategory", method = RequestMethod.POST)
    public ResponseResult insert( @RequestBody BtViewNewsCategory record){
       return  btSysNewsCategoryService.insert(record);
   }


    @RequestMapping(value = "/updateCategory", method = RequestMethod.POST)
    public ResponseResult updateByPrimaryKey( @RequestBody BtViewNewsCategory record){
       return btSysNewsCategoryService.updateByPrimaryKey(record);
    }

    @RequestMapping(value = "/deleByIdsCategory", method = RequestMethod.POST)
    public ResponseResult deleByIds( @RequestBody List<String> ids){
        return btSysNewsCategoryService.delete(ids);
    }

    @RequestMapping(value = "/deleByIdCategory", method = RequestMethod.GET)
    public ResponseResult deleById( String id){
        return btSysNewsCategoryService.delete(id);
    }
}

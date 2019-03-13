package com.ch.controller;

import com.ch.base.ResponseResult;
import com.ch.dto.UserDTO;
import com.ch.service.BtSysUserService;
import com.ch.util.TokenUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "batu")
public class LoginController {

    @Autowired
    BtSysUserService btSysUserService;

    @PostMapping(value = "login")
    public ResponseResult login(HttpServletRequest req, HttpServletResponse res, @RequestBody UserDTO dto){
        ResponseResult result = new ResponseResult();
        try {
            result = btSysUserService.login(dto);
            UserDTO data = (UserDTO) result.getData();
            String token = TokenUtil.getUserId(data.getUserId());
            result.setData(token);
        } catch (Exception e) {
            result.setCode(404);
            result.setError(e.getMessage());
            result.setError_description("登录失败，请稍后再试");
        }
        return result;
    }

    @GetMapping("/article")
    public ResponseResult article() {
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            return new ResponseResult(200, "You are already logged in", "", null);
        } else {
            return new ResponseResult(200, "You are guest", "", null);
        }
    }

    @GetMapping("/require_auth")
    @RequiresAuthentication
    public ResponseResult requireAuth() {
        return new ResponseResult(200, "You are authenticated", "", null);
    }

    @GetMapping("/require_role")
    @RequiresRoles("admin")
    public ResponseResult requireRole() {
        return new ResponseResult(200, "You are visiting require_role","",  null);
    }

    @GetMapping("/require_permission")
    @RequiresPermissions(logical = Logical.AND, value = {"view", "edit"})
    public ResponseResult requirePermission() {
        return new ResponseResult(200, "You are visiting permission require edit,view", "", null);
    }

    @RequestMapping(path = "/401")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ResponseResult unauthorized() {
        return new ResponseResult(401, "Unauthorized", "", null);
    }
}
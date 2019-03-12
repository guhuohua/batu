package com.ch.controller;

import com.ch.base.ResponseResult;
import com.ch.entity.User;
import com.ch.service.UserService;
import com.ch.util.TokenUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2019-03-11 14:16:25
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(String id) {
        return this.userService.queryById(id);
    }

    @PostMapping("login")
    public ResponseResult login(HttpServletRequest req, HttpServletResponse res, @RequestBody User user, @RequestHeader HttpHeaders headers) {
        ResponseResult result = new ResponseResult();
        User u = this.userService.findByUserIdAndPassword(user);
        String header = req.getHeader("admin-token");
        if (u != null) {
//            String sign = TokenUtil.sign(u.getId());
            String userId = TokenUtil.getUserId(header);
            result.setData(userId);
        } else {
            result.setCode(500);
            result.setError("账户或密码不正确，请重新输入");
            result.setError_description("账户或密码不正确，请重新输入");
        }
        return result;
    }

}
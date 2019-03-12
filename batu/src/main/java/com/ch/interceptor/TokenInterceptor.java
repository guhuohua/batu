package com.ch.interceptor;

import com.ch.util.TokenUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class TokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        String url = (String) request.getAttribute("javax.servlet.forward.request_uri");
        if (request.getMethod().equals("OPTIONS")){
            response.setStatus(HttpServletResponse.SC_OK);
            return true;
        }
        response.setCharacterEncoding("utf-8");
        String token = request.getHeader("admin-token");
        if (token != null || "/user/selectOne".equals(url)){
            boolean result = TokenUtil.verify(token);
            if(result || "/user/selectOne".equals(url)){
                System.out.println("通过拦截器");
                return true;
            }
        }
        System.out.println("认证失败");
        response.getWriter().write("{'code':500,'error':'token验证失败','error_description':'token验证失败','data':false}");
        return false;
    }
}
package com.ch.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2019-03-11 14:16:22
 */
public class User implements Serializable {
    private static final long serialVersionUID = 276283687524873438L;
    //id
    private Integer id;
    //名字
    private String name;
    //密码
    private String password;
    //手机号码
    private String mobilePhone;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

}
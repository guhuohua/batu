package com.ch.ch;

import com.aliyun.oss.OSSClient;
import com.ch.dto.UserDTO;
import com.ch.service.BtSysUserService;
import com.ch.util.IdUtil;
import com.ch.util.OSSUtil;
import org.apache.http.entity.ContentType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChApplicationTests {

    @Autowired
    OSSUtil ossUtil;

    @Autowired
    BtSysUserService btSysUserService;

    @Test
    public void testUploadImage(){
        UserDTO byId = btSysUserService.findById("123121");
        System.out.println(byId);
    }


}

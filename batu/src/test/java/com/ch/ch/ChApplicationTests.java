package com.ch.ch;

import com.aliyun.oss.OSSClient;
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

    @Test
    public void testUploadImage(){
//        OSSClient client = ossUtil.getOSSClient();
//        String flilePathName = "/Users/changhan/Downloads/640.gif";
//        File file = new File(flilePathName);
//        String md5key = ossUtil.uploadObject2OSS(client, file);
//        System.out.print("上传后的文件MD5数字唯一签名:" + md5key);
//        ossUtil.destory(client);


        File file = new File("/Users/changhan/Downloads/640.gif");
        try {
            MultipartFile mulFile = new MockMultipartFile("640.gif", "640.gif", ContentType.APPLICATION_OCTET_STREAM.toString(), new FileInputStream(file));
            String upload = ossUtil.upload(mulFile);
            System.out.println(upload);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

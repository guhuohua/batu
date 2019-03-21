package com.ch.service.impl;

import com.ch.base.ResponseResult;
import com.ch.base.UploadName;
import com.ch.service.BtUploadService;
import com.ch.util.OSSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class BtUploadServiceImpl implements BtUploadService {

    @Autowired
    OSSUtil ossUtil;

    @Override
    public UploadName upload(MultipartFile file) {
        UploadName result = new UploadName();
        String upload = ossUtil.upload(file);
        result.setUrl(upload);
        result.setName(file.getOriginalFilename());
        return result;
    }
}

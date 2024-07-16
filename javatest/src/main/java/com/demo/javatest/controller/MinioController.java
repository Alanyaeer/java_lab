package com.demo.javatest.controller;


import com.demo.javatest.utils.MinioUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class MinioController {
    @Autowired
    private MinioUtils minioUtils;
    @Value("${minio.endpoint}")
    private String address;
    @Value("${minio.bucketName}")
    private String bucketName;

    @PostMapping("/upload")
    public Object upload(MultipartFile file) {

        List<String> upload = minioUtils.upload(new MultipartFile[]{file});

        return address + "/" + bucketName + "/" + upload.get(0);
    }
    @DeleteMapping("/delete")
    public Object delete(String bucketName, String fileName){
        List<String> list = new ArrayList<>();
        list.add(fileName);
//        return  ;

        return minioUtils.removeObjects(bucketName, list);
    }
    @PostMapping("/get")
    public Object get(String name){
        return minioUtils.download(name);
    }
    @GetMapping("/makeBucket")
    public Object makeBucket(String bucketName){
        return minioUtils.makeBucket(bucketName);
    }
}


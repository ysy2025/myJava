package org.ysy.lease.web.admin.service.impl;

import io.minio.BucketExistsArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import io.minio.SetBucketPolicyArgs;
import io.minio.errors.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;
import org.ysy.lease.common.minio.MinioProperties;
import org.ysy.lease.web.admin.service.FileService;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private MinioClient minioClient;

    @Autowired
    private MinioProperties minioProperties;
    @Override
    public String upload(MultipartFile file) {

        try {
            boolean b = minioClient.bucketExists(BucketExistsArgs.builder().bucket(minioProperties.getBucketName()).build());

            // 不存在
            if (!b){
                minioClient.makeBucket(
                        MakeBucketArgs.builder().bucket(minioProperties.getBucketName()).build()
                );

                // 设置桶的权限
                minioClient.setBucketPolicy(SetBucketPolicyArgs.builder().
                        bucket(minioProperties.getBucketName()).
                        config(createBucketPolicyConfig(minioProperties.getBucketName())).
                        build());

                // 上传
                minioClient.
            }
            else {

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private String createBucketPolicyConfig(String bucketName) {

        return """
                  {
                    "Statement" : [ {
                      "Action" : "s3:GetObject",
                      "Effect" : "Allow",
                      "Principal" : "*",
                      "Resource" : "arn:aws:s3:::%s/*"
                    } ],
                    "Version" : "2012-10-17"
                  }
                  """.formatted(bucketName);
    }
}

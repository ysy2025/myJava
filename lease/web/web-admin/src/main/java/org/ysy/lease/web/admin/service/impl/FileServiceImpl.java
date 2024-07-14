package org.ysy.lease.web.admin.service.impl;

import io.minio.*;
import io.minio.errors.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;
import org.ysy.lease.common.minio.MinioProperties;
import org.ysy.lease.web.admin.service.FileService;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Service
public class FileServiceImpl implements FileService {

    @Autowired
    MinioClient client;

    @Autowired
    MinioProperties properties;

    @Override
    public String upload(MultipartFile file) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
//        try {
            boolean isExists = client.bucketExists(BucketExistsArgs.builder().bucket(properties.getBucketName()).build());
            // 不存在此桶
            if (!isExists) {
                // 建
                client.makeBucket(MakeBucketArgs.builder().bucket(properties.getBucketName()).build());

                // 设置权限
                client.setBucketPolicy(SetBucketPolicyArgs.builder().
                        bucket(properties.getBucketName()).
                        config(createBucketPolicyConfig(properties.getBucketName())).
                        build());

                // 上传本地磁盘文件到minio,但是这里的file是Multipartfile,不是本地文件了
//                client.uploadObject();
            }
                // file name
                String filename = new SimpleDateFormat("yyyyMMdd").format(
                        new Date()) + "/" + UUID.randomUUID() + "-" + file.getOriginalFilename();

                // 从stream 上传
                client.putObject(PutObjectArgs.builder().
                        bucket(properties.getBucketName()).
                        stream(file.getInputStream(),file.getSize(),-1).
                        object(filename).
                        contentType(file.getContentType()).
                        build());

                String url = String.join("/", properties.getEndpoint(), properties.getBucketName(), filename);

                return url;

//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        return null;
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

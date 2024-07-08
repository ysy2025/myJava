package com.ysy.utils;


import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * @author: adili
 * @date: 2020/02/24 13:34
 * @description: AES 加密/解密工具类
 */

public class AESEncryptUtils {

    //--------------AES---------------
    private static final String KEY = "616l72o7218v32e3";  // 密匙，必须16位   AES最常见的有3种方案，分别是AES-128、AES-192和AES-256，它们的区别在于密钥长度不同，AES-128的密钥长度为16bytes（128bit / 8），后两者分别为24bytes和32bytes。
    private static final String OFFSET = "2p0edt67ple8l9j8"; // 偏移量
    private static final String ENCODING = "UTF-8"; // 编码
    private static final String ALGORITHM = "AES"; //算法
    private static final String CIPHER_ALGORITHM = "AES/CBC/PKCS5Padding"; // 默认的加密算法，CBC模式
    private static final String ENCRYPT_START = "[E]";
    public static final String CIPHER_ALGORITHM_ECB = "AES/ECB/PKCS5Padding";

    private static final Log LOG = LogFactory.getLog(AESEncryptUtils.class);

    public static String encrypt(String data) {
        if (StringUtils.isBlank(data)) {
            return data;
        }

        if (hasEncrypted(data)) {//已经加密，直接返回
            return data;
        }

        try {
            Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
            SecretKeySpec skeySpec = new SecretKeySpec(KEY.getBytes("ASCII"), ALGORITHM);
            IvParameterSpec iv = new IvParameterSpec(OFFSET.getBytes());    //CBC模式偏移量IV
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
            byte[] encrypted = cipher.doFinal(data.getBytes(ENCODING));
            return ENCRYPT_START + new Base64().encodeToString(encrypted);  //加密后再使用BASE64做转码
        } catch (Exception e) {
            LOG.error(e.getMessage().toString());
        }
        return null;
    }


    public static String decrypt(String data) {
        if (StringUtils.isBlank(data)) {
            return data;
        }
        if (!hasEncrypted(data)) {//未加密，直接返回
            return data;
        }

        data = data.substring(ENCRYPT_START.length());//去掉加密标志头

        try {
            Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
            SecretKeySpec skeySpec = new SecretKeySpec(KEY.getBytes("ASCII"), ALGORITHM);
            IvParameterSpec iv = new IvParameterSpec(OFFSET.getBytes()); //CBC模式偏移量IV
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
            byte[] buffer = new Base64().decode(data);  //先用base64解码
            byte[] encrypted = cipher.doFinal(buffer);
            return new String(encrypted, ENCODING);
        } catch (Exception e) {
            LOG.error(e.getMessage().toString());
        }
        return null;
    }

    //判断是否是base64 字符串
    public static boolean hasEncrypted(String str) {
        if (StringUtils.isBlank(str)) {
            return false;
        }
        //这种方式判断比较靠谱
        if (str.startsWith(ENCRYPT_START)) {
            return true;
        }
        return false;
    }

    /**
     * aes加密
     *
     * @param content 内容
     * @param key     秘钥
     * @return
     */
    public static String aesEncrypt(String content, String key, String algorithm, int initSize) {
        try {
            KeyGenerator kgen = KeyGenerator.getInstance(ALGORITHM);
            kgen.init(initSize);
            Cipher cipher = Cipher.getInstance(algorithm);
            cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key.getBytes(), ALGORITHM));
            return Base64.encodeBase64String(cipher.doFinal(content.getBytes("utf-8")));
        } catch (Exception e) {
            LOG.error("加密出错!", e);
            return "";
        }
    }

    /**
     * aes解密
     *
     * @param content 内容
     * @param key     秘钥
     * @return
     */
    public static String aesDecrypt(String content, String key, String algorithm, int initSize) {
        try {
            byte[] encryptBytes = Base64Decoder.decodeBuffer(content);
            KeyGenerator kgen = KeyGenerator.getInstance(ALGORITHM);
            kgen.init(initSize);
            Cipher cipher = Cipher.getInstance(algorithm);
            cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key.getBytes(), ALGORITHM));
            byte[] decryptBytes = cipher.doFinal(encryptBytes);
            return new String(decryptBytes);
        } catch (Exception e) {
            LOG.error("解密出错!", e);
            return "";
        }
    }


    public static void main(String[] args) {

        try {

            String b = "15122913333";
            LOG.info(String.format("加密前：{}", b));
            LOG.info(String.format("加密后：{}", encrypt(b)));
            LOG.info(String.format("解密密后：{}", decrypt(encrypt(b))));
            LOG.info(String.format("加密后：{}", encrypt(b)));
            LOG.info(String.format("解密密后：{}", decrypt(encrypt(b))));
            LOG.info(String.format("解密密后：{}", decrypt("[E]jHmF/JNbNGCPum1kOZsnBA==")));
            String encrypt = aesEncrypt("15357911111", "FJDHUg3iZOjNoNWj", CIPHER_ALGORITHM_ECB, 256);
            LOG.info(String.format("加密后：{}", encrypt));
            LOG.info(String.format("解密密后：{}", aesDecrypt(encrypt, "FJDHUg3iZOjNoNWj", CIPHER_ALGORITHM_ECB, 256)));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

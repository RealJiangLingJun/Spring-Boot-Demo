package com.jiangjiawei.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {

    public static void main(String[] args) {
        //获取一个加密器
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        //设置加密的盐
        encryptor.setPassword("1234567!@#");

        String name = encryptor.encrypt("root");
        String password = encryptor.encrypt("root");
        System.out.println(name);
        System.out.println(password);
    }
}

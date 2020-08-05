package com.jiangjiawei.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 声明这是一个配置文件对应的类
 * prefix前缀只想配置文件中的一级目录
 */
@ConfigurationProperties(prefix = "user")
public class UserConfig {

    private String name;
    private String sex;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

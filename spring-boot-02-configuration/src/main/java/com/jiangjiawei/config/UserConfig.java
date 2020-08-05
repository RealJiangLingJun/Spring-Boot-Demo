package com.jiangjiawei.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 声明这是一个配置文件对应的类
 * prefix前缀只想配置文件中的一级目录
 */
@ConfigurationProperties(prefix = "user")
@Data
public class UserConfig {

    private String name;
    private String sex;
    private Integer age;
    private String[] friends;
}

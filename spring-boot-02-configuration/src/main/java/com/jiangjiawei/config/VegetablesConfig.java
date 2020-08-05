package com.jiangjiawei.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


/**
 * 重要事情说三遍：@Configuration @ConfigurationProperties(prefix = "") @PropertySource("classpath:")
 *
 * @Configuration
 * 声明一个配置类  在spring中代替xml文件
 * @ConfigurationProperties(prefix = "vegetables")
 * 声明这是一个配置文件类  声明前缀
 * @PropertySource("classpath:vegetables.properties")
 * 声明配置信息对应的地址
 */
@Configuration
@ConfigurationProperties(prefix = "vegetables")
@PropertySource("classpath:vegetables.properties")
@Data
public class VegetablesConfig {

    private String potato;
    private String eggplant;
    private String greenpepper;

}

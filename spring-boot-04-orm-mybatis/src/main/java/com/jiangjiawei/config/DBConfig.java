package com.jiangjiawei.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 这类用来读取多数据源的配置
 */
@Configuration
public class DBConfig {

//    @ConfigurationProperties 可以将配置文件中的值映射到类中

    @Bean(name = "db1")
    @ConfigurationProperties("spring.datasource.db1")
    public DataSource dataSource1(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "db2")
    @ConfigurationProperties("spring.datasource.db2")
    public DataSource dataSource2(){
        return DataSourceBuilder.create().build();
    }
}

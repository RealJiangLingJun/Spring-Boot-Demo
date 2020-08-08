package com.jiangjiawei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jiangjiawei.mapper")
public class OrmMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmMybatisPlusApplication.class, args);
    }

}

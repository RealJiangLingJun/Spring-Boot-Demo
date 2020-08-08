package com.jiangjiawei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.jiangjiawei.mapper")
@tk.mybatis.spring.annotation.MapperScan("com.jiangjiawei.tk_mapper")
//开启注解扫描 @MapperScan注解只会扫描包中的接口，不会扫描类，所以可以在包中写Provider类。
public class OrmMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmMybatisApplication.class, args);
    }

}

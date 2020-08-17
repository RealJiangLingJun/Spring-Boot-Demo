package com.jiangjiawei.comfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Configuration
 * 声明配置文件类
 * @EnableSwagger2
 * 开启Swagger功能
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 使用Swagger需要创建一个摘要 Docket
     * 具体创建参数：
     *  文档类型参数：DocumentationType.SWAGGER_2
     *  文档通过一系列的选择器组成：api path
     *  select() 中设置 apis(),path()
     *  api 查找生成那些controller的接口
     *  path 在查找出来的接口中进行筛选
     * @return
     */
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
//                .apis(RequestHandlerSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.jiangjiawei.controller"))//指定特定的要获取的包
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    /**
     * 自定义文档介绍
     * 通过APIInfoBuilder 创建一个 ApiInfo
     * 设置ApiInfo的 title，description，version
     * @return
     */
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("Spring-Boot-06-Swagger")
                .description("这是一个简单的Swagger 文档案例")
                .version("1.0 SNAPSHOT")
                .build();
    }
}

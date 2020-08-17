package com.jiangjiawei.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 实体类 嘉宾
 * @APIModel("") 声明实体类的表达含义
 * @ApiModelProperty("") 表示实体类中属性的具体含义,用于接口参数显示
 */
@Data
@AllArgsConstructor
@ApiModel("嘉宾")
public class Guest {

    @ApiModelProperty("名字")
    private String name;
    @ApiModelProperty("角色")
    private String role;

    public Guest() {

    }
}

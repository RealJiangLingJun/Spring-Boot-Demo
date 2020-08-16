package com.jiangjiawei.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
public class Guest {

//    @NotBlank(message = "名字不能为空")//属性值非空串
    @NotBlank(message = "{guest.name.notblank}")//使用配置文件更加灵活
    private String name;
//    @NotBlank(message = "名字不能为空")//属性值非空串
    @NotBlank(message = "{guest.role.notblank}")//使用配置文件更加灵活
    private String role;
}

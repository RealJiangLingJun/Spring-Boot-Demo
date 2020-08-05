package com.jiangjiawei.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class User {

    private String name;
    private String sex;
    private Integer age;
    private String[] friends;

}

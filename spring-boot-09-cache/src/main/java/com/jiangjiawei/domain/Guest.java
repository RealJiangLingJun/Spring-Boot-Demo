package com.jiangjiawei.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 实体类 嘉宾
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guest implements Serializable {


    private long id;

    private String name;

    private String role;

}

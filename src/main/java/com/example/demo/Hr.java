package com.example.demo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Hr implements Serializable {
    private Integer id;

    private String name;

    private String phone;

    private String telephone;

    private String address;

    private Boolean enabled;

    private String username;

    private String password;

    private String userface;

    private String remark;


}

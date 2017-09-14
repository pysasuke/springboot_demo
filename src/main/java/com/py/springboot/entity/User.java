package com.py.springboot.entity;

import lombok.Data;

/**
 * User
 *
 * @author pysasuke
 * @date 2017/9/13
 */
@Data //lombok注解
public class User {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String username;
    private String password;
    private String mobile;
    private String email;
}

package com.example.entity;

import lombok.Data;

/**
 * 账户
 *
 * @author lulufang
 * @date 2023/05/16
 */
@Data
public class Account {

    /**
     * id
     */
    int id;
    /**
     * 电子邮件
     */
    String email;
    /**
     * 用户名
     */
    String username;
    /**
     * 密码
     */
    String password;
}


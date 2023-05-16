package com.example.service;

import com.example.entity.Account;
import com.example.mapper.UserMapper;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 授权服务
 *
 * @author lulufang
 * @date 2023/05/16
 */
@Service
public class AuthorizeService implements UserDetailsService {
    @Resource
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if(username==null){
            throw new  UsernameNotFoundException("用户名不可为空");
        }
        Account resAccount=userMapper.findAccountByNameOrEmail(username);
        if(username==null){
            throw new  UsernameNotFoundException("用户名或者密码错误");
        }
        return User
                .withUsername(resAccount.getUsername())
                .password(resAccount.getPassword())
                .roles("user")
                .build();
    }
}
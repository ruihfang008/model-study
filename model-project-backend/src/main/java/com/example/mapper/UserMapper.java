package com.example.mapper;

import com.example.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * from db_account WHERE username=#{text} or email=#{text}")
    Account findAccountByNameOrEmail(String text);
}

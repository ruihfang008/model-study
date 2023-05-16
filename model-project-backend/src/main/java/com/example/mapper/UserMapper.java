package com.example.mapper;

import com.example.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 用户映射器
 *
 * @author lulufang
 * @date 2023/05/16
 */
@Mapper
public interface UserMapper {
    /**
     * 发现账户按名称或电子邮件
     *
     * @param text 文本
     * @return {@link Account}
     */
    @Select("SELECT * from db_account WHERE username=#{text} or email=#{text}")
    Account findAccountByNameOrEmail(String text);
}

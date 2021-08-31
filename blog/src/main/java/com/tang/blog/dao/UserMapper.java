package com.tang.blog.dao;

import com.tang.blog.bean.User;

import java.util.Map;

/**
 * @author shengyi
 * @create 2021/8/24 - 20:55
 */
public interface UserMapper {
    Map getAnUser(Integer userId);
    int registeOneUser(User user);
    User login(String userEmail, String userPwd);
}

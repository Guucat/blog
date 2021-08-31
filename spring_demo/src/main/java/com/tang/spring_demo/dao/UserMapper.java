package com.tang.spring_demo.dao;

import com.tang.spring_demo.bean.User;

/**
 * @author shengyi
 * @create 2021/8/22 - 21:31
 */
public interface UserMapper {
    User getOneUser(int userId);
}

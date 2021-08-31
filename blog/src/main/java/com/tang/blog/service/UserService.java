package com.tang.blog.service;

import com.tang.blog.bean.User;
import com.tang.blog.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author shengyi
 * @create 2021/8/24 - 21:02
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public Map getAnUser(Integer userId){
        return userMapper.getAnUser(userId);
    }

    public int registeOneUser(User user) {
        return userMapper.registeOneUser(user);
    }

    public User login(String userEmail, String userPwd) {
        return userMapper.login(userEmail, userPwd);
    }
}

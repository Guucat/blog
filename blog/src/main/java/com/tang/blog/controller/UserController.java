package com.tang.blog.controller;

import com.google.gson.Gson;
import com.tang.blog.bean.Message;
import com.tang.blog.bean.User;
import com.tang.blog.dao.UserMapper;
import com.tang.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shengyi
 * @create 2021/8/24 - 20:59
 */
@RestController
@RequestMapping("/blog")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    Gson gson;
    //注册前检查邮箱是否已被注册

    //注册前检查用户名是否重复

    //注册接口
    @PostMapping("/register")
    public String register(String userName, String userPwd, String userEmail) {
        User user = new User(userName, userPwd, userEmail);
        //通过执行成功后影响数据库的行数判断是否执行成功
        int num = userService.registeOneUser(user);
        if (num != 0) {
            return gson.toJson(Message.success(null));
        } else {
            return gson.toJson(Message.fail(null));
        }
    }

    //登录接口,返回用户ID,用户名,用户邮箱(为简化开发仅使用邮箱登录) **考虑使用加密储存
    @PostMapping("/login")
    public String login(String userEmail, String userPwd) {
        User user = userService.login(userEmail, userPwd);
        if (user != null) {
            return gson.toJson(Message.success(user));
        } else {
            return gson.toJson(Message.success(null));
        }
    }
    //仅仅测试框架是否搭建完成
    @RequestMapping("/user")
    public String test(@RequestParam("userId") Integer userId) {
        Map user = userService.getAnUser(userId);
        if (user != null) {
            return gson.toJson(Message.success(user));
        } else {
            return gson.toJson(Message.fail(user));
        }
    }
}

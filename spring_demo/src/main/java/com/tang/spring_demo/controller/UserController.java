package com.tang.spring_demo.controller;


import com.tang.spring_demo.bean.User;
import com.tang.spring_demo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.PrintWriter;

/**
 * @author shengyi
 * @create 2021/8/22 - 22:16
 */

@Controller
public class UserController {
    @Autowired
    UserMapper userMapper;

    @ResponseBody
    @GetMapping("/query")
    public String getOneUser(@RequestParam("userId") int userId) {
        User user = userMapper.getOneUser(userId);
//        res.setContentType("text/json;charset=UTF-8");
//        PrintWriter out = res.getWriter();
//        String str ="{\"user_id\":\"" + s + "\"}";
//        out.println(str);
//        out.close();
        return "HALLO";

    }
    @GetMapping("/")
    public String index(){
        return  "index";
    }

}

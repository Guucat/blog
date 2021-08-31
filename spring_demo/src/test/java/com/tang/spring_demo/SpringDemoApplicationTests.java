package com.tang.spring_demo;

import com.tang.spring_demo.bean.User;
import com.tang.spring_demo.dao.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringDemoApplication.class)
class SpringDemoApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void test() {
        User user = userMapper.getOneUser(5);
        System.out.println(user);
    }

}

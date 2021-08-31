package com.tang.blog;

import com.tang.blog.bean.Comment;
import com.tang.blog.bean.User;
import com.tang.blog.dao.CommentMapper;
import com.tang.blog.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class BlogApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    UserService userService;
    @Autowired
    CommentMapper commentMapper;

    @Test
    void databaseTest() {
//        Map user = userService.getAnUser(2);
//        System.out.println(user);
        List<Comment> comment = commentMapper.queryCommentByArticleId(1);
        System.out.println(comment);
    }

}

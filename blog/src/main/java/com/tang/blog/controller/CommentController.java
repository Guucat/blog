package com.tang.blog.controller;

import com.google.gson.Gson;
import com.tang.blog.bean.Comment;
import com.tang.blog.bean.Message;
import com.tang.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.HashMap;


/**
 * @author shengyi
 * @create 2021/8/24 - 20:59
 */
@RestController
@RequestMapping("/blog")
public class CommentController {
    @Autowired
    CommentService commentService;
    @Autowired
    Gson gson;

    //增加一条评论。若为文章的评论，commentParent = 0,若为评论的评论， commentParent = 被评论的articleId
    @PostMapping("/comment")
    public String comment(Integer userId, Integer articleId, String commentText, Integer commentParent){
        Date commentDate = new Date(new java.util.Date().getTime());
        Comment comment = new Comment(userId, articleId, commentText, 0, commentParent, commentDate);
        int num = commentService.addOneComment(comment);
        System.out.println(num);
        if (num != 0) {
            return gson.toJson(Message.success(null));
        } else {
            return gson.toJson(Message.fail(null));
        }
    }

    //删除一条评论
    @DeleteMapping("/comment")
    public String comment(Integer commentId) {
        int num = commentService.deleteOneComment(commentId);
        if (num != 0) {
            return gson.toJson(Message.success(null));
        } else {
            return gson.toJson(Message.fail(null));
        }
    }

}

package com.tang.blog.service;

import com.tang.blog.bean.Comment;
import com.tang.blog.dao.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shengyi
 * @create 2021/8/24 - 21:03
 */
@Service
public class CommentService {
    @Autowired
    CommentMapper commentMapper;

    public int addOneComment(Comment comment){
        return commentMapper.addOneComment(comment);
    }

    public int deleteOneComment(Integer commentId){
        return commentMapper.deleteOneComment(commentId);
    }
}

package com.tang.blog.dao;

import com.tang.blog.bean.Comment;

import java.util.List;

/**
 * @author shengyi
 * @create 2021/8/24 - 20:56
 */
public interface CommentMapper {
    List<Comment> queryCommentByArticleId(Integer articleId);
    List queryCommentByCommentId(Integer commentid);
    int addOneComment(Comment comment);
    int deleteOneComment(Integer commentId);
}

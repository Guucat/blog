package com.tang.blog.bean;

import java.sql.Date;
import java.util.List;

/**
 * @author shengyi
 * @create 2021/8/24 - 20:38
 */
public class Comment {
    private Integer commentId;
    private Integer userId;
    private Integer articleId;
    private String commentText;
    private Integer commentLike;
    private Integer commentParent;
    private Date commentDate;
    private List<Comment> comment;

    public Comment() {};

    public Comment(Integer userId, Integer articleId, String commentText, Integer commentLike, Integer commentParent, Date commentDate) {
        this.userId = userId;
        this.articleId = articleId;
        this.commentText = commentText;
        this.commentLike = commentLike;
        this.commentParent = commentParent;
        this.commentDate = commentDate;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Integer getCommentLike() {
        return commentLike;
    }

    public void setCommentLike(Integer commentLike) {
        this.commentLike = commentLike;
    }

    public Integer getCommentParent() {
        return commentParent;
    }

    public void setCommentParent(Integer commentParent) {
        this.commentParent = commentParent;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }
}

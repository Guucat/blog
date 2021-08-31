package com.tang.blog.bean;

import java.sql.Date;
import java.util.List;

/**
 * @author shengyi
 * @create 2021/8/24 - 20:29
 */
public class Article {
    private Integer articalId;
    private Integer userId;
    private String articleTitle;
    private String articleText;
    private Integer articleLike;
    private Date articalDate;
    private List<Comment> comments;

    public Article() {};

    public Article(Integer userId, String articleTitle, String articleText, Integer articleLike, Date articalDate) {
        this.userId = userId;
        this.articleText = articleText;
        this.articleTitle = articleTitle;
        this.articleLike = articleLike;
        this.articalDate = articalDate;
    }

    public Integer getArticalId() {
        return articalId;
    }

    public void setArticalId(Integer articalId) {
        this.articalId = articalId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getArticleName() {
        return articleText;
    }

    public void setArticleName(String articleText) {
        this.articleText = articleText;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public Integer getArticleLike() {
        return articleLike;
    }

    public void setArticleLike(Integer articleLike) {
        this.articleLike = articleLike;
    }

    public Date getArticalDate() {
        return articalDate;
    }

    public void setArticalDate(Date articalDate) {
        this.articalDate = articalDate;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getArticleText() {
        return articleText;
    }

    public void setArticleText(String articleText) {
        this.articleText = articleText;
    }
}

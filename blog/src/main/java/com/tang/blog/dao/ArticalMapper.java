package com.tang.blog.dao;

import com.tang.blog.bean.Article;

import java.util.List;

/**
 * @author shengyi
 * @create 2021/8/24 - 20:56
 */
public interface ArticalMapper {
    int addOneArticle(Article article);

    int deleteOneArticle(Integer articleId);

    int updateOneArticle(Integer articleId, String articleTitle, String articleText);

    Article queryOneArticle(Integer articleId);

    List queryAllArticles(Integer userId);
}

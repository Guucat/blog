package com.tang.blog.service;

import com.tang.blog.bean.Article;
import com.tang.blog.dao.ArticalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shengyi
 * @create 2021/8/24 - 21:03
 */
@Service
public class ArticleService {
    @Autowired
    ArticalMapper articalMapper;

    public int addOneArticle(Article article){
        return articalMapper.addOneArticle(article);
    }

    public int deleteOneArticle(Integer articleId){
        return articalMapper.deleteOneArticle(articleId);
    }

    public int updateOneArticle(Integer articleId, String articleTitle, String articleText) {
        return articalMapper.updateOneArticle(articleId, articleTitle, articleText);
    }

    public Article queryOneArticle(Integer aticleId) {
        return articalMapper.queryOneArticle(aticleId);
    }

    public List queryAllArticles(Integer userId){
        return articalMapper.queryAllArticles(userId);
    }
}

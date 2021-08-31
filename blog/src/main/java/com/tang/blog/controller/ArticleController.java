package com.tang.blog.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.tang.blog.bean.Article;
import com.tang.blog.bean.Message;
import com.tang.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;


/**
 * @author shengyi
 * @create 2021/8/24 - 21:00
 */
@RestController
@RequestMapping("/blog")
public class ArticleController {
    @Autowired
    ArticleService articleService;
    @Autowired
    Gson gson;

    //Post 增加一篇博客文章
    @PostMapping("/article")
    public String article(Integer userId, String articleTitle, String articleText) {
        //获取系统当前日期表示博客创建的日期
        Date date= new Date(new java.util.Date().getTime());
        Article article = new Article(userId,articleTitle, articleText, 0, date);
        //通过返回影响的行数判断是否添加成功
        int num = articleService.addOneArticle(article);
        if (num != 0) {
            return gson.toJson(Message.success(null));
        } else {
            return gson.toJson(Message.fail(null));
        }
    }

    //delete 删除一篇博客文章
    @DeleteMapping("/article")
    public String article(Integer articleId){
        int num = articleService.deleteOneArticle(articleId);
        if (num != 0) {
            return gson.toJson(Message.success(null));
        } else {
            return gson.toJson(Message.fail(null));
        }
    }

    //put 修改一篇文章 (传入articleId从而修改 文章标题, 文章内容)
    @PutMapping("/article")
    public String updateArticle(Integer articleId, String articleTitle, String articleText) {
        int num = articleService.updateOneArticle(articleId, articleTitle, articleText);
        if (num != 0) {
            return gson.toJson(Message.success(null));
        } else {
            return gson.toJson(Message.fail(null));
        }
    }

    //通过一个articleId查询一篇文章的具体信息(标题，内容，发表时间，点赞数)及一级评论(评论发表者，内容，时间，点赞数，子评论）
    //一对多级联
    @GetMapping("/article")
    public String getOneArticle(Integer articleId) {
        //通过Article的一个Comment类型的字段，将评论的内容储存在自动映射结果集里
        Article article = articleService.queryOneArticle(articleId);
        if (article != null) {
            return gson.toJson(Message.success(article));
        } else {
            return gson.toJson(Message.fail(null));
        }
    }


    //通过UserId 查询所有articleId,包含内容摘要(此项目中用文章标题替代)、时间, 用于博客主页展示,并进行分页
    @GetMapping("/article/all")
    public String getAllArticles(Integer userId, @RequestParam(value = "pn", defaultValue = "1")Integer pn) {
        //查询前传入查询页码(默认为1)，及每页的大小
        PageHelper.startPage(pn, 6);
        List articles = articleService.queryAllArticles(userId);
        //使用PageInfo包装查询后的结果,封装了详细的分页信息,传入连续显示的页数
        PageInfo pageInfo = new PageInfo(articles, 3);
        if (articles != null) {
            return gson.toJson(Message.success(pageInfo));
        } else {
            return gson.toJson(Message.fail(null));
        }
    }

    //为一篇文章点赞,使用哈希表储存点赞记录，重复点赞取消赞

    @GetMapping("/api/employees/{id}")
    @ResponseBody
    public String getEmployeesById(@PathVariable String id) {
        return "ID: " + id;
    }
}

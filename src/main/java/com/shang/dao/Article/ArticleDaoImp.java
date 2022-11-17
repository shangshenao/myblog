package com.shang.dao.Article;

import com.shang.pojo.Article;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("ArticleDao")
public class ArticleDaoImp implements ArticleDao{
    private SqlSessionTemplate sqlsessionTemplate;

    @Autowired
    public void setSqlsessionTemplate(SqlSessionTemplate sqlsessionTemplate) {
        this.sqlsessionTemplate = sqlsessionTemplate;
    }

    public int insertArticle(int userid, int categoryid, String title, String content_markdown, String content_html, Byte istop) {
       ArticleDao articleDao=sqlsessionTemplate.getMapper(ArticleDao.class);
        return articleDao.insertArticle(userid, categoryid, title, content_markdown, content_html, istop);
    }

    public int updateArticle(int articleid, int userid, String categoryid, String title, String content_markdown, String content_html) {
        ArticleDao articleDao=sqlsessionTemplate.getMapper(ArticleDao.class);
        return articleDao.updateArticle(articleid, userid, categoryid, title, content_markdown, content_html);
    }

    public int deleteArticle(int articleid) {
        ArticleDao articleDao=sqlsessionTemplate.getMapper(ArticleDao.class);
        return articleDao.deleteArticle(articleid);
    }

    public Article queryArticle(int articleid) {
        ArticleDao articleDao=sqlsessionTemplate.getMapper(ArticleDao.class);
        return articleDao.queryArticle(articleid);
    }

    public List<Article> queryArticles(String categoryname, String title, String[] tags, int currentpageno, int pagesize) {
        ArticleDao articleDao=sqlsessionTemplate.getMapper(ArticleDao.class);
        return articleDao.queryArticles(categoryname, title, tags, currentpageno, pagesize);
    }

    public List<Article> queryArticlesBytime(int currentpageno, int pagesize) {
        ArticleDao articleDao=sqlsessionTemplate.getMapper(ArticleDao.class);
        return articleDao.queryArticlesBytime(currentpageno, pagesize);
    }

    public int getArticlesCount(String categoryname,String title,String[] tags) {
        ArticleDao articleDao=sqlsessionTemplate.getMapper(ArticleDao.class);
        return articleDao.getArticlesCount(categoryname, title, tags);
    }
}

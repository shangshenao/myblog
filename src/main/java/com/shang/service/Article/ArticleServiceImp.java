package com.shang.service.Article;

import com.shang.dao.Article.ArticleDao;
import com.shang.pojo.Article;
import com.shang.utils.ConstVar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("ArticleService")
public class ArticleServiceImp implements ArticleService{
    private ArticleDao articleDao;
    @Autowired
    public void setArticleDao(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    public int insertArticle(int userid, int categoryid, String title, String content_markdown, String content_html, Byte istop) {

        return articleDao.insertArticle(userid, categoryid, title, content_markdown, content_html, istop);
    }
    //逻辑删除article
    public int deleteArticle(int articleid) {
        return articleDao.deleteArticle(articleid);
    }

    public int updateArticle(int articleid, int categoryid, String title, String content_markdown, String content_html, Byte istop) {
        return articleDao.updateArticle(articleid, categoryid, title, content_markdown, content_html, istop);
    }

    public int updateArticleData(int articleid, int viewcount) {
        return articleDao.updateArticleData(articleid, viewcount,0,0,0);
    }

    public Article getArticleByid(int articleid) {
        return articleDao.queryArticle(articleid);
    }

    public List<Article> getArticles(String categoryname, String title, String[] tags, int currentpageno) {
        int pagesize= ConstVar.PAGESIZE;
        return articleDao.queryArticles(categoryname, title, tags, currentpageno, pagesize);
    }

    public int getArticlesCount(String categoryname, String title, String[] tags) {
        return articleDao.getArticlesCount(categoryname, title, tags);
    }

    public List<Article> getArticlesBytime(int currentpageno) {

        return articleDao.queryArticlesBytime(currentpageno,ConstVar.PAGESIZE);
    }
}

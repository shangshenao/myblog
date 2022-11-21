package com.shang.service.Article;

import com.shang.pojo.Article;

import java.util.List;

public interface ArticleService {
    //插入一篇文章
    public int insertArticle(int userid, int categoryid, String title, String content_markdown, String content_html, Byte istop);
    //删除一篇文章
    public int deleteArticle(int articleid);
    //更新文章
    public int updateArticle(int articleid, int categoryid, String title, String content_markdown, String content_html,Byte istop);
    //更新文章数据
    public int updateArticleData(int articleid, int viewcount);
    //查找指定文章
    Article getArticleByid(int articleid);
    //按条件查询文章
    public List<Article> getArticles(String categoryname, String title, String[] tags, int currentpageno);
    //获取对应数量
    public int getArticlesCount(String categoryname,String title,String[] tags);
    //展示所有文章
    public List<Article> getArticlesBytime(int currentpageno);


}

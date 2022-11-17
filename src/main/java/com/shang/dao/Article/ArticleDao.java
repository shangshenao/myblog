package com.shang.dao.Article;

import com.shang.pojo.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleDao {
    //插入一个文章
    public int insertArticle(@Param("userid") int userid,@Param("categoryid") int categoryid,@Param("title") String title,@Param("content_markdown") String content_markdown,@Param("content_html") String content_html,@Param("istop") Byte istop);
    //更改一篇文章
    public int updateArticle(@Param("articleid") int articleid,@Param("userid") int userid,@Param("categoryid") String categoryid,@Param("title") String title,@Param("content_markdown") String content_markdown,@Param("content_html") String content_html);
    //删除一篇文章
    public int deleteArticle(@Param("articleid") int articleid);
    //根据id查文章(需要显示文章全部内容) 返回的评论只有根评论
    public Article queryArticle(@Param("articleid") int articleid);
    //根据userid，分类，标签，title，查询文章集(显示文章概要)
    public List<Article> queryArticles(@Param("categoryname") String categoryname,@Param("title") String title,@Param("tags") String[] tags,@Param("currentpageno") int currentpageno,@Param("pagesize") int pagesize);
    //按时间顺序查询全部文章(显示文章概要)
    public List<Article> queryArticlesBytime(@Param("currentpageno") int currentpageno,@Param("pagesize") int pagesize);
    //查询文章的数量
    public int getArticlesCount(@Param("categoryname") String categoryname,@Param("title") String title,@Param("tags") String[] tags);
}

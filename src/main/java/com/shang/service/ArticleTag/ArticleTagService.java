package com.shang.service.ArticleTag;

public interface ArticleTagService {
    //插入文章标签记录
     int insertArticleTag( int articleid,int tagid);
     //更新记录
     public int updateArticleTag(int oldarticleid,int oldtagid,int newarticleid,int newtagid);
     //删除记录
     public int deleteArticleTag(int articleid,int tagid);

}

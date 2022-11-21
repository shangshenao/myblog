package com.shang.dao.ArticleTag;

import org.apache.ibatis.annotations.Param;

public interface ArticleTagDao {
    //增加一条文章标签记录
    public int insertArticleTag(@Param("articleid") int articleid,@Param("tagid") int tagid);
    //更新一条记录
    public int updateArticleTag(@Param("oldarticleid") int oldarticleid,@Param("oldtagid") int oldtagid,@Param("newarticleid") int newarticleid,@Param("newtagid") int newtagid);
    //删除一条记录
    public int deleteArticleTag(@Param("articleid") int articleid,@Param("tagid") int tagid);
    //根据articleid删除所有记录
    public int deleteArticleTagByid(@Param("articleid") int articleid);
}

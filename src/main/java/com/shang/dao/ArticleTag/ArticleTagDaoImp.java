package com.shang.dao.ArticleTag;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ArticleTagDao")
public class ArticleTagDaoImp implements ArticleTagDao{
    private SqlSessionTemplate sqlSessionTemplate;
    @Autowired
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public int insertArticleTag( int articleid,int tagid) {
        ArticleTagDao articleTagDao=sqlSessionTemplate.getMapper(ArticleTagDao.class);
        return articleTagDao.insertArticleTag(articleid, tagid);
    }

    public int updateArticleTag(int oldarticleid,int oldtagid,int newarticleid,int newtagid) {
        ArticleTagDao articleTagDao=sqlSessionTemplate.getMapper(ArticleTagDao.class);
        return articleTagDao.updateArticleTag(oldarticleid,oldarticleid,newarticleid,newtagid);
    }

    public int deleteArticleTag(int articleid,int tagid) {
        ArticleTagDao articleTagDao=sqlSessionTemplate.getMapper(ArticleTagDao.class);
        return articleTagDao.deleteArticleTag(articleid, tagid);
    }
}

package com.shang.service.ArticleTag;

import com.shang.dao.ArticleTag.ArticleTagDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ArticleTagService")
public class ArticleTagServiceImp implements ArticleTagService{
    private ArticleTagDao articleTagDao;

    @Autowired
    public void setArticleTagDao(ArticleTagDao articleTagDao) {
        this.articleTagDao = articleTagDao;
    }

    public int insertArticleTag(int articleid, int tagid) {
        return articleTagDao.insertArticleTag(articleid, tagid);
    }

    public int updateArticleTag(int oldarticleid, int oldtagid, int newarticleid, int newtagid) {
        return articleTagDao.updateArticleTag(oldarticleid, oldtagid, newarticleid, newtagid);
    }

    public int deleteArticleTag(int articleid, int tagid) {
        return articleTagDao.deleteArticleTag(articleid, tagid);
    }
}

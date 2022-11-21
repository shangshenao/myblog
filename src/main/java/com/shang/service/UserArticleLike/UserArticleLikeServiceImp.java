package com.shang.service.UserArticleLike;

import com.shang.dao.Article.ArticleDao;
import com.shang.dao.UserArticleLike.UserArticleLikeDao;
import com.shang.pojo.UserArticleLike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("UserArticleLikeService")
public class UserArticleLikeServiceImp implements UserArticleLikeService{
    private UserArticleLikeDao userArticleLikeDao;
    private ArticleDao articleDao;

    @Autowired
    public void setArticleDao(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    @Autowired
    public void setUserArticleLikeDao(UserArticleLikeDao userArticleLikeDao) {
        this.userArticleLikeDao = userArticleLikeDao;
    }

    @Transactional(rollbackFor=Exception.class)
    public int insertUserArticleLike(int userid, int articleid) throws Exception {
        int res=userArticleLikeDao.insertUserArticleLike(userid,articleid);
        articleDao.updateArticleData(articleid,0,1,0,0);
        return res;
    }

    @Transactional(rollbackFor=Exception.class)
    public int deleteUserArticleLike(int userid, int articleid) throws Exception {
        int res=userArticleLikeDao.deleteUserArticleLike(userid,articleid);
        articleDao.updateArticleData(articleid,0,-1,0,0);
        return res;
    }

    public int deleteUserArticleLikeByAid(int articleid) {
        return userArticleLikeDao.deleteUserArticleLikeByAid(articleid);
    }

    public List<UserArticleLike> queryUserArticleLikes(int userid) {
        return userArticleLikeDao.queryUserArticleLikes(userid);
    }
}

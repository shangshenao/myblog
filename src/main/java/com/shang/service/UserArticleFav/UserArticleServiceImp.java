package com.shang.service.UserArticleFav;

import com.shang.dao.Article.ArticleDao;
import com.shang.dao.User.UserDao;
import com.shang.dao.UserArticleFav.UserArticleFavDao;
import com.shang.pojo.UserArticleFav;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("UserArticleFavService")
public class UserArticleServiceImp implements UserArticleFavService{

    private UserArticleFavDao userArticleFavDao;
    private ArticleDao articleDao;
    @Autowired
    public void setUserArticleFavDao(UserArticleFavDao userArticleFavDao) {
        this.userArticleFavDao = userArticleFavDao;
    }

    @Autowired
    public void setArticleDao(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    @Transactional(rollbackFor=Exception.class)
    public int insertUserArticleFav(int userid, int articleid) throws Exception {
        int res=userArticleFavDao.insertUserArticleFav(userid, articleid);
        articleDao.updateArticleData(articleid,0,0,1,0);
        return res;
    }
    @Transactional(rollbackFor=Exception.class)
    public int deleteUserArticleFav(int userid, int articleid) throws Exception {
        int res=userArticleFavDao.deleteUserArticleFav(userid, articleid);
        articleDao.updateArticleData(articleid,0,0,-1,0);
        return res;
    }

    public int deleteUserArticleFavByAid(int articleid) {
        return userArticleFavDao.deleteUserArticleFavByAid(articleid);
    }

    public List<UserArticleFav> queryUserArticleFavByuserid(int userid) {
        return userArticleFavDao.queryUserArticleFavByuserid(userid);
    }
}

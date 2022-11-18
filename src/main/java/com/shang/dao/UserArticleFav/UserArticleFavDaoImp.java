package com.shang.dao.UserArticleFav;

import com.shang.dao.UserArticleComment.UserArticleCommentDao;
import com.shang.pojo.UserArticleFav;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("UserArticleFavDao")
public class UserArticleFavDaoImp implements UserArticleFavDao{
    private SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public int insertUserArticleFav(int userid, int articleid) {
        UserArticleFavDao userArticleFavDao=sqlSessionTemplate.getMapper(UserArticleFavDao.class);
        return userArticleFavDao.insertUserArticleFav(userid, articleid);
    }

    public int deleteUserArticleFav(int userid, int articleid) {
        UserArticleFavDao userArticleFavDao=sqlSessionTemplate.getMapper(UserArticleFavDao.class);
        return userArticleFavDao.deleteUserArticleFav(userid, articleid);
    }

    public List<UserArticleFav> queryUserArticleFavByuserid(int userid) {
        UserArticleFavDao userArticleFavDao=sqlSessionTemplate.getMapper(UserArticleFavDao.class);
        return userArticleFavDao.queryUserArticleFavByuserid(userid);
    }
}

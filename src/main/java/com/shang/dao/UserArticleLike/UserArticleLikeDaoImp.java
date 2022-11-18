package com.shang.dao.UserArticleLike;

import com.shang.pojo.UserArticleLike;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("UserArticleLikeDao")
public class UserArticleLikeDaoImp implements UserArticleLikeDao{
    private SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public int insertUserArticleLike(int userid, int articleid) {
        UserArticleLikeDao userArticleLikeDao = sqlSessionTemplate.getMapper(UserArticleLikeDao.class);
        return userArticleLikeDao.insertUserArticleLike(userid,articleid);
    }

    public int deleteUserArticleLike(int userid, int articleid) {
        UserArticleLikeDao userArticleLikeDao = sqlSessionTemplate.getMapper(UserArticleLikeDao.class);
        return userArticleLikeDao.deleteUserArticleLike(userid,articleid);
    }

    public List<UserArticleLike> queryUserArticleLikes(int userid) {
        UserArticleLikeDao userArticleLikeDao = sqlSessionTemplate.getMapper(UserArticleLikeDao.class);
        return userArticleLikeDao.queryUserArticleLikes(userid);
    }
}

package com.shang.dao.UserCommentLike;

import com.shang.pojo.UserCommentLike;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("UserCommentLikeDao")
public class UserCommentLikeDaoImp implements UserCommentLikeDao{

    private SqlSessionTemplate sqlSessionTemplate;
    @Autowired
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public int insertUserCommentLike(int userid, int commentid) {
        UserCommentLikeDao userCommentLikeDao=sqlSessionTemplate.getMapper(UserCommentLikeDao.class);
        return userCommentLikeDao.insertUserCommentLike(userid,commentid);
    }

    public int deleteUserCommentLike(int userid, int commentid) {
        UserCommentLikeDao userCommentLikeDao=sqlSessionTemplate.getMapper(UserCommentLikeDao.class);
        return userCommentLikeDao.deleteUserCommentLike(userid,commentid);
    }

    public List<UserCommentLike> queryUserCommentLikes(int userid) {
        UserCommentLikeDao userCommentLikeDao=sqlSessionTemplate.getMapper(UserCommentLikeDao.class);
        return userCommentLikeDao.queryUserCommentLikes(userid);
    }
}

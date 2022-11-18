package com.shang.dao.UserArticleComment;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("UserArticleCommentDao")
public class UserArticleCommentDaoImp implements UserArticleCommentDao {

    private SqlSessionTemplate sqlSessionTemplate;
    @Autowired
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public int insertUserArticleComment(int userid, int articleid) {
        UserArticleCommentDao userArticleCommentDao  = sqlSessionTemplate.getMapper(UserArticleCommentDao.class);
        return  userArticleCommentDao.insertUserArticleComment(userid, articleid);
    }

    public int deleteUserArticleComment(int userid, int articleid) {
        UserArticleCommentDao userArticleCommentDao  = sqlSessionTemplate.getMapper(UserArticleCommentDao.class);
        return  userArticleCommentDao.deleteUserArticleComment(userid, articleid);
    }
}

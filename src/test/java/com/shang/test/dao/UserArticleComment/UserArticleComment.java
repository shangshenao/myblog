package com.shang.test.dao.UserArticleComment;

import com.shang.dao.Article.ArticleDao;
import com.shang.dao.UserArticleComment.UserArticleCommentDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserArticleComment {
    @Test
    public void insertUserArticleComment(){
        ClassPathXmlApplicationContext cpx=  new ClassPathXmlApplicationContext("configcontext.xml");
        UserArticleCommentDao userArticleCommentDao= cpx.getBean(UserArticleCommentDao.class);
        System.out.println(userArticleCommentDao.insertUserArticleComment(1,1));
    }
}

package com.shang.test.dao.Comment;

import com.shang.dao.Article.ArticleDao;
import com.shang.dao.Comment.CommentDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Comment {
    @Test
    public void queryCommentsByrootid(){
        ClassPathXmlApplicationContext cpx=  new ClassPathXmlApplicationContext("configcontext.xml");
        CommentDao commentDao= cpx.getBean("CommentDao",CommentDao.class);
        System.out.println(commentDao.queryCommentsByrootid(1));
    }
}

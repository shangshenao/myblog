package com.shang.test.dao.UserCommentLike;

import com.shang.dao.UserCommentLike.UserCommentLikeDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserCommentLike {
    @Test
    public void insertUserCommentLike() throws Exception {
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("configcontext.xml");
        UserCommentLikeDao userCommentLikeDao = cpx.getBean("UserCommentLikeDao", UserCommentLikeDao.class);
        System.out.println(userCommentLikeDao.insertUserCommentLike(3, 1));
    }
    @Test
    public void queryUserCommentLikes(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("configcontext.xml");
        UserCommentLikeDao userCommentLikeDao = cpx.getBean("UserCommentLikeDao", UserCommentLikeDao.class);
        System.out.println(userCommentLikeDao.queryUserCommentLikes(1));
    }
    @Test
    public void deleteUserCommentLike() throws Exception {
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("configcontext.xml");
        UserCommentLikeDao userCommentLikeDao = cpx.getBean("UserCommentLikeDao", UserCommentLikeDao.class);
        System.out.println(userCommentLikeDao.deleteUserCommentLike(3,1));
    }
}

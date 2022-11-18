package com.shang.test.dao.UserArticleLike;

import com.shang.dao.UserArticleFav.UserArticleFavDao;
import com.shang.dao.UserArticleLike.UserArticleLikeDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserArticleLike {
    @Test
    public void insertUserArticleLike(){
        ClassPathXmlApplicationContext cpx=  new ClassPathXmlApplicationContext("configcontext.xml");
        UserArticleLikeDao userArticleLikeDao= cpx.getBean(UserArticleLikeDao.class);
        System.out.println(userArticleLikeDao.insertUserArticleLike(1,2));
    }
    @Test
    public void deleteUserArticleLike(){
        ClassPathXmlApplicationContext cpx=  new ClassPathXmlApplicationContext("configcontext.xml");
        UserArticleLikeDao userArticleLikeDao= cpx.getBean(UserArticleLikeDao.class);
        System.out.println(userArticleLikeDao.deleteUserArticleLike(1,2));
    }
    @Test
    public void queryUserArticleLikes(){
        ClassPathXmlApplicationContext cpx=  new ClassPathXmlApplicationContext("configcontext.xml");
        UserArticleLikeDao userArticleLikeDao= cpx.getBean(UserArticleLikeDao.class);
        System.out.println(userArticleLikeDao.queryUserArticleLikes(1));
    }
}

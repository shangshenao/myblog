package com.shang.test.dao.UserArticleFav;

import com.shang.dao.UserArticleComment.UserArticleCommentDao;
import com.shang.dao.UserArticleFav.UserArticleFavDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserArticleFav {
    @Test
    public void insertUserArticleFav() throws Exception {
        ClassPathXmlApplicationContext cpx=  new ClassPathXmlApplicationContext("configcontext.xml");
        UserArticleFavDao userArticleFavDao= cpx.getBean(UserArticleFavDao.class);
        System.out.println(userArticleFavDao.insertUserArticleFav(1,1));
    }
    @Test
    public void deleteUserArticleFav() throws Exception {
        ClassPathXmlApplicationContext cpx=  new ClassPathXmlApplicationContext("configcontext.xml");
        UserArticleFavDao userArticleFavDao= cpx.getBean(UserArticleFavDao.class);
        System.out.println(userArticleFavDao.deleteUserArticleFav(1,1));
    }
    @Test
    public void queryUserArticleFavByuserid(){
        ClassPathXmlApplicationContext cpx=  new ClassPathXmlApplicationContext("configcontext.xml");
        UserArticleFavDao userArticleFavDao= cpx.getBean(UserArticleFavDao.class);
        System.out.println(userArticleFavDao.queryUserArticleFavByuserid(1));
    }
}

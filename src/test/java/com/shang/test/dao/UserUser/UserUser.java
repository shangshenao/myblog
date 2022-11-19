package com.shang.test.dao.UserUser;

import com.shang.dao.UserCommentLike.UserCommentLikeDao;
import com.shang.dao.UserUser.UserUserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserUser {
    @Test
    public void insertUserUser(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("configcontext.xml");
        UserUserDao userUserDao = cpx.getBean("UserUserDao", UserUserDao.class);
        System.out.println(userUserDao.insertUserUser(2, 3));
    }
    @Test
    public void deletetUserUser(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("configcontext.xml");
        UserUserDao userUserDao = cpx.getBean("UserUserDao", UserUserDao.class);
        System.out.println(userUserDao.deletetUserUser(2, 3));
    }
    @Test
    public void queryFansByMainuserid(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("configcontext.xml");
        UserUserDao userUserDao = cpx.getBean("UserUserDao", UserUserDao.class);
        System.out.println(userUserDao.queryFansByMainuserid(1));
    }
    @Test
    public void queryUsersByFanuserid(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("configcontext.xml");
        UserUserDao userUserDao = cpx.getBean("UserUserDao", UserUserDao.class);
        System.out.println(userUserDao.queryUsersByFanuserid(3));
    }
}

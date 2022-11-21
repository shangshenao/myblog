package com.shang.test.dao.User;

import com.shang.dao.User.UserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {
    @Test
    public void queryUserByid(){
        ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("configcontext.xml");
       UserDao userdao= cpx.getBean("UserDao",UserDao.class);
       System.out.println(userdao.queryUserByid(1));
    }
    @Test
    public void queryUserByname(){
        ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("configcontext.xml");
        UserDao userdao= cpx.getBean("UserDao",UserDao.class);
        System.out.println(userdao.queryUserByname("chenjianbo",0,5));
    }
    @Test
    public void getUserCountByname(){
        ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("configcontext.xml");
        UserDao userdao= cpx.getBean("UserDao",UserDao.class);
        System.out.println(userdao.getUserCountByname(""));
    }
    @Test
    public void insertUser(){
        ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("configcontext.xml");
        UserDao userdao= cpx.getBean("UserDao",UserDao.class);
        System.out.println(userdao.insertUser("chenjianbo","hhh","tt.png","student","hubei"));
    }
    @Test
    public void updateUser(){
        ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("configcontext.xml");
        UserDao userdao= cpx.getBean("UserDao",UserDao.class);
        System.out.println(userdao.updateUser(1,"shang","hhh","tt.png","student","hubei"));
    }

    @Test
    public void queryUserByNamePwd(){
        ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("configcontext.xml");
        UserDao userdao= cpx.getBean("UserDao",UserDao.class);
        System.out.println(userdao.queryUserByNamePwd("shang","hhh"));
    }
}

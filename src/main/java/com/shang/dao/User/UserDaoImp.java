package com.shang.dao.User;

import com.shang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("UserDao")
public class UserDaoImp implements UserDao{
    private SqlSessionTemplate sqlsessionTemplate;

   @Autowired
    public void setSqlsessionTemplate(SqlSessionTemplate sqlsessionTemplate) {
        this.sqlsessionTemplate = sqlsessionTemplate;
    }

    public int insertUser(String username, String userpwd, String head, String userrole, String userlocal) {
       UserDao userDao=sqlsessionTemplate.getMapper(UserDao.class);

        return userDao.insertUser(username, userpwd, head, userrole, userlocal);
    }

    public int updateUser(int userid, String username, String userpwd, String head, String userrole, String userlocal) {
        UserDao userDao=sqlsessionTemplate.getMapper(UserDao.class);

        return userDao.updateUser(userid, username, userpwd, head, userrole, userlocal);
    }

    public int deleteUser(int userid) {
        UserDao userDao=sqlsessionTemplate.getMapper(UserDao.class);

        return userDao.deleteUser(userid);
    }

    public User queryUserByNamePwd(String username, String userpwd) {
        UserDao userDao=sqlsessionTemplate.getMapper(UserDao.class);

        return userDao.queryUserByNamePwd(username, userpwd);
    }

    public User queryUserByid(int userid) {
        UserDao userDao=sqlsessionTemplate.getMapper(UserDao.class);

        return userDao.queryUserByid(userid);
    }

    public List<User> queryUserByname(String username, int currentpageno, int pagesize) {
        UserDao userDao=sqlsessionTemplate.getMapper(UserDao.class);

        return userDao.queryUserByname(username, currentpageno, pagesize);
    }

    public int getUserCountByname(String username) {
        UserDao userDao=sqlsessionTemplate.getMapper(UserDao.class);

        return userDao.getUserCountByname(username);
    }
}

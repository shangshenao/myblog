package com.shang.service.User;

import com.shang.utils.ConstVar;
import com.shang.dao.User.UserDao;
import com.shang.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("UserService")
public class UserServiceImp implements UserService{
    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public int insertUser(String username, String userpwd, String head, String userrole, String userlocal) {
        int res=0;
        //判断用户密码是否为空
        if(username!=null&&!username.equals("")&&userpwd!=null&&!userpwd.equals(""))
              res=userDao.insertUser(username, userpwd, head, userrole, userlocal);
        return res;
    }

    public int updateUser(int userid, String username, String userpwd, String head, String userrole, String userlocal) {
        int res=0;
        //判断用户密码是否为空
        if(username!=null&&!username.equals("")&&userpwd!=null&&!userpwd.equals(""))
            res=userDao.updateUser(userid, username, userpwd, head, userrole, userlocal);
        return res;
    }

    public User getLoginUser(String username, String password) {

        return  userDao.queryUserByNamePwd(username, password);
    }

    public User getUser(int userid) {
        return userDao.queryUserByid(userid);
    }

    public List<User> getUsers(String username, int currentpageno) {
        int cp=0;
        int pz= ConstVar.PAGESIZE;
        if(currentpageno!=0)
            cp=currentpageno;
        return userDao.queryUserByname(username, cp, pz);
    }

    public int getUsersCount(String username) {
        return userDao.getUserCountByname(username);
    }
}

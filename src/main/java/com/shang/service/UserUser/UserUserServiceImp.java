package com.shang.service.UserUser;

import com.shang.dao.UserUser.UserUserDao;
import com.shang.pojo.UserUser;

import java.util.List;

public class UserUserServiceImp implements UserUserService{
    private UserUserDao userUserDao;
    public int insertUserUser(int mainuserid, int fanuserid) {
        return userUserDao.insertUserUser(mainuserid,fanuserid);
    }

    public int deletetUserUser(int mainuserid, int fanuserid) {
        return deletetUserUser(mainuserid, fanuserid);
    }

    public List<UserUser> queryFansByMainuserid(int mainuserid) {
        return queryFansByMainuserid(mainuserid);
    }

    public List<UserUser> queryUsersByFanuserid(int fanuserid) {
        return queryUsersByFanuserid(fanuserid);
    }
}

package com.shang.dao.UserUser;

import com.shang.pojo.UserUser;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("UserUserDao")
public class UserUserDaoImp implements UserUserDao{
    private SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public int insertUserUser(int mainuserid, int fanuserid) {
        UserUserDao userDao=sqlSessionTemplate.getMapper(UserUserDao.class);
        return  userDao.insertUserUser(mainuserid,fanuserid);
    }

    public int deletetUserUser(int mainuserid, int fanuserid) {
        UserUserDao userDao=sqlSessionTemplate.getMapper(UserUserDao.class);
        return  userDao.deletetUserUser(mainuserid,fanuserid);
    }

    public List<UserUser> queryFansByMainuserid(int mainuserid) {
        UserUserDao userDao=sqlSessionTemplate.getMapper(UserUserDao.class);
        return  userDao.queryFansByMainuserid(mainuserid);
    }

    public List<UserUser> queryUsersByFanuserid(int fanuserid) {
        UserUserDao userDao=sqlSessionTemplate.getMapper(UserUserDao.class);
        return  userDao.queryUsersByFanuserid(fanuserid);
    }
}

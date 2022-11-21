package com.shang.service.User;

import com.shang.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    //插入用户
    int insertUser(String username, String userpwd, String head, String userrole, String userlocal);
    //更新用户
    int updateUser(int userid, String username, String userpwd, String head, String userrole, String userlocal);
    //获取登录用户
    User getLoginUser(String username,String password);
    //获取当前用户
    User getUser(int userid);
    //获取用户列表
    List<User> getUsers(String username, int currentpageno);
    //获取用户列表总数量
    int getUsersCount(String username);
}

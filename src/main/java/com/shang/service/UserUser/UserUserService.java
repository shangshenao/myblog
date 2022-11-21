package com.shang.service.UserUser;

import com.shang.pojo.UserUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserUserService {
    //插入用户关注记录
    public int insertUserUser(int mainuserid,int fanuserid);
    //删除用户关注记录
    public int deletetUserUser(int mainuserid,int fanuserid);
    //根据user查询他的fans
    public List<UserUser> queryFansByMainuserid(int mainuserid);
    //根据user查询他的关注
    public List<UserUser> queryUsersByFanuserid(int fanuserid);
}

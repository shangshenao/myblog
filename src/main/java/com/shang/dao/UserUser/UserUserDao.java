package com.shang.dao.UserUser;

import com.shang.pojo.UserUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserUserDao {
    //插入用户关注记录
    public int insertUserUser(@Param("mainuserid") int mainuserid,@Param("fanuserid") int fanuserid);
    //删除用户关注记录
    public int deletetUserUser(@Param("mainuserid") int mainuserid,@Param("fanuserid") int fanuserid);
    //根据user查询他的fans
    public List<UserUser> queryFansByMainuserid(@Param("mainuserid") int mainuserid);
    //根据user查询他的关注
    public List<UserUser> queryUsersByFanuserid(@Param("fanuserid") int fanuserid);

}

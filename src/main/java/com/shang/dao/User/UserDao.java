package com.shang.dao.User;

import com.shang.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    //插入用户
    public int insertUser(@Param("username") String username,@Param("userpwd") String userpwd,@Param("head") String head,@Param("userrole") String userrole,@Param("userlocal") String userlocal);
    //更新用户
    public int updateUser(@Param("userid") int userid,@Param("username") String username,@Param("userpwd") String userpwd,@Param("head") String head,@Param("userrole") String userrole,@Param("userlocal") String userlocal);
    //删除用户(最后测试)
    public int deleteUser(@Param("userid") int userid);
    //根据userid查找用户（需要展示文章概要）
    public User queryUserByid(@Param("userid") int userid);
    //根据username查找用户集（仅显示用户）
    public List<User> queryUserByname(@Param("username") String username,@Param("currentpageno") int currentpageno,@Param("pagesize") int pagesize);
    //根据username获取用户集数量
    public List<User> getUserCountByname(@Param("username") String username);
}

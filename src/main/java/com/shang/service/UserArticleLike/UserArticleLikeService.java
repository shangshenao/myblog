package com.shang.service.UserArticleLike;

import com.shang.pojo.UserArticleLike;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserArticleLikeService {
    //增加用户点赞文章记录
    int insertUserArticleLike(int userid,int articleid) throws Exception;
    //删除用户点赞文章记录
    int deleteUserArticleLike(int userid,int articleid) throws Exception;
    //根据文章删除所有点赞记录
    int deleteUserArticleLikeByAid(int articleid);
    //查询一个用户的所有点赞记录
    List<UserArticleLike> queryUserArticleLikes(int userid);
}

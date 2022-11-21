package com.shang.dao.UserArticleLike;

import com.shang.pojo.UserArticleLike;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserArticleLikeDao {
    //增加用户点赞文章记录
    int insertUserArticleLike(@Param("userid") int userid,@Param("articleid") int articleid) throws Exception;
    //删除用户点赞文章记录
    int deleteUserArticleLike(@Param("userid") int userid,@Param("articleid") int articleid) throws Exception;
    //根据文章删除所有点赞记录
    int deleteUserArticleLikeByAid(@Param("articleid") int articleid);
    //查询一个用户的所有点赞记录
    List<UserArticleLike> queryUserArticleLikes(@Param("userid") int userid);
}

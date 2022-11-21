package com.shang.dao.UserArticleFav;

import com.shang.pojo.UserArticleFav;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserArticleFavDao {
    //增加用户文章的收藏
    public int insertUserArticleFav(@Param("userid") int userid, @Param("articleid") int articleid) throws Exception;
    //删除用户文章的收藏
    public int deleteUserArticleFav(@Param("userid") int userid,@Param("articleid") int articleid) throws Exception;
    //根据文章删除该所有用户收藏的记录
    public int deleteUserArticleFavByAid(@Param("articleid") int articleid);
    //查询用户收藏的文章
    public List<UserArticleFav> queryUserArticleFavByuserid(@Param("userid") int userid);
}

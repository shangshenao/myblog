package com.shang.service.UserArticleFav;

import com.shang.pojo.UserArticleFav;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserArticleFavService {
    //增加用户文章的收藏
    int insertUserArticleFav(int userid,int articleid) throws Exception;
    //删除用户文章的收藏
    public int deleteUserArticleFav(int userid,int articleid) throws Exception;
    //根据文章删除该所有用户收藏的记录
    public int deleteUserArticleFavByAid(int articleid);
    //查询用户收藏的文章
    public List<UserArticleFav> queryUserArticleFavByuserid(int userid);

}

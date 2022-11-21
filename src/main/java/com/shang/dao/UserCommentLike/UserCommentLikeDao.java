package com.shang.dao.UserCommentLike;

import com.shang.pojo.UserCommentLike;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserCommentLikeDao {
    //增加用户点赞评论记录
    int insertUserCommentLike(@Param("userid") int userid, @Param("commentid") int commentid) throws Exception;
    //删除记录
    int deleteUserCommentLike(@Param("userid") int userid,@Param("commentid") int commentid) throws Exception;

    //按用户和评论查找指定记录
    UserCommentLike queryUserCommentLike(@Param("userid") int userid,@Param("commentid") int commentid);
    //按用户查询点赞记录
    List<UserCommentLike> queryUserCommentLikes(@Param("userid") int userid);
}

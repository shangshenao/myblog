package com.shang.service.UserCommentLike;

import com.shang.pojo.UserCommentLike;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserCommentLikeService {
    //增加用户点赞评论记录
    int insertUserCommentLike(int userid, int commentid) throws Exception;
    //删除记录
    int deleteUserCommentLike(int userid,int commentid) throws Exception;
    //按用户和评论查找指定记录
    UserCommentLike queryUserCommentLike(int userid,int commentid);
    //按用户查询点赞记录
    List<UserCommentLike> queryUserCommentLikes(int userid);
}

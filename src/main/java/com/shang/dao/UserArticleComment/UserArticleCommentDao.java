package com.shang.dao.UserArticleComment;

import org.apache.ibatis.annotations.Param;

public interface UserArticleCommentDao {
    //插入用户评论记录
    public int insertUserArticleComment(@Param("userid") int userid,@Param("articleid") int articleid);
    //删除用户评论记录
    public int deleteUserArticleComment(@Param("userid") int userid,@Param("articleid") int articleid);
}

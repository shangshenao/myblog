package com.shang.dao.Comment;

import com.shang.pojo.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentDao {
    //插入评论
    public int insertComment(@Param("articleid") int articleid,@Param("commentfid") int commentfid,@Param("userid") int userid,@Param("content") String content,@Param("rootid") int rootid );
    //删除评论
    public int deleteComment(@Param("commentid") int commentid);
    //根据rootcomment查找所有子comment
    public List<Comment> queryCommentsByrootid(@Param("rootid") int rootid);
}

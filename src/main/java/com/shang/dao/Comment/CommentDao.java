package com.shang.dao.Comment;

import com.shang.pojo.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentDao {
    //插入评论
    public int insertComment(@Param("articleid") int articleid,@Param("commentfid") int commentfid,@Param("userid") int userid,@Param("content") String content,@Param("rootid") int rootid );
    //删除评论
    public int deleteComment(@Param("commentid") int commentid);
    //更新评论点赞数
    public int updateComment(@Param("articleid") int articleid,@Param("clikecount") int clikecount);
    //根据rootcomment查找所有子comment
    public List<Comment> queryCommentsByrootid(@Param("rootid") int rootid);
    //根据userid获取所有对他的评论进行评论的评论
    public List<Comment> queryCommentsBycommentfid(@Param("userid") int userid);
}

package com.shang.service.Comment;

import com.shang.pojo.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentService {
    //插入comment
    public int insertComment(int articleid, int commentfid, int userid, String content,int rootid) throws Exception;
    //删除comment
    public int deleteComment(int articleid,int commentid) throws Exception;
    //根据rootcomment查找所有子comment
    public List<Comment> queryCommentsByrootid(int rootid);
    //根据userid获取所有对他的评论进行评论的评论
    public List<Comment> queryCommentsBycommentfid(int userid);
}

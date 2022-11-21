package com.shang.dao.Comment;

import com.shang.pojo.Comment;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("CommentDao")
public class CommentDaoImp implements CommentDao{
    private SqlSessionTemplate sqlsessionTemplate;
    @Autowired
    public void setSqlsessionTemplate(SqlSessionTemplate sqlsessionTemplate) {
        this.sqlsessionTemplate = sqlsessionTemplate;
    }

    public int insertComment(int articleid, int commentfid, int userid, String content,int rootid) throws Exception {
        CommentDao commentDao=sqlsessionTemplate.getMapper(CommentDao.class);
        return commentDao.insertComment(articleid, commentfid, userid, content,rootid);
    }

    public int deleteComment(int commentid) throws Exception{
        CommentDao commentDao=sqlsessionTemplate.getMapper(CommentDao.class);
        return commentDao.deleteComment(commentid);
    }

    public int deleteComments(int rootid) throws Exception{
        CommentDao commentDao=sqlsessionTemplate.getMapper(CommentDao.class);
        return commentDao.deleteComments(rootid);
    }

    public int updateComment(int commentid, int clikecount) throws Exception{
        CommentDao commentDao=sqlsessionTemplate.getMapper(CommentDao.class);
        return commentDao.updateComment(commentid,clikecount);
    }

    public Comment queryCommentByCommentid(int commentid) {
        CommentDao commentDao=sqlsessionTemplate.getMapper(CommentDao.class);
        return commentDao.queryCommentByCommentid(commentid);
    }


    public List<Comment> queryCommentsByrootid(int rootid)
    {
        CommentDao commentDao=sqlsessionTemplate.getMapper(CommentDao.class);
        return commentDao.queryCommentsByrootid(rootid);
    }

    public List<Comment> queryCommentsBycommentfid(int userid) {
        CommentDao commentDao=sqlsessionTemplate.getMapper(CommentDao.class);
        return commentDao.queryCommentsBycommentfid(userid);
    }

    public int deleteCommentByArticleid(int articleid) {
        CommentDao commentDao=sqlsessionTemplate.getMapper(CommentDao.class);
        return commentDao.deleteCommentByArticleid(articleid);
    }
}

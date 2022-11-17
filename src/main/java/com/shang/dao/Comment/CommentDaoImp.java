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

    public int insertComment(int articleid, int commentfid, int userid, String content,int rootid) {
        CommentDao commentDao=sqlsessionTemplate.getMapper(CommentDao.class);
        return commentDao.insertComment(articleid, commentfid, userid, content,rootid);
    }

    public int deleteComment(int commentid) {
        CommentDao commentDao=sqlsessionTemplate.getMapper(CommentDao.class);
        return commentDao.deleteComment(commentid);
    }


    public List<Comment> queryCommentsByrootid(int rootid)
    {
        CommentDao commentDao=sqlsessionTemplate.getMapper(CommentDao.class);
        return commentDao.queryCommentsByrootid(rootid);
    }
}

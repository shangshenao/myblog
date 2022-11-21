package com.shang.service.Comment;
import com.shang.dao.Article.ArticleDao;
import com.shang.dao.Comment.CommentDao;
import com.shang.pojo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service("CommentService")
public class CommentServiceImp implements CommentService{
    private CommentDao commentDao;
    private ArticleDao articleDao;
    @Autowired
    public void setCommentDao(CommentDao commentDao) {
        this.commentDao = commentDao;
    }

    @Autowired
    public void setArticleDao(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    @Transactional(rollbackFor=Exception.class)
    //开启事务,包括对非运行时异常的回滚
    public int insertComment(int articleid, int commentfid, int userid, String content, int rootid) throws Exception {
        int res=0;
        res=commentDao.insertComment(articleid, commentfid, userid, content, rootid);
        articleDao.updateArticleData(articleid,0,0,0,1);
        return res;
    }

    @Transactional(rollbackFor=Exception.class)
    public int deleteComment(int articleid,int commentid) throws Exception {
        Comment c=commentDao.queryCommentByCommentid(commentid);
        int res=0;
        if(c.getRootid()==0)//如果是根评论
        {
            //删除根下所有评论
        res= commentDao.deleteComments(c.getRootid());
        articleDao.updateArticleData(articleid,0,0,0,res*-1);
        }
        //不是根评论
        //只删除当前评论
        else {
            res=commentDao.deleteComment(commentid);
            articleDao.updateArticleData(articleid,0,0,0,-1);
        }
        return res;
    }

    public List<Comment> queryCommentsByrootid(int rootid) {
        return commentDao.queryCommentsByrootid(rootid);
    }

    public List<Comment> queryCommentsBycommentfid(int userid) {
        return queryCommentsBycommentfid(userid);
    }
}

package com.shang.service.UserCommentLike;

import com.shang.dao.Comment.CommentDao;
import com.shang.dao.UserCommentLike.UserCommentLikeDao;
import com.shang.pojo.UserCommentLike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("UserCommentLikeService")
public class UserCommentLikeServiceImp implements UserCommentLikeService{
    private UserCommentLikeDao userCommentLikeDao;
    private CommentDao commentDao;
    @Autowired
    public void setUserCommentLikeDao(UserCommentLikeDao userCommentLikeDao) {
        this.userCommentLikeDao = userCommentLikeDao;
    }

    @Autowired
    public void setCommentDao(CommentDao commentDao) {
        this.commentDao = commentDao;
    }

    @Transactional(rollbackFor = Exception.class)
    public int insertUserCommentLike(int userid, int commentid) throws Exception {
        int res=userCommentLikeDao.insertUserCommentLike(userid,commentid);
        commentDao.updateComment(commentid,1);
        return res;
    }
    @Transactional(rollbackFor = Exception.class)
    public int deleteUserCommentLike(int userid, int commentid) throws Exception {
        int res=userCommentLikeDao.deleteUserCommentLike(userid,commentid);
        commentDao.updateComment(commentid,1);
        return res;
    }

    public UserCommentLike queryUserCommentLike(int userid, int commentid) {
        return userCommentLikeDao.queryUserCommentLike(userid, commentid);
    }

    public List<UserCommentLike> queryUserCommentLikes(int userid) {
        return userCommentLikeDao.queryUserCommentLikes(userid);
    }
}

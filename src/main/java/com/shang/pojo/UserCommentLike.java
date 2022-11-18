package com.shang.pojo;

import java.util.Date;

public class UserCommentLike {
    private int commentid;
    private int userid;
    private Byte islike;
    private Date liketime;
    private Comment comment;
    private User user;

    public int getCommentid() {
        return commentid;
    }

    public Date getLiketime() {
        return liketime;
    }

    public void setLiketime(Date liketime) {
        this.liketime = liketime;
    }

    @Override
    public String toString() {
        return "UserCommentLike{" +
                "commentid=" + commentid +
                ", userid=" + userid +
                ", islike=" + islike +
                ", liketime=" + liketime +
                ", comment=" + comment +
                ", user=" + user +
                '}';
    }

    public void setCommentid(int commentid) {
        this.commentid = commentid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public Byte getIslike() {
        return islike;
    }

    public void setIslike(Byte islike) {
        this.islike = islike;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

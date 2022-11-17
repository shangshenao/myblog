package com.shang.pojo;

public class UserCommentLike {
    private int commentid;
    private int userid;
    private Byte islike;
    private Comment comment;
    private User user;

    public int getCommentid() {
        return commentid;
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

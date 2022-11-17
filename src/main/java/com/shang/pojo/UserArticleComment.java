package com.shang.pojo;

import java.util.Date;

public class UserArticleComment {
    private int userid;
    private int articleid;
    private Date commenttime;
    private User user;
    private Article article;
    private Comment comment;

    @Override
    public String toString() {
        return "UserArticleComment{" +
                "userid=" + userid +
                ", articleid=" + articleid +
                ", commenttime=" + commenttime +
                ", user=" + user +
                ", article=" + article +
                ", comment=" + comment +
                '}';
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getArticleid() {
        return articleid;
    }

    public void setArticleid(int articleid) {
        this.articleid = articleid;
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}

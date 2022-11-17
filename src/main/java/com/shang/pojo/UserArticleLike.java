package com.shang.pojo;

import java.util.Date;

public class UserArticleLike {
    private int userid;
    private int articleid;
    private Byte islike;
    private Date liketime;
    private User user;
    private Article article;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
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

    public Byte getIslike() {
        return islike;
    }

    public void setIslike(Byte islike) {
        this.islike = islike;
    }

    public Date getLiketime() {
        return liketime;
    }

    public void setLiketime(Date liketime) {
        this.liketime = liketime;
    }
}

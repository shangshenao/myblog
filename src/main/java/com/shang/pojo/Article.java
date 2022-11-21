package com.shang.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Article {
    private int articleid;
    private int userid;
    private int categoryid;
    private String title;
    private Date createtime;
    private Byte istop;
    private int viewcount;
    private String content_markdown;
    private String content_html;
    private int likecount;
    private int favcount;
    private int commentcount;
    private Byte isdel;
    private Category category;
    private User user;
    //一对多
    private List<Comment> comments=new ArrayList();
    //多对多
    private List<User> cusers=new ArrayList();
    private List<User> fusers=new ArrayList();
    private List<User> lusers=new ArrayList();
    private List<Tag> tags=new ArrayList();

    public User getUser() {
        return user;
    }

    public Byte getIsdel() {
        return isdel;
    }

    public void setIsdel(Byte isdel) {
        this.isdel = isdel;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleid=" + articleid +
                ", userid=" + userid +
                ", categoryid=" + categoryid +
                ", title='" + title + '\'' +
                ", createtime=" + createtime +
                ", istop=" + istop +
                ", viewcount=" + viewcount +
                ", content_markdown='" + content_markdown + '\'' +
                ", content_html='" + content_html + '\'' +
                ", likecount=" + likecount +
                ", favcount=" + favcount +
                ", commentcount=" + commentcount +
                ", isdel=" + isdel +
                ", category=" + category +
                ", user=" + user +
                ", comments=" + comments +
                ", cusers=" + cusers +
                ", fusers=" + fusers +
                ", lusers=" + lusers +
                ", tags=" + tags +
                '}';
    }

    public int getLikecount() {
        return likecount;
    }

    public void setLikecount(int likecount) {
        this.likecount = likecount;
    }

    public int getFavcount() {
        return favcount;
    }

    public void setFavcount(int favcount) {
        this.favcount = favcount;
    }

    public int getCommentcount() {
        return commentcount;
    }

    public void setCommentcount(int commentcount) {
        this.commentcount = commentcount;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Byte getIstop() {
        return istop;
    }

    public void setIstop(Byte istop) {
        this.istop = istop;
    }

    public int getViewcount() {
        return viewcount;
    }

    public void setViewcount(int viewcount) {
        this.viewcount = viewcount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<User> getCusers() {
        return cusers;
    }

    public void setCusers(List<User> cusers) {
        this.cusers = cusers;
    }

    public List<User> getFusers() {
        return fusers;
    }

    public void setFusers(List<User> fusers) {
        this.fusers = fusers;
    }

    public List<User> getLusers() {
        return lusers;
    }

    public void setLusers(List<User> lusers) {
        this.lusers = lusers;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public int getArticleid() {
        return articleid;
    }

    public void setArticleid(int articleid) {
        this.articleid = articleid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getContent_markdown() {
        return content_markdown;
    }

    public void setContent_markdown(String content_markdown) {
        this.content_markdown = content_markdown;
    }

    public String getContent_html() {
        return content_html;
    }

    public void setContent_html(String content_html) {
        this.content_html = content_html;
    }
}

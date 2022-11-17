package com.shang.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comment {
    private int commentid;
    private int commentfid;
    private int articleid;
    private int userid;
    private String content;
    private Date createtime;
    private User user;
    private int rootid;
    private User userf;
    private Article article;
    //多对多
    private List<User> lusers=new ArrayList();
    //一对多
    private List<Comment> comments=new ArrayList();

    public List<User> getLusers() {
        return lusers;
    }

    public void setLusers(List<User> lusers) {
        this.lusers = lusers;
    }

    public User getUserf() {
        return userf;
    }

    public void setUserf(User userf) {
        this.userf = userf;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentid=" + commentid +
                ", commentfid=" + commentfid +
                ", articleid=" + articleid +
                ", userid=" + userid +
                ", content='" + content + '\'' +
                ", createtime=" + createtime +
                ", user=" + user +
                ", rootid=" + rootid +
                ", userf=" + userf +
                ", article=" + article +
                ", lusers=" + lusers +
                ", comments=" + comments +
                '}';
    }

    public List<Comment> getComments() {
        return comments;
    }

    public int getRootid() {
        return rootid;
    }

    public void setRootid(int rootid) {
        this.rootid = rootid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getCommentfid() {
        return commentfid;
    }

    public void setCommentfid(int commentfid) {
        this.commentfid = commentfid;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public int getCommentid() {
        return commentid;
    }

    public void setCommentid(int commentid) {
        this.commentid = commentid;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}

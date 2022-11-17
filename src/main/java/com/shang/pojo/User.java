package com.shang.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private int userid;
    private String username;
    private String userpwd;
    private String head;
    private int viewcount;
    private Date createtime;
    private String userrole;
    private String userlocal;

    //一对多
    private List<Article> myarticles=new ArrayList();
    private List<Comment> mycomments=new ArrayList();//所有评论
    //多对多
    private List<Article> carticles=new ArrayList();//评论文章
    private List<Article> farticles=new ArrayList();//收藏文章
    private List<Article> larticles=new ArrayList();//点赞文章
    private List<Comment> lcomments=new ArrayList();//点赞评论
    private List<User> fans=new ArrayList();

    public List<User> getFans() {
        return fans;
    }

    public void setFans(List<User> fans) {
        this.fans = fans;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userpwd='" + userpwd + '\'' +
                ", head='" + head + '\'' +
                ", viewcount=" + viewcount +
                ", createtime=" + createtime +
                ", userrole='" + userrole + '\'' +
                ", userlocal='" + userlocal + '\'' +
                ", myarticles=" + myarticles +
                ", mycomments=" + mycomments +
                ", carticles=" + carticles +
                ", farticles=" + farticles +
                ", larticles=" + larticles +
                ", lcomments=" + lcomments +
                ", fans=" + fans +
                '}';
    }

    public List<Comment> getMycomments() {
        return mycomments;
    }

    public void setMycomments(List<Comment> mycomments) {
        this.mycomments = mycomments;
    }

    public List<Article> getCarticles() {
        return carticles;
    }

    public void setCarticles(List<Article> carticles) {
        this.carticles = carticles;
    }

    public List<Article> getFarticles() {
        return farticles;
    }

    public void setFarticles(List<Article> farticles) {
        this.farticles = farticles;
    }

    public List<Article> getLarticles() {
        return larticles;
    }

    public void setLarticles(List<Article> larticles) {
        this.larticles = larticles;
    }

    public List<Comment> getLcomments() {
        return lcomments;
    }

    public void setLcomments(List<Comment> lcomments) {
        this.lcomments = lcomments;
    }

    public List<Article> getMyarticles() {
        return myarticles;
    }

    public void setMyarticles(List<Article> articles) {
        this.myarticles = articles;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public int getViewcount() {
        return viewcount;
    }

    public void setViewcount(int viewcount) {
        this.viewcount = viewcount;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUserrole() {
        return userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole;
    }

    public String getUserlocal() {
        return userlocal;
    }

    public void setUserlocal(String userlocal) {
        this.userlocal = userlocal;
    }
}

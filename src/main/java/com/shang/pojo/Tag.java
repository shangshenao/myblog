package com.shang.pojo;

import java.util.ArrayList;
import java.util.List;

public class Tag {
    private int tagid;
    private String tagname;
    private List<Article> articles=new ArrayList();

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "tagid=" + tagid +
                ", tagname='" + tagname + '\'' +
                ", articles=" + articles +
                '}';
    }

    public int getTagid() {
        return tagid;
    }

    public void setTagid(int tagid) {
        this.tagid = tagid;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }
}

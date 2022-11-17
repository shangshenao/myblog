package com.shang.pojo;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private int categoryid;
    private String categoryname;
    private List<Article> articles=new ArrayList();

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryid=" + categoryid +
                ", categoryname='" + categoryname + '\'' +
                ", articles=" + articles +
                '}';
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }
}

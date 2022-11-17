package com.shang.test.dao.Article;
import com.shang.dao.Article.ArticleDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Article {
    @Test
    public void queryArticle(){
        ClassPathXmlApplicationContext cpx=  new ClassPathXmlApplicationContext("configcontext.xml");
        ArticleDao articleDao= cpx.getBean("ArticleDao",ArticleDao.class);
        System.out.println(articleDao.queryArticle(1));
    }
    @Test
    public void queryArticles(){
        ClassPathXmlApplicationContext cpx=  new ClassPathXmlApplicationContext("configcontext.xml");
        ArticleDao articleDao= cpx.getBean("ArticleDao",ArticleDao.class);
        String[] a=new String[1];
        a[0]=new String("study");
        System.out.println(articleDao.queryArticles("","",null,0,10).toArray().length);
    }
    @Test
    public void queryArticlesCount(){
        ClassPathXmlApplicationContext cpx=  new ClassPathXmlApplicationContext("configcontext.xml");
        ArticleDao articleDao= cpx.getBean("ArticleDao",ArticleDao.class);
        String[] a=new String[1];
        a[0]=new String("study");
        System.out.println(articleDao.getArticlesCount("","",null));
    }
    @Test
    public void queryArticlesBytime(){
        ClassPathXmlApplicationContext cpx=  new ClassPathXmlApplicationContext("configcontext.xml");
        ArticleDao articleDao= cpx.getBean("ArticleDao",ArticleDao.class);
        System.out.println(articleDao.queryArticlesBytime(0,10));
    }
}

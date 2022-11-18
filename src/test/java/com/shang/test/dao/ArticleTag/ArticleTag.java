package com.shang.test.dao.ArticleTag;

import com.shang.dao.Article.ArticleDao;
import com.shang.dao.ArticleTag.ArticleTagDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArticleTag {
    @Test
    public void insertArticleTag()
    {
        ClassPathXmlApplicationContext cpx=  new ClassPathXmlApplicationContext("configcontext.xml");
        ArticleTagDao articleTagDao= cpx.getBean("ArticleTagDao",ArticleTagDao.class);
        System.out.println(articleTagDao.insertArticleTag(1,3));
    }
    @Test
    public void updateArticleTag()
    {
        ClassPathXmlApplicationContext cpx=  new ClassPathXmlApplicationContext("configcontext.xml");
        ArticleTagDao articleTagDao= cpx.getBean("ArticleTagDao",ArticleTagDao.class);
        System.out.println(articleTagDao.updateArticleTag(2,2,2,1));
    }

    @Test
    public void deleteArticleTag()
    {
        ClassPathXmlApplicationContext cpx=  new ClassPathXmlApplicationContext("configcontext.xml");
        ArticleTagDao articleTagDao= cpx.getBean("ArticleTagDao",ArticleTagDao.class);
        System.out.println(articleTagDao.deleteArticleTag(2,1));
    }
}

package com.shang.test.dao.Category;

import com.shang.dao.Article.ArticleDao;
import com.shang.dao.Category.CategoryDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Category {
    @Test
    public void queryAllCategorys()
    {
        ClassPathXmlApplicationContext cpx=  new ClassPathXmlApplicationContext("configcontext.xml");
        CategoryDao categoryDao= cpx.getBean(CategoryDao.class);
        System.out.println(categoryDao.queryAllCategorys());
    }
    @Test
    public void insertCategory()
    {
        ClassPathXmlApplicationContext cpx=  new ClassPathXmlApplicationContext("configcontext.xml");
        CategoryDao categoryDao= cpx.getBean(CategoryDao.class);
        System.out.println(categoryDao.insertCategory("test02"));
    }

    @Test
    public void updateCategory()
    {
        ClassPathXmlApplicationContext cpx=  new ClassPathXmlApplicationContext("configcontext.xml");
        CategoryDao categoryDao= cpx.getBean(CategoryDao.class);
        System.out.println(categoryDao.updateCategory(4,"test05"));
    }
    @Test
    public void deleteCategory()
    {
        ClassPathXmlApplicationContext cpx=  new ClassPathXmlApplicationContext("configcontext.xml");
        CategoryDao categoryDao= cpx.getBean(CategoryDao.class);
        System.out.println(categoryDao.deleteCategory(4));
    }
}

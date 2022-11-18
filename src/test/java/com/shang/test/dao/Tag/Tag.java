package com.shang.test.dao.Tag;

import com.shang.dao.Comment.CommentDao;
import com.shang.dao.Tag.TagDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tag {
    @Test
    public void queryAllTags(){
        ClassPathXmlApplicationContext cpx=  new ClassPathXmlApplicationContext("configcontext.xml");
        TagDao tagDao= cpx.getBean("TagDao",TagDao.class);
        System.out.println(tagDao.queryAllTags());
    }
    @Test
    public void insertTag(){
        ClassPathXmlApplicationContext cpx=  new ClassPathXmlApplicationContext("configcontext.xml");
        TagDao tagDao= cpx.getBean("TagDao",TagDao.class);
        System.out.println(tagDao.insertTag("test11"));
    }
    @Test
    public void updateTag(){
        ClassPathXmlApplicationContext cpx=  new ClassPathXmlApplicationContext("configcontext.xml");
        TagDao tagDao= cpx.getBean("TagDao",TagDao.class);
        System.out.println(tagDao.updateTag(4,"test1"));
    }

    @Test
    public void deleteTag(){
        ClassPathXmlApplicationContext cpx=  new ClassPathXmlApplicationContext("configcontext.xml");
        TagDao tagDao= cpx.getBean("TagDao",TagDao.class);
        System.out.println(tagDao.deleteTag(4));
    }
}

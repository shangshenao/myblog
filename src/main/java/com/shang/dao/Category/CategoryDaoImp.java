package com.shang.dao.Category;

import com.shang.pojo.Category;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("CategoryDao")
public class CategoryDaoImp implements CategoryDao{
    private SqlSessionTemplate sqlSessionTemplate;
    @Autowired
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public int insertCategory(String categoryname) {
        CategoryDao categoryDao=sqlSessionTemplate.getMapper(CategoryDao.class);
        return categoryDao.insertCategory(categoryname);
    }

    public int deleteCategory(int categoryid) {
        CategoryDao categoryDao=sqlSessionTemplate.getMapper(CategoryDao.class);
        return categoryDao.deleteCategory(categoryid);
    }

    public int updateCategory(int categoryid, String categoryname) {
        CategoryDao categoryDao=sqlSessionTemplate.getMapper(CategoryDao.class);
        return categoryDao.updateCategory(categoryid, categoryname);
    }

    public List<Category> queryAllCategorys() {
        CategoryDao categoryDao=sqlSessionTemplate.getMapper(CategoryDao.class);
        return categoryDao.queryAllCategorys();
    }
}

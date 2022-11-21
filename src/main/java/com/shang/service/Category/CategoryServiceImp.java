package com.shang.service.Category;

import com.shang.dao.Category.CategoryDao;
import com.shang.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("CategoryService")
public class CategoryServiceImp implements CategoryService{
    private CategoryDao categoryDao;
    @Autowired
    public void setCategoryDao(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }
    public int insertCategory(String categoryname) {
        return categoryDao.insertCategory(categoryname);
    }

    public int deleteCategory(int categoryid) {
        return categoryDao.deleteCategory(categoryid);
    }

    public int updateCategory(int categoryid, String categoryname) {
        return categoryDao.updateCategory(categoryid, categoryname);
    }

    public List<Category> queryAllCategorys() {
        return categoryDao.queryAllCategorys();
    }
}

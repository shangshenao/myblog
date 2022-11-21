package com.shang.service.Category;

import com.shang.pojo.Category;

import java.util.List;

public interface CategoryService {
    //插入Category
    int insertCategory(String categoryname);
    //删除Category
    public int deleteCategory(int categoryid);
    //更新Category
    public int updateCategory(int categoryid, String categoryname);
    //查询全部Category
    List<Category> queryAllCategorys();
}

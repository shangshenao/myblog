package com.shang.dao.Category;

import com.shang.pojo.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryDao {
    //插入类别
    public int insertCategory(@Param("categoryname") String categoryname);
    //删除类别
    public int deleteCategory(@Param("categoryid") int categoryid);
    //修改类别
    public int updateCategory(@Param("categoryid") int categoryid,@Param("categoryname") String categoryname);
    //查询所有类别
    public List<Category> queryAllCategorys();
}

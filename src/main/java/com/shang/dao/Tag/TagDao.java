package com.shang.dao.Tag;

import com.shang.pojo.Tag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TagDao {
    //插入tag
    public int insertTag(@Param("tagname") String tagname);
    //删除tag
    public int deleteTag(@Param("tagid") int tagid);
    //更改tag
    public int updateTag(@Param("tagid") int tagid,@Param("tagname") String tagname);
    //查询所有tag
    public List<Tag> queryAllTags();

}

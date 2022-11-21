package com.shang.service.Tag;

import com.shang.pojo.Tag;

import java.util.List;

public interface TagService {
    //插入tag
    public int insertTag(String tagname);
    //删除tag
    public int deleteTag(int tagid);
    //更改tag
    public int updateTag(int tagid,String tagname);
    //查询所有tag
    public List<Tag> queryAllTags();
}

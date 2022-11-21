package com.shang.service.Tag;

import com.shang.dao.Tag.TagDao;
import com.shang.pojo.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("TagDaoService")
public class TagServiceImp implements TagService{
    private TagDao tagDao;

    @Autowired
    public void setTagDao(TagDao tagDao) {
        this.tagDao = tagDao;
    }

    public int insertTag(String tagname) {
        return tagDao.insertTag(tagname);
    }

    public int deleteTag(int tagid) {
        return tagDao.deleteTag(tagid);
    }

    public int updateTag(int tagid, String tagname) {
        return tagDao.updateTag(tagid, tagname);
    }

    public List<Tag> queryAllTags() {
        return tagDao.queryAllTags();
    }
}

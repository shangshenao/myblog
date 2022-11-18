package com.shang.dao.Tag;

import com.shang.pojo.Tag;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("TagDao")
public class TagDaoImp implements TagDao{
    private SqlSessionTemplate sqlSessionTemplate;
    @Autowired
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public int insertTag(String tagname) {
        TagDao tagDao=sqlSessionTemplate.getMapper(TagDao.class);
        return tagDao.insertTag(tagname);
    }

    public int deleteTag(int tagid) {
        TagDao tagDao=sqlSessionTemplate.getMapper(TagDao.class);
        return tagDao.deleteTag(tagid);
    }

    public int updateTag(int tagid, String tagname) {
        TagDao tagDao=sqlSessionTemplate.getMapper(TagDao.class);
        return tagDao.updateTag(tagid,tagname);
    }

    public List<Tag> queryAllTags() {
        TagDao tagDao=sqlSessionTemplate.getMapper(TagDao.class);
        return tagDao.queryAllTags();
    }
}

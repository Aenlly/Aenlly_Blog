package com.aenlly.dao;

import com.aenlly.entity.PostTheme_Entity;
import com.aenlly.entity.PostType_Entity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface PostThemeDao {
    //插入新记录
    Integer save(PostTheme_Entity postThemeEntity);
    //按id查询
    PostTheme_Entity getId(int themeId);
    //更新
    boolean update(PostTheme_Entity postThemeEntity);
    //删除,根据id来进行
    boolean delete(PostTheme_Entity postThemeEntity);
    //查询
    List<PostTheme_Entity> getAll();
}

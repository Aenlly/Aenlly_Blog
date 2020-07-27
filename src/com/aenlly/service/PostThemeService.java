package com.aenlly.service;

import com.aenlly.entity.PostTheme_Entity;

import java.util.List;

public interface PostThemeService {
    //保存
    Integer save(PostTheme_Entity postThemeEntity);
    //按id查询
    PostTheme_Entity getId(int themeId);
    //更新
    boolean update(PostTheme_Entity postThemeEntity);
    //删除
    boolean delete(PostTheme_Entity postThemeEntity);
    //查询
    List<PostTheme_Entity> getAll();
}

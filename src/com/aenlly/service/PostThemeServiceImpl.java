package com.aenlly.service;

import com.aenlly.dao.PostThemeDao;
import com.aenlly.entity.PostTheme_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostThemeServiceImpl implements PostThemeService{

    @Autowired
    private PostThemeDao postThemeDao;

    @Override
    public Integer save(PostTheme_Entity postThemeEntity) {
        return postThemeDao.save(postThemeEntity);
    }

    @Override
    public PostTheme_Entity getId(int themeId) {
        return postThemeDao.getId(themeId);
    }

    @Override
    public boolean update(PostTheme_Entity postThemeEntity) {
        return postThemeDao.update(postThemeEntity);
    }

    @Override
    public boolean delete(PostTheme_Entity postThemeEntity) {
        return postThemeDao.delete(postThemeEntity);
    }

    @Override
    public List<PostTheme_Entity> getAll() {
        return postThemeDao.getAll();
    }
}

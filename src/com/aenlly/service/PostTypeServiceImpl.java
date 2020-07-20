package com.aenlly.service;

import com.aenlly.dao.PostTypeDao;
import com.aenlly.entity.PostType_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostTypeServiceImpl implements PostTypeService{

    @Autowired
    private PostTypeDao postTypeDao;

    @Override
    public Integer save(PostType_Entity postTypeEntity) {
        return postTypeDao.save(postTypeEntity);
    }

    @Override
    public PostType_Entity getId(int cateId) {
        return postTypeDao.getId(cateId);
    }

    @Override
    public boolean update(PostType_Entity postTypeEntity) {
        return postTypeDao.update(postTypeEntity);
    }

    @Override
    public boolean delete(PostType_Entity postTypeEntity) {
        return postTypeDao.delete(postTypeEntity);
    }

    @Override
    public List<PostType_Entity> getAll() {
        return postTypeDao.getAll();
    }
}

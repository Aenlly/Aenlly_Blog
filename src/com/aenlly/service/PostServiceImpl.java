package com.aenlly.service;

import com.aenlly.dao.PostDao;
import com.aenlly.entity.Post_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostDao postDao;

    @Override
    public Integer save(Post_Entity postEntity) {
        return postDao.save(postEntity);
    }

    @Override
    public Post_Entity getId(int postId) {
        return postDao.getId(postId);
    }

    @Override
    public boolean update(Post_Entity postEntity) {
        return postDao.update(postEntity);
    }

    @Override
    public boolean delete(Post_Entity postEntity) {
        return postDao.delete(postEntity);
    }

    @Override
    public List<Post_Entity> getTitle(int pageNow, int pageSize,int themeId) {
        return postDao.getTitle(pageNow,pageSize,themeId);
    }

    @Override
    public int getCount(int themeId) {
        return postDao.getCount(themeId);
    }

    @Override
    public List<Post_Entity> getAll(String postTitle) {
        return postDao.getAll(postTitle);
    }

    @Override
    public Integer getLikeCount(String postTitle, int themeId) {
        return postDao.getLikeCount(postTitle,themeId);
    }

    @Override
    public List<Post_Entity> getLikeTitle( String postTitle, int themeId) {
        return postDao.getLikeTitle(postTitle,themeId);
    }
}

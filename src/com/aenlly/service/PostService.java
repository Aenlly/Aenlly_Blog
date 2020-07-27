package com.aenlly.service;

import com.aenlly.entity.Post_Entity;

import java.util.List;

public interface PostService {
    //保存文章或作品
    Boolean save(Post_Entity postEntity);
    //按编号查询内容
    Post_Entity getId(int postId);
    //更新文章或作品的内容
    boolean update(Post_Entity postEntity);
    //删除该文章或作品
    boolean delete(Post_Entity postEntity);
    //传页码与每页的内容长度,以及查找的主题
    List<Post_Entity> getTitle(int pageNow,int pageSize,String themeName);
    //按主题查询记录数
    Integer getCount(String themeName);
    //按标题查询文章或作品
    List<Post_Entity> getAll(String postTitle);
    //按标题模糊查询文章或作品总记录数
    Integer getLikeCount(String postTitle,String themeName);
    //按主题查找的标题
    List<Post_Entity> getLikeTitle(String postTitle,String themeName);
}

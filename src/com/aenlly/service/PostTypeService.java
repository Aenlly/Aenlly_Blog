package com.aenlly.service;

import com.aenlly.entity.PostType_Entity;

import java.util.List;

public interface PostTypeService {
    //保存
    Integer save(PostType_Entity postTypeEntity);
    //按id查询
    PostType_Entity getId(int cateId);
    //更新
    boolean update(PostType_Entity postTypeEntity);
    //删除
    boolean delete(PostType_Entity postTypeEntity);
    //查询
    List<PostType_Entity> getAll();
}

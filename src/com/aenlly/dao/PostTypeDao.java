package com.aenlly.dao;

import com.aenlly.entity.Admin_Entity;
import com.aenlly.entity.PostType_Entity;

import java.util.List;

public interface PostTypeDao {
    //插入新记录
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

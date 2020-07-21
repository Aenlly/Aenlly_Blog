package com.aenlly.dao;

import com.aenlly.entity.Index_Entity;

import java.util.List;

public interface IndexDao {
    //更新保存
    boolean update(Index_Entity indexEntity);
    //查询显示
    List<Index_Entity> getAll();
}

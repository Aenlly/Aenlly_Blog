package com.aenlly.service;

import com.aenlly.entity.Index_Entity;

import java.util.List;

public interface IndexService {

    //更新
    boolean update(Index_Entity indexEntity);
    //查询显示
    List<Index_Entity> getAll();
}

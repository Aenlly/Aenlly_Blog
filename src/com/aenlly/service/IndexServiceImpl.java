package com.aenlly.service;

import com.aenlly.dao.IndexDao;
import com.aenlly.entity.Index_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexServiceImpl implements IndexService{

    @Autowired
    private IndexDao indexDao;

    @Override
    public boolean update(Index_Entity indexEntity) {
        return indexDao.update(indexEntity);
    }

    @Override
    public List<Index_Entity> getAll() {
        return indexDao.getAll();
    }
}

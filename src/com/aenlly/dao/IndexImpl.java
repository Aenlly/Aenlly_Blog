package com.aenlly.dao;

import com.aenlly.entity.Index_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IndexImpl implements IndexDao{

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public boolean update(Index_Entity indexEntity) {
        try{
            hibernateTemplate.update(indexEntity);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public List<Index_Entity> getAll() {
        String sql="from Index_Entity";
        List<Index_Entity> list=(List<Index_Entity>)hibernateTemplate.find(sql);
        return list;
    }
}

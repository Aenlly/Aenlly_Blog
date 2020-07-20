package com.aenlly.dao;

import com.aenlly.entity.PostType_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostTypeDaoImpl implements PostTypeDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public Integer save(PostType_Entity postTypeEntity) {
        return (Integer)hibernateTemplate.save(postTypeEntity);
    }

    @Override
    public PostType_Entity getId(int cateId) {
        return hibernateTemplate.get(PostType_Entity.class,cateId);
    }

    @Override
    public boolean update(PostType_Entity postTypeEntity) {
        try {
            hibernateTemplate.update(postTypeEntity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(PostType_Entity postTypeEntity) {
        try {
            hibernateTemplate.delete(postTypeEntity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<PostType_Entity> getAll() {
        String sql="from PostType_Entity";
        List<PostType_Entity> list=(List<PostType_Entity>)hibernateTemplate.find(sql);
        return list;
    }
}

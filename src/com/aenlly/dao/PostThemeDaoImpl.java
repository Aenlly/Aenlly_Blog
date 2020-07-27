package com.aenlly.dao;

import com.aenlly.entity.PostTheme_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostThemeDaoImpl implements PostThemeDao{

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public Integer save(PostTheme_Entity postThemeEntity) {
        return (Integer) hibernateTemplate.save(postThemeEntity);
    }

    @Override
    public PostTheme_Entity getId(int themeId) {
        return hibernateTemplate.get(PostTheme_Entity.class,themeId);
    }

    @Override
    public boolean update(PostTheme_Entity postThemeEntity) {
        try{
            hibernateTemplate.update(postThemeEntity);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean delete(PostTheme_Entity postThemeEntity) {
        try {
            hibernateTemplate.delete(postThemeEntity);
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<PostTheme_Entity> getAll() {
        String sql="from PostTheme_Entity";
        List<PostTheme_Entity> list=(List<PostTheme_Entity>) hibernateTemplate.find(sql);
        return list;
    }
}

package com.aenlly.dao;

import com.aenlly.entity.Post_Entity;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostDaoImpl implements PostDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public Integer save(Post_Entity postEntity) {
        return (Integer)hibernateTemplate.save(postEntity);
    }

    @Override
    public Post_Entity getId(int postId) {
        return hibernateTemplate.get(Post_Entity.class,postId);
    }

    @Override
    public boolean update(Post_Entity postEntity) {
        try{
            hibernateTemplate.update(postEntity);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean delete(Post_Entity postEntity) {
        try{
            hibernateTemplate.delete(postEntity);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public List<Post_Entity> getTitle(int pageNow, int pageSize,int themeId) {
        DetachedCriteria detachedCriteria=DetachedCriteria.forClass(Post_Entity.class);
        detachedCriteria.add(Restrictions.eq("themeId",themeId));
        //利用hibernateTemplate的findByCriteria分页查询方法其中三个参数分别为detachedCriteria，从多少记录条开始，查询多少记录，不加参数则不为分页查询
        List<Post_Entity> list = (List<Post_Entity>) hibernateTemplate.findByCriteria(detachedCriteria, (pageNow-1)*pageSize, pageSize);
        return list;
    }

    @Override
    public Integer getCount(int themeId) {
        String sql="from Post_Entity where themeId=?";
        Object[] values=new Object[]{themeId};
        int count=0;
        List<Post_Entity> lists = (List<Post_Entity>)hibernateTemplate.find(sql,values);
        for (Post_Entity list:lists) {
            count++;
        }
        return count;
    }

    @Override
    public List<Post_Entity> getAll(String postTitle) {
        String sql="from Post_Entity where postTitle like ?";//模糊查询标题
        if(postTitle==null){//判断标题是否为空
            postTitle="";
        }
        Object[] values=new Object[]{"%"+postTitle+"%"};
        List<Post_Entity> list=(List<Post_Entity>)hibernateTemplate.find(sql,values);
        return list;
    }
}
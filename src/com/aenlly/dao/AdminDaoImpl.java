package com.aenlly.dao;

import com.aenlly.entity.Admin_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminDaoImpl implements AdminDao{

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public Integer save(Admin_Entity adminEntity) {
        return (Integer)hibernateTemplate.save(adminEntity);
    }

    @Override
    public Admin_Entity getId(int adminId) {
        return hibernateTemplate.get(Admin_Entity.class,adminId);
    }

    @Override
    public boolean update(Admin_Entity adminEntity) {
        try{
            hibernateTemplate.update(adminEntity);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean delete(Admin_Entity adminEntity) {
        try {
            hibernateTemplate.delete(adminEntity);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public List<Admin_Entity> getAll(String adminNickname) {
        String sql="from Admin_Entity where adminNickname like ?";
        if(adminNickname==null){
            adminNickname="";
        }
        Object[] values=new Object[]{"%"+adminNickname+"%"};
        List<Admin_Entity> list=(List<Admin_Entity>)hibernateTemplate.find(sql,values);
        return list;
    }
}

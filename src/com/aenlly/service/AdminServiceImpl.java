package com.aenlly.service;

import com.aenlly.dao.AdminDao;
import com.aenlly.entity.Admin_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminDao adminDao;

    @Override
    public Integer save(Admin_Entity admin_Entity) {
        return adminDao.save(admin_Entity);
    }

    @Override
    public Admin_Entity getId(int adminId) {
        return adminDao.getId(adminId);
    }

    @Override
    public boolean update(Admin_Entity admin_Entity) {
        return adminDao.update(admin_Entity);
    }

    @Override
    public boolean delete(Admin_Entity admin_Entity) {
        return adminDao.delete(admin_Entity);
    }

    @Override
    public List<Admin_Entity> getAll(String adminNickname) {
        return adminDao.getAll(adminNickname);
    }
}

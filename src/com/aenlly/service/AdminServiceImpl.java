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
    public Integer save(Admin_Entity adminEntity) {
        return adminDao.save(adminEntity);
    }

    @Override
    public Admin_Entity getId(int adminId) {
        return adminDao.getId(adminId);
    }

    @Override
    public boolean update(Admin_Entity adminEntity) {
        return adminDao.update(adminEntity);
    }

    @Override
    public boolean delete(Admin_Entity adminEntity) {
        return adminDao.delete(adminEntity);
    }

    @Override
    public List<Admin_Entity> getAll(String adminNickname) {
        return adminDao.getAll(adminNickname);
    }
}

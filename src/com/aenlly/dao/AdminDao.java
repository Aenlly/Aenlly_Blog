package com.aenlly.dao;

import com.aenlly.entity.Admin_Entity;

import java.util.List;

public interface AdminDao {
    Integer save(Admin_Entity adminEntity);

    Admin_Entity getId(int adminId);

    boolean update(Admin_Entity adminEntity);

    boolean delete(Admin_Entity adminEntity);

    List<Admin_Entity> getAll(String adminNickname);
}

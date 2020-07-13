package com.aenlly.dao;

import com.aenlly.entity.Admin_Entity;

import java.util.List;

public interface AdminDao {
    Integer save(Admin_Entity admin_Entity);

    Admin_Entity getId(int adminId);

    boolean update(Admin_Entity admin_Entity);

    boolean delete(Admin_Entity admin_Entity);

    List<Admin_Entity> getAll(String adminNickname);
}

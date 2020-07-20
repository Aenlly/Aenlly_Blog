package com.aenlly.dao;

import com.aenlly.entity.Admin_Entity;

import java.util.List;

public interface AdminDao {
    //保存
    Integer save(Admin_Entity adminEntity);
    //按id查询
    Admin_Entity getId(int adminId);
    //更新
    boolean update(Admin_Entity adminEntity);
    //删除
    boolean delete(Admin_Entity adminEntity);
    //查询
    List<Admin_Entity> getAll(String adminNickname);
}

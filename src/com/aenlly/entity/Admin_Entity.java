package com.aenlly.entity;

import java.util.Objects;

@javax.persistence.Entity
@javax.persistence.Table(name = "admin", schema = "aenlly_blog", catalog = "")
public class Admin_Entity {
    private int adminId;
    private String adminNickname;
    private String adminAccount;
    private String adminPwd;
    private Integer adminPowerId;

    @javax.persistence.Id
    @javax.persistence.Column(name = "admin_id", nullable = false)
    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "admin_nickname", nullable = false, length = 10)
    public String getAdminNickname() {
        return adminNickname;
    }

    public void setAdminNickname(String adminNickname) {
        this.adminNickname = adminNickname;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "admin_account", nullable = false, length = 255)
    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "admin_pwd", nullable = false, length = 16)
    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "admin_power_id", nullable = true)
    public Integer getAdminPowerId() {
        return adminPowerId;
    }

    public void setAdminPowerId(Integer adminPowerId) {
        this.adminPowerId = adminPowerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin_Entity that = (Admin_Entity) o;
        return adminId == that.adminId &&
                Objects.equals(adminNickname, that.adminNickname) &&
                Objects.equals(adminAccount, that.adminAccount) &&
                Objects.equals(adminPwd, that.adminPwd) &&
                Objects.equals(adminPowerId, that.adminPowerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminId, adminNickname, adminAccount, adminPwd, adminPowerId);
    }
}

package com.aenlly.entity;

import java.util.Objects;

@javax.persistence.Entity
@javax.persistence.Table(name = "admin_powertype", schema = "aenlly_blog", catalog = "")
public class AdminPowertype_Entity {
    private int adminPowerId;
    private String adminPower;

    @javax.persistence.Id
    @javax.persistence.Column(name = "admin_power_id", nullable = false)
    public int getAdminPowerId() {
        return adminPowerId;
    }

    public void setAdminPowerId(int adminPowerId) {
        this.adminPowerId = adminPowerId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "admin_power", nullable = false, length = 255)
    public String getAdminPower() {
        return adminPower;
    }

    public void setAdminPower(String adminPower) {
        this.adminPower = adminPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminPowertype_Entity that = (AdminPowertype_Entity) o;
        return adminPowerId == that.adminPowerId &&
                Objects.equals(adminPower, that.adminPower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminPowerId, adminPower);
    }
}

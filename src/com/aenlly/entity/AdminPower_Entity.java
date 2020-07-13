package com.aenlly.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "admin_power", schema = "aenlly_blog", catalog = "")
public class AdminPower_Entity {
    private int admPowerId;
    private String admPower;

    @Id
    @Column(name = "adm_power_id", nullable = false)
    public int getAdmPowerId() {
        return admPowerId;
    }

    public void setAdmPowerId(int admPowerId) {
        this.admPowerId = admPowerId;
    }

    @Basic
    @Column(name = "adm_power", nullable = false, length = 255)
    public String getAdmPower() {
        return admPower;
    }

    public void setAdmPower(String admPower) {
        this.admPower = admPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminPower_Entity that = (AdminPower_Entity) o;
        return admPowerId == that.admPowerId &&
                Objects.equals(admPower, that.admPower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(admPowerId, admPower);
    }
}

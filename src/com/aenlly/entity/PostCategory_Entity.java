package com.aenlly.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "post_category", schema = "aenlly_blog", catalog = "")
public class PostCategory_Entity {
    private int cateId;
    private String cateCetagory;
    private int catePostCount;

    @Id
    @Column(name = "cate_id", nullable = false)
    public int getCateId() {
        return cateId;
    }

    public void setCateId(int cateId) {
        this.cateId = cateId;
    }

    @Basic
    @Column(name = "cate_cetagory", nullable = false, length = 255)
    public String getCateCetagory() {
        return cateCetagory;
    }

    public void setCateCetagory(String cateCetagory) {
        this.cateCetagory = cateCetagory;
    }

    @Basic
    @Column(name = "cate_post_count", nullable = false)
    public int getCatePostCount() {
        return catePostCount;
    }

    public void setCatePostCount(int catePostCount) {
        this.catePostCount = catePostCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostCategory_Entity that = (PostCategory_Entity) o;
        return cateId == that.cateId &&
                catePostCount == that.catePostCount &&
                Objects.equals(cateCetagory, that.cateCetagory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cateId, cateCetagory, catePostCount);
    }
}

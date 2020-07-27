package com.aenlly.entity;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Objects;
import java.util.Set;

@javax.persistence.Entity
@javax.persistence.Table(name = "post_type", schema = "aenlly_blog", catalog = "")
public class PostType_Entity {
    private int cateId;
    private String cateName;
    private int catePostCount;

    /*
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = Post_Entity.class,orphanRemoval = true)
    @JoinColumn(name="cate_name")
    private Set<Post_Entity> postEntities;

    @Override
    public int hashCode() {
        return Objects.hash(cateId, cateName, catePostCount);
    }

    public Set<Post_Entity> getPostEntities() {
        return postEntities;
    }

    public void setPostEntities(Set<Post_Entity> postEntities) {
        this.postEntities = postEntities;
    }
    */


    @javax.persistence.Id
    @javax.persistence.Column(name = "cate_id", nullable = false)
    public int getCateId() {
        return cateId;
    }

    public void setCateId(int cateId) {
        this.cateId = cateId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "cate_name", nullable = false, length = 255)
    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "cate_post_count", nullable = false)
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
        PostType_Entity that = (PostType_Entity) o;
        return cateId == that.cateId &&
                catePostCount == that.catePostCount &&
                Objects.equals(cateName, that.cateName);
    }
}

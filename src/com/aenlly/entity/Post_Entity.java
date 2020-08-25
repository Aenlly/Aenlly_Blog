package com.aenlly.entity;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;
import java.util.Objects;

@javax.persistence.Entity
@javax.persistence.Table(name = "post", schema = "aenlly_blog", catalog = "")
public class Post_Entity {
    private int postId;
    private String postTitle;
    private String themeName;
    private String cateName;
    private String postAuthor;
    private Timestamp postTime;
    private String postContent;
    private int postClick;

    /*
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "cate_Name",unique = false,updatable = true)
    private PostType_Entity postTypeEntity;

    public PostType_Entity getPostTypeEntity() {
        return postTypeEntity;
    }

    public void setPostTypeEntity(PostType_Entity postTypeEntity) {
        this.postTypeEntity = postTypeEntity;
    }
    */

    @javax.persistence.Id
    @javax.persistence.Column(name = "post_id", nullable = true)
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "post_title", nullable = false, length = 30)
    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "theme_name", nullable = false)
    public String getThemeName() {
        return themeName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "cate_name", nullable = false)
    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "post_author", nullable = false, length = 255)
    public String getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(String postAuthor) {
        this.postAuthor = postAuthor;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "post_time", nullable = true)
    public Timestamp getPostTime() {
        return postTime;
    }

    public void setPostTime(Timestamp postTime) {
        this.postTime = postTime;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "post_content", nullable = false, length = -1)
    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "post_click", nullable = true)
    public int getPostClick() {
        return postClick;
    }

    public void setPostClick(int postClick) {
        this.postClick = postClick;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post_Entity that = (Post_Entity) o;
        return postId == that.postId &&
                themeName == that.themeName &&
                cateName == that.cateName &&
                postClick == that.postClick &&
                Objects.equals(postTitle, that.postTitle) &&
                Objects.equals(postAuthor, that.postAuthor) &&
                Objects.equals(postTime, that.postTime) &&
                Objects.equals(postContent, that.postContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, postTitle, themeName, cateName, postAuthor, postTime, postContent, postClick);
    }
}

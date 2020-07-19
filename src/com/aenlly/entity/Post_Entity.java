package com.aenlly.entity;

import java.sql.Timestamp;
import java.util.Objects;

@javax.persistence.Entity
@javax.persistence.Table(name = "post", schema = "aenlly_blog", catalog = "")
public class Post_Entity {
    private int postId;
    private String postTitle;
    private int themeId;
    private int cateId;
    private String postAuthor;
    private Timestamp postTime;
    private String postContent;
    private int postClick;

    @javax.persistence.Id
    @javax.persistence.Column(name = "post_id", nullable = false)
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "post_title", nullable = false, length = 255)
    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "theme_id", nullable = false)
    public int getThemeId() {
        return themeId;
    }

    public void setThemeId(int themeId) {
        this.themeId = themeId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "cate_id", nullable = false)
    public int getCateId() {
        return cateId;
    }

    public void setCateId(int cateId) {
        this.cateId = cateId;
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
    @javax.persistence.Column(name = "post_time", nullable = false)
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
    @javax.persistence.Column(name = "post_click", nullable = false)
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
                themeId == that.themeId &&
                cateId == that.cateId &&
                postClick == that.postClick &&
                Objects.equals(postTitle, that.postTitle) &&
                Objects.equals(postAuthor, that.postAuthor) &&
                Objects.equals(postTime, that.postTime) &&
                Objects.equals(postContent, that.postContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, postTitle, themeId, cateId, postAuthor, postTime, postContent, postClick);
    }
}

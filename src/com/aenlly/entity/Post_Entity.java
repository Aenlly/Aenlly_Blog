package com.aenlly.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "post", schema = "aenlly_blog", catalog = "")
public class Post_Entity {
    private int postId;
    private String postTitle;
    private String postCayegory;
    private String postAuthor;
    private Timestamp postTime;
    private String postContent;
    private int postClick;

    @Id
    @Column(name = "post_id", nullable = false)
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    @Basic
    @Column(name = "post_title", nullable = false, length = 255)
    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    @Basic
    @Column(name = "post_cayegory", nullable = false, length = 255)
    public String getPostCayegory() {
        return postCayegory;
    }

    public void setPostCayegory(String postCayegory) {
        this.postCayegory = postCayegory;
    }

    @Basic
    @Column(name = "post_author", nullable = false, length = 255)
    public String getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(String postAuthor) {
        this.postAuthor = postAuthor;
    }

    @Basic
    @Column(name = "post_time", nullable = false)
    public Timestamp getPostTime() {
        return postTime;
    }

    public void setPostTime(Timestamp postTime) {
        this.postTime = postTime;
    }

    @Basic
    @Column(name = "post_content", nullable = false, length = -1)
    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    @Basic
    @Column(name = "post_click", nullable = false)
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
                postClick == that.postClick &&
                Objects.equals(postTitle, that.postTitle) &&
                Objects.equals(postCayegory, that.postCayegory) &&
                Objects.equals(postAuthor, that.postAuthor) &&
                Objects.equals(postTime, that.postTime) &&
                Objects.equals(postContent, that.postContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, postTitle, postCayegory, postAuthor, postTime, postContent, postClick);
    }
}

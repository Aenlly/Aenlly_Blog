package com.aenlly.entity;

import java.sql.Timestamp;
import java.util.Objects;

@javax.persistence.Entity
@javax.persistence.Table(name = "post_stayword", schema = "aenlly_blog", catalog = "")
public class PostStayword_Entity {
    private int postStayId;
    private int postId;
    private String postStayNickname;
    private String postStayContent;
    private Timestamp postStayTime;

    @javax.persistence.Id
    @javax.persistence.Column(name = "post_stay_id", nullable = false)
    public int getPostStayId() {
        return postStayId;
    }

    public void setPostStayId(int postStayId) {
        this.postStayId = postStayId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "post_id", nullable = false)
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "post_stay_nickname", nullable = false, length = 255)
    public String getPostStayNickname() {
        return postStayNickname;
    }

    public void setPostStayNickname(String postStayNickname) {
        this.postStayNickname = postStayNickname;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "post_stay_content", nullable = false, length = 255)
    public String getPostStayContent() {
        return postStayContent;
    }

    public void setPostStayContent(String postStayContent) {
        this.postStayContent = postStayContent;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "post_stay_time", nullable = false)
    public Timestamp getPostStayTime() {
        return postStayTime;
    }

    public void setPostStayTime(Timestamp postStayTime) {
        this.postStayTime = postStayTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostStayword_Entity that = (PostStayword_Entity) o;
        return postStayId == that.postStayId &&
                postId == that.postId &&
                Objects.equals(postStayNickname, that.postStayNickname) &&
                Objects.equals(postStayContent, that.postStayContent) &&
                Objects.equals(postStayTime, that.postStayTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postStayId, postId, postStayNickname, postStayContent, postStayTime);
    }
}

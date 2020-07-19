package com.aenlly.entity;

import java.sql.Timestamp;
import java.util.Objects;

@javax.persistence.Entity
@javax.persistence.Table(name = "user", schema = "aenlly_blog", catalog = "")
public class User_Entity {
    private int userId;
    private String userNickname;
    private String userHeadimg;
    private String userAccount;
    private String userPwd;
    private String userEmail;
    private Timestamp userTime;

    @javax.persistence.Id
    @javax.persistence.Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "user_nickname", nullable = true, length = 10)
    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "user_headimg", nullable = true, length = 255)
    public String getUserHeadimg() {
        return userHeadimg;
    }

    public void setUserHeadimg(String userHeadimg) {
        this.userHeadimg = userHeadimg;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "user_account", nullable = false, length = 255)
    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "user_pwd", nullable = false, length = 16)
    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "user_email", nullable = false, length = 20)
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "user_time", nullable = false)
    public Timestamp getUserTime() {
        return userTime;
    }

    public void setUserTime(Timestamp userTime) {
        this.userTime = userTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User_Entity that = (User_Entity) o;
        return userId == that.userId &&
                Objects.equals(userNickname, that.userNickname) &&
                Objects.equals(userHeadimg, that.userHeadimg) &&
                Objects.equals(userAccount, that.userAccount) &&
                Objects.equals(userPwd, that.userPwd) &&
                Objects.equals(userEmail, that.userEmail) &&
                Objects.equals(userTime, that.userTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userNickname, userHeadimg, userAccount, userPwd, userEmail, userTime);
    }
}

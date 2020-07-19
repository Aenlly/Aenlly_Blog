package com.aenlly.entity;

import java.util.Objects;

@javax.persistence.Entity
@javax.persistence.Table(name = "post_theme", schema = "aenlly_blog", catalog = "")
public class PostTheme_Entity {
    private int themeId;
    private String themeName;
    private int themeCount;

    @javax.persistence.Id
    @javax.persistence.Column(name = "theme_id", nullable = false)
    public int getThemeId() {
        return themeId;
    }

    public void setThemeId(int themeId) {
        this.themeId = themeId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "theme_name", nullable = false, length = 255)
    public String getThemeName() {
        return themeName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "theme_count", nullable = false)
    public int getThemeCount() {
        return themeCount;
    }

    public void setThemeCount(int themeCount) {
        this.themeCount = themeCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostTheme_Entity that = (PostTheme_Entity) o;
        return themeId == that.themeId &&
                themeCount == that.themeCount &&
                Objects.equals(themeName, that.themeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(themeId, themeName, themeCount);
    }
}

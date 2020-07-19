package com.aenlly.entity;

import java.util.Objects;

@javax.persistence.Entity
@javax.persistence.Table(name = "index", schema = "aenlly_blog", catalog = "")
public class Index_Entity {
    private int indexId;
    private String indexTitle;
    private String indexColor;
    private String indexColumn;

    @javax.persistence.Id
    @javax.persistence.Column(name = "index_id", nullable = false)
    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "index_title", nullable = true, length = 255)
    public String getIndexTitle() {
        return indexTitle;
    }

    public void setIndexTitle(String indexTitle) {
        this.indexTitle = indexTitle;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "index_color", nullable = true, length = 255)
    public String getIndexColor() {
        return indexColor;
    }

    public void setIndexColor(String indexColor) {
        this.indexColor = indexColor;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "index_column", nullable = true, length = 255)
    public String getIndexColumn() {
        return indexColumn;
    }

    public void setIndexColumn(String indexColumn) {
        this.indexColumn = indexColumn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Index_Entity that = (Index_Entity) o;
        return indexId == that.indexId &&
                Objects.equals(indexTitle, that.indexTitle) &&
                Objects.equals(indexColor, that.indexColor) &&
                Objects.equals(indexColumn, that.indexColumn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indexId, indexTitle, indexColor, indexColumn);
    }
}

package com.aenlly.bean;

public class Paging {
    private int pageNow;//当前页
    private int pageSize;//每页显示数
    private int pageCount;//总记录数
    private int pages;//总页数

    private boolean isHasPre;//判断是否有上一页
    private boolean isHasNext;//判断是否有下一页

    public Paging(int pageNow, int pageSize, int pageCount) {//构造器赋值
        this.pageNow = pageNow;
        this.pageSize = pageSize;
        this.pageCount = pageCount;
    }

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPages() {
        if(pageCount%pageSize!=0)//总记录数除以每页数，是否整除
            return pageCount/pageSize+1;//未整除则页数+1
        else
            return pageCount/pageSize;//整除则页数不变
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isHasPre() {
        if(pageNow==1)//当前页码为1时，没有上一页
            return false;
        else
            return true;

    }

    public void setHasPre(boolean hasPre) {
        isHasPre = hasPre;
    }

    public boolean isHasNext() {
        if(pageNow==getPages())//当前页码大于等于最大页码时，无下一页
            return false;
        else
            return true;
    }

    public void setHasNext(boolean hasNext) {
        isHasNext = hasNext;
    }

    @Override
    public String toString() {
        return "Paging{" +
                "pageNow=" + pageNow +
                ", pageSize=" + pageSize +
                ", pageCount=" + pageCount +
                ", pages=" + pages +
                ", isHasPre=" + isHasPre +
                ", isHasNext=" + isHasNext +
                '}';
    }
}
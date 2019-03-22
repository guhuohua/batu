package com.ch.dto;

public class NewsParam {
    private String title;
    private int newCategoryId;
    private int index;
    private int size;
    private  int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNewCategoryId() {
        return newCategoryId;
    }

    public void setNewCategoryId(int newCategoryId) {
        this.newCategoryId = newCategoryId;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

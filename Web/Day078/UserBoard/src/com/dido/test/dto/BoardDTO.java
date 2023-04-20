package com.dido.test.dto;

public class BoardDTO {
    private int id;
    private int userId;
    private String title;
    private String content;
    private int rCnt;
    private String cDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getrCnt() {
        return rCnt;
    }

    public void setrCnt(int rCnt) {
        this.rCnt = rCnt;
    }

    public String getcDate() {
        return cDate;
    }

    public void setcDate(String cDate) {
        this.cDate = cDate;
    }
}

package com.playdata.dto;

public class BoardDto {
    private int id;
    private String title;
    private String content;
    private String author;
    private String created_at;

    public BoardDto(int id, String title, String content, String author, String created_at) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

}

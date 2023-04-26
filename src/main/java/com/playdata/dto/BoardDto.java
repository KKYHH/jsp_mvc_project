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

    public static BoardBuilder builder() {
        return new BoardBuilder();
    }

    public static class BoardBuilder {
        private int id;
        private String title;
        private String content;
        private String author;
        private String created_at;

        /**
         * builder 쓰기 하지만 롬복으로 가능
         * @param id
         * @return
         */
        public BoardBuilder id(int id) {
            this.id = id;
            return this;
        }

        public BoardBuilder title(String title) {
            this.title = title;
            return this;
        }

        public BoardBuilder content(String content) {
            this.content = content;
            return this;
        }

        public BoardBuilder author(String author) {
            this.author = author;
            return this;
        }

        public BoardBuilder created_at(String created_at) {
            this.created_at = created_at;
            return this;
        }

        public BoardDto build() {
            return new BoardDto(id, title, content, author, created_at);
        }
    }
}
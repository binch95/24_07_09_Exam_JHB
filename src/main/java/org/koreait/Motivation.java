package org.koreait;

public class Motivation {
    private int id;
    private String content;
    private String author;
    private String regDate;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "Motivation{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", regDate='" + regDate + '\'' +
                '}';
    }

    public Motivation(int id, String regDate, String content, String author) {
        this.id = id;
        this.author = author;
        this.regDate = regDate;
        this.content = content;
    }

}

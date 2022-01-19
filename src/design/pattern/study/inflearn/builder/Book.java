package design.pattern.study.inflearn.builder;

import java.time.LocalDateTime;

public class Book {

    private String author;
    private String name;
    private LocalDateTime publishDate;
    private int pages;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPublishDate(LocalDateTime publishDate) {
        this.publishDate = publishDate;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getPublishDate() {
        return publishDate;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", publishDate=" + publishDate +
                ", pages=" + pages +
                '}';
    }
}

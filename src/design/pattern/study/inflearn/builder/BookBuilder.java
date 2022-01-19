package design.pattern.study.inflearn.builder;

import javax.swing.*;
import java.security.cert.CertPathBuilder;
import java.time.LocalDateTime;

public class BookBuilder {

    private Book book;

    private BookBuilder() {
        this.book = new Book();
    }

    public static BookBuilder start() {
        return new BookBuilder();
    }

    public BookBuilder setAuthor(String author) {
        book.setAuthor(author);
        return this;
    }

    public BookBuilder setName(String name) {
        book.setName(name);
        return this;
    }

    public BookBuilder setPublishDate(LocalDateTime publishDate) {
        book.setPublishDate(publishDate);
        return this;
    }

    public BookBuilder setPage(int page) {
        book.setPages(page);
        return this;
    }

    public Book build() {
        return this.book;
    }
}

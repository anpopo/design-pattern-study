package design.pattern.study.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate<Book> {
    private List<Book> books;

    public BookShelf () {
        this.books = new ArrayList<>();
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return this.books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}

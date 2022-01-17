package design.pattern.study.book.iteratorpattern;

public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("Around thd World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("부의 추월 차선"));
        bookShelf.appendBook(new Book("미움 받을 용기"));
        bookShelf.appendBook(new Book("연금 술사"));

        Iterator<Book> it = bookShelf.iterator();

        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }

    }
}

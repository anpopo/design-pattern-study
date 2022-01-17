package design.pattern.study.book.iteratorpattern;

public interface Aggregate<E> {
    Iterator<E> iterator();
}

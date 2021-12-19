package design.pattern.study.iteratorpattern;

public interface Aggregate<E> {
    Iterator<E> iterator();
}

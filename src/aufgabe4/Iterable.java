package aufgabe4;

public interface Iterable<T> {
    boolean hasNext();
    T next();
    void remove();
}

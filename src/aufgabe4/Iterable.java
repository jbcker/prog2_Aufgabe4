package aufgabe4;

import java.util.function.Consumer;

public interface Iterable<T> {
    boolean hasNext();
    T next();
    void remove();
    default void forEach(Consumer<? super T> action) { }
}

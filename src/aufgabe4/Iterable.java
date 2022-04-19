package aufgabe4;

import java.util.Iterator;
import java.util.function.Consumer;

public interface Iterable<T> {
    Iterator<T> iterator();
//    boolean hasNext();
//    T next();
//    void remove();
//    default void forEach(Consumer<? super T> action) { }
}

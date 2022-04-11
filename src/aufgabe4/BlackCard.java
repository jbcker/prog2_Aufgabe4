package aufgabe4;

public class BlackCard<T> extends Card<T> {
    int size;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public void add(Object w, int f) {

    }

    @Override
    public Word get(int pos) {
        return null;
    }
}

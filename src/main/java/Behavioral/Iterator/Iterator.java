package Behavioral.Iterator;

public interface Iterator<T> {
    boolean hasNext();
    public T next();
    void remove();
}

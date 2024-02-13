package Behavioral.Iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class ArrayListIterator<T> implements Iterator {
    private List<T> list;
    private int currentIndex;

    public ArrayListIterator(List<T> list){
        this.list = list;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public T next() {
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        return list.get(currentIndex++);

    }

    @Override
    public void remove() {
        if (currentIndex == 0){
            throw new IllegalStateException();
        }
        list.remove(--currentIndex);
    }
}

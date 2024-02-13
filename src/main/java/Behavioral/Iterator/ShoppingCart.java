package Behavioral.Iterator;

import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    public Iterator<Item> createIterator(){
        return new ArrayListIterator<Item>(items);
    }
}


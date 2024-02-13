package Behavioral.Iterator;

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Iterator<Item> iterator = (Iterator<Item>) cart.createIterator();
        while (iterator.hasNext()){
            Item item = iterator.next();
            System.out.println(item.getName());
        }
    }
}

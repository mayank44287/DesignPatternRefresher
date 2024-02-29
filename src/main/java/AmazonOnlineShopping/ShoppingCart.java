package AmazonOnlineShopping;

public class ShoppingCart {
    private int totalPrice;
    private List<Items> items;

    public boolean addItem(Item item);
    public boolean removeItem(Item item);
    public List<Item> getItems();
    public boolean checkout();
}
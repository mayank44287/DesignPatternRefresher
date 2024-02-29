package AmazonOnlineShopping;

public class Admin {
    private Account account;
    public boolean blockUser(Account account);
    public boolean addNewProductCategory(ProductCategory category);
    public boolean modifyProductCategory(ProductCategory category);
    public boolean deleteProductCategory(ProductCategory category);
}

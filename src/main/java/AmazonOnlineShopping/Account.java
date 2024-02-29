package AmazonOnlineShopping;

public class Account {
    private String userName;
    private String password;
    private String name;
    private List<Address> shippingAddress;
    private AccountStatus status;
    private String email;
    private String phone;

    private List<CreditCard> creditCards;
    private List<ElectronicBankTransfer> bankAccounts;

    public Address getShippingAddress();
    public boolean addProduct(Product product);
    public boolean addProductReview(ProductReview review, Product product);
    public boolean deleteProduct(Product product);
    public boolean deleteProductReview(ProductReview review, Product product);
    public boolean resetPassword();
}

package AmazonOnlineShopping;

import java.util.Date;
import java.util.List;

public class Order {
    private String orderNumber;
    private OrderStatus status;
    private Date orderDate;
    private List<OrderLog> orderLog;
    private ShoppingCart shoppingCart;

    public boolean sendForShipment();
    public boolean makePayment(Payment payment);
    public boolean addOrderLog(OrderLog orderLog);
}


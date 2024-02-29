package AmazonOnlineShopping;

import java.util.Date;

public abstract class Payment {
    private double amount;
    private Date timestamp;
    private PaymentStatus status;
    public abstract PaymentStatus makePayment();
}

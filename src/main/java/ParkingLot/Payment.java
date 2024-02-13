package ParkingLot;

import java.util.Date;

public abstract class Payment {
    private double amount;
    private PaymentStatus status;
    private Date timestamp;
    public abstract boolean initiateTransaction();
}

public class Cash extends Payment{
    @Override
    public boolean initiateTransaction() {
        // definition
    }
}

public class Credit extends Payment{
    @Override
    public boolean initiateTransaction() {
        // definition
    }
}

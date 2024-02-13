package ParkingLot;

import java.util.Date;

public class ParkingTicket {
    private int ticketNo;
    private Date timestamp;
    private Date exit;
    private double amount;
    private boolean status;

    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Payment payment;
    private Entrance entrance;
    private Exit exitIns;
}

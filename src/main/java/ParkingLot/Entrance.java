package ParkingLot;

public class Entrance {
    private int id;
    public ParkingTicket getTicket();
}

public class Exit{
    private int id;
    public void validateTicket(ParkingTicket ticket);
}
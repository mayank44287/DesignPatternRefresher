package ParkingLot;

public abstract class Vehicle {
    public int licenseNo;
    public abstract void assignTicket(ParkingTicket parkingTicket);
}

public class Car extends Vehicle{
    @Override
    public void assignTicket(ParkingTicket parkingTicket) {
        //definition
    }
}

public class Van extends Vehicle{
    @Override
    public void assignTicket(ParkingTicket parkingTicket) {
        // defintition
    }
}

public class Motorcycle extends Vehicle{
    @Override
    public void assignTicket(ParkingTicket parkingTicket) {
        // definition
    }
}

public class Truck extends Vehicle{
    @Override
    public void assignTicket(ParkingTicket parkingTicket) {
        // definition
    }
}
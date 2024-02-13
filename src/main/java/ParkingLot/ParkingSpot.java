package ParkingLot;

public abstract class ParkingSpot {
    private int id;
    private boolean isFree;
    private Vehicle vehicle;

    public boolean getIsFree(){
        return isFree;
    }
    public abstract boolean assignVehicle(Vehicle vehicle);
    public  boolean removeVehicle(){
        return false;
    }

}

public class Handicapped extends ParkingSpot{
    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        return false;
    }
}

public class Compact extends ParkingSpot{
    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        return false;
    }
}

public class Large extends ParkingSpot{
    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        return false;
    }
}

public class Motorcycle extends ParkingSpot{
    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        return false;
    }
}

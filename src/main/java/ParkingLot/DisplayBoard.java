package ParkingLot;

import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisplayBoard {
    private int id;
    private Map<String, List<ParkingSpot>> parkingSpots;

    //constructor
    public DisplayBoard(int id){
        this.id = id;
        this.parkingSpots = new HashMap<String, List<ParkingSpot>>();
    }

    public void addParkingSpot(String spotType, List<ParkingSpot> spots);
    public void showFreeSlot();
}

public class ParkingRate{
    private double hours;
    private double time;

    public void calculate();
}

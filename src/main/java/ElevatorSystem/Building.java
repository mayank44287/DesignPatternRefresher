package ElevatorSystem;

import java.util.List;

public class Building {
    private int numberOfFloors;
    private List<ElevatorCar> elevators;
    private List<Floor> floors;
    private static Building building = null;

    public static Building getInstance(){
        if (building == null){
            building = new Building();
        }
        return building;
    }
}

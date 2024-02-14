package ElevatorSystem;

public class ElevatorSystem {
    private Building building;
    public void monitoring();
    public void dispatcher();

    // private constructor to prevent direct instantiation
    private ElevatorSystem(){
        // initialize elevator system
    }
    // The ElevarSystem is a singleton class that ensures it will have only one active instance at a time
    private static ElevatorSystem system = null;

    public static ElevatorSystem getInstance(){
        if (system == null){
            system = new ElevatorSystem();
        }
        return system;
    }
}

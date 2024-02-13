package ParkingLot;

public abstract class Account {
    public String userName;
    public String password;
    public Person person;

    public AccountStatus status;

    public abstract boolean resetPassword();
}

public class Admin extends Account{
    // spot here refers to an instance of the ParkingSpot class
    public boolean addParkingSpot(ParkingSpot spot);
    // displayBoard here refers to an instance of the DisplayBoard class
    public boolean addDisplayBoard(DisplayBoard displayBoard);
    // entrance here refers to an instance of the Entrance class
    public boolean addEntrance(Entrance entrance);
    // exit here refers to an instance of the Exit class
    public boolean addExit(Exit exit);

    // Will implement the functionality in this class
    public boolean resetPassword() {
        // definition
    }
}

public class ParkingAttendant extends Account {
    public boolean processTicket(String ticketNumber);

    // Will implement the functionality in this class
    public boolean resetPassword() {
        // definition
    }
}


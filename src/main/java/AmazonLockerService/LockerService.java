package AmazonLockerService;

import java.util.List;

public class LockerService {
    private List<LockerLocation> locations;

    // Lockerservice is a singleton class
    private static LockerService lockerService = null;

    public static LockerService getInstance(){
        if (lockerService == null){
            lockerService = new LockerService();
        }
        return lockerService;
    }
}

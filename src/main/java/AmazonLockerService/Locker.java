package AmazonLockerService;

public class Locker {
    private String lockerId;
    private String locationId;
    private LockerSize lockerSize;
    private LockerState lockerState;

    public boolean addPackage();
    public boolean removePackage();
}

package AmazonLockerService;

import java.util.Date;
import java.util.List;
import java.util.concurrent.locks.Lock;

public class LockerLocation {
    private String name;
    private List<Locker> lockers;
    private long longitude;
    private long lattitiude;
    private Date openTime;
    private Date closeTime;
}

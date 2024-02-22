package CarRentalSystem;

import java.util.Date;
import java.util.List;

public class Customer extends Account{

    private String licenseNumber;
    private Date licenseExpiry();
    public boolean addReservation();
    public boolean cancelReservation();
    public List<VehicleReservation> getReservations();

}

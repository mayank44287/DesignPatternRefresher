package CarRentalSystem;

import java.util.Date;
import java.util.List;

public class VehicleReservation {
    private int reservationId;
    private String customerId;
    private String vehicleId;
    private Date creationDate;
    private ReservationStatus status;
    private Date dueDate;
    private Date returnDate;
    private String pickupLocation;
    private String returnLocation;

    private List<Equipment> equipments;
    private List<Service> services;

    public static VehicleReservation getReservationDetails();
    public boolean addEquipment();
    public boolean addService();
}

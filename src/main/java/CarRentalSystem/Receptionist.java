package CarRentalSystem;

import java.util.Date;

public class Receptionist extends Account{
    private Date dateJoined;

    public List<Customer> searchCustomer(String name);
    public boolean addReservation();
    public boolean cancelReservation();
    public boolean resetPassword();
}

package LibraryManagementSystem;

import java.util.Date;

public class BookReservation {
    private String itemId;
    private Date creationDate;
    private ReservationStatus status;
    private  String memberId;

    public static BookReservation fetchReservationDetails(String bookItemId);
}



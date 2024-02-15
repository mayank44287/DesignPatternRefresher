package LibraryManagementSystem;

import java.util.Date;

public class BookItem extends Book {
    private String id;
    private boolean isReferenceOnly;
    private Date borrowed;
    private Date dueDate;
    private double price;
    private BookStatus status;
    private Date dateOfPurchase;
    private Date publicationDate;
    private Rack placedAt;

    public boolean checkout(String memberId);
    public void setPlacedAt(Rack rack) {
        // definition
    }
    public void setAddedBy(Librarian librarian) {
        // definition
    }
}
package LibraryManagementSystem;

import java.util.Date;

public class Fine {
    private Date creationDate;
    private String bookItemId;
    private String memberId;

    public static void collectFine(String memberId, long days);
}
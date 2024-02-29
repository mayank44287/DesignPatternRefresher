package AmazonOnlineShopping;

import java.util.Date;

// Notification is an abstract class
public abstract class Notification {
    private int notificationId;
    private Date createdOn;
    private String content;

    public abstract boolean sendNotification(Account account);
}




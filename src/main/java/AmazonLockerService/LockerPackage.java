package AmazonLockerService;

import java.util.Date;

public class LockerPackage extends Package{
    private int codeValidDays;
    private String lockerId;
    private String packageId;
    private String code;
    private Date packageDeliveryTime;

    public boolean isValidCode(){};

    public boolean verifyCode(String code);

}

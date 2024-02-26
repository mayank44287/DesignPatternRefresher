package ATMSystem;

public class BankAccount {
    private int accountNumber;
    private double totalBalance;
    private double avialableBalance;
    public double getAvialableBalance();
}

public class SavingsAccount extends BankAccount{
    public double withdrawLimit();
}

public class CurrentAccount extends BankAccount{
    public double withdrawLimit();
}

package ATMSystem;

public abstract class ATMStates {
    public abstract void insertCard(ATM atm, ATMCard card);
    public abstract void authenticatePin(ATM atm, ATMCard card, int pin);
    public abstract void selectOperation(ATM atm, ATMCard card, TransactionType tType);
    public abstract void cashWithdrawal(ATM atm, ATMCard card, int withdrawAmount);
    public abstract void displayBalance(ATM atm, ATMCard card);
    public abstract void transferMoney(ATM atm, ATMCard card, int accountNumber, int transferAmount);
    public abstract void returnCard();
    public abstract void exit(ATM atm);

}

public class IdleState extends ATMState {
    @Override
    public void insertCard(ATM atm, ATMCard card) {
        // definition
    }

    @Override
    public void returnCard() {
        // definition
    }

    @Override
    public void exit(ATM atm) {
        // definition
    }
}

public class HasCardState extends ATMState {
    @Override
    public void authenticatePin(ATM atm, ATMCard card, int pin) {
        // definition
    }

    @Override
    public void returnCard() {
        // definition
    }

    @Override
    public void exit(ATM atm) {
        // definition
    }
}

public class SelectOperationState extends ATMState {
    @Override
    public void selectOperation(ATM atm, ATMCard card, TransactionType tType) {
        // definition
    }

    @Override
    public void returnCard() {
        // definition
    }

    @Override
    public void exit(ATM atm) {
        // definition
    }
}

public class CheckBalanceState extends ATMState {
    @Override
    public void displayBalance(ATM atm, ATMCard card) {
        // definition
    }

    @Override
    public void returnCard() {
        // definition
    }

    @Override
    public void exit(ATM atm) {
        // definition
    }
}

public class CashWithdrawalState extends ATMState {
    @Override
    public void cashWithdrawal(ATM atm, ATMCard card, int withdrawAmount) {
        // definition
    }

    @Override
    public void returnCard() {
        // definition
    }

    @Override
    public void exit(ATM atm) {
        // definition
    }
}

public class TransferMoneyState extends ATMState {
    @Override
    public void transferMoney(ATM atm, ATMCard card, int accountNumber, int transferAmount) {
        // definition
    }

    @Override
    public void returnCard() {
        // definition
    }

    @Override
    public void exit(ATM atm) {
        // definition
    }
}
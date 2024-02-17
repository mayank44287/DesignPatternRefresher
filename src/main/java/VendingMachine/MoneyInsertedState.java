package VendingMachine;

public class MoneyInsertedState implements State{
    @Override
    public void insertMoney(VendingMachine machine, double amount) {

    }

    public void pressButton(VendingMachine machine, double amount){};
    public void returnChange(double amount){};

    public void updateInventory(VendingMachine machine, int rackNumber){};

    public void updateInventory(VendingMachine machine, int rackNumber){};

    public void dispenseProduct(VendingMachine machine, int rackNumber){};

}

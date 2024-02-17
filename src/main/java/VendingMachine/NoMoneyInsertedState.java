package VendingMachine;

public class NoMoneyInsertedState implements State{
    @Override
    public void insertMoney(VendingMachine machine, double amount){
        //
    }
    public void pressButton(VendingMachine machine,int rackNumber);
    public void returnChange(double amount){}
    public void updateInventory(VendingMachine machine,int rackNumber);
    public void dispenseProduct(VendingMachine machine, int rackNumber );
}

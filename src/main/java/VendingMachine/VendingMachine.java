package VendingMachine;

import java.util.List;

public class VendingMachine {
    private State currentState;
    private double amount;
    private int noOfRacks;
    private List<Rack> racks;
    private List<Rack> availableRacks;
    private static VendingMachine vendingMachine = null;

    private VendingMachine();
    public static VendingMachine getInstance(){
        if (vendingMachine == null){
            vendingMachine = new VendingMachine();
        }
        return vendingMachine;
    }
    public void insertMoney(double amount) {}
    public void pressButton(int rackNumber) {}
    public void returnChange(double amount) {}
    public void updateInventory(int rackNumber) {}
    public void dispenseProduct(int rackNumber) {}
    public int getProductIdAtRack(int rackNumber) {}

}

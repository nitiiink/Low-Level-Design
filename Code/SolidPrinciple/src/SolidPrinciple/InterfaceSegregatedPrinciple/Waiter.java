package SolidPrinciple.InterfaceSegregatedPrinciple;

public class Waiter implements  WaiterInterface {
    @Override
    public void serveCustomer() {
        System.out.println("Serving to customers ...");
    }

    @Override
    public void takeOrder() {
        System.out.println("Waiter -> Taking orders from customers ...");
    }
}

package AbtractFactoryPattern.Vehicle;

public class Honda implements  Vehicle {
    @Override
    public void mileage() {
        System.out.println("Honda mileage : 70kmp/h");
    }
}

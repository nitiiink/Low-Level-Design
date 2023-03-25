package AbtractFactoryPattern.Vehicle;

public class BMW implements  Vehicle {
    @Override
    public void mileage() {
        System.out.println("BMW mileage : 150 kmp/h");
    }
}

package AbtractFactoryPattern.Vehicle;

public class Mercedes implements  Vehicle {
    @Override
    public void mileage() {
        System.out.println("Mercedes mileage : 230 kmp/h");
    }
}

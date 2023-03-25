package AbtractFactoryPattern;

import AbtractFactoryPattern.Factory.Factory;
import AbtractFactoryPattern.Vehicle.Vehicle;
import AbtractFactoryPattern.VehicleFactory.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract factory Design Pattern");

        //creating a factory (luxury or ordinary)
        //based on budget we create a vehicle from that factory
        Factory f1 = new Factory();
        VehicleFactory vehicleFactoryObj1 = f1.getFactory("Luxury");
        Vehicle vehicleObj1 = vehicleFactoryObj1.getVehicle(101);
        vehicleObj1.mileage();
    }
}

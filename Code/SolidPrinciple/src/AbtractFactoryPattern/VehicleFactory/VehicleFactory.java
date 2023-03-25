package AbtractFactoryPattern.VehicleFactory;

import AbtractFactoryPattern.Vehicle.Vehicle;

public interface VehicleFactory {
    public Vehicle getVehicle(int budget);
}

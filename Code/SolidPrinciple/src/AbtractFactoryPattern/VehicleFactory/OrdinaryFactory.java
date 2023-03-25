package AbtractFactoryPattern.VehicleFactory;

import AbtractFactoryPattern.Vehicle.Alto;
import AbtractFactoryPattern.Vehicle.Honda;
import AbtractFactoryPattern.Vehicle.Vehicle;

public class OrdinaryFactory implements  VehicleFactory {
    @Override
    public Vehicle getVehicle(int budget) {
        if(budget > 10 &&  budget < 50) {
            return new Honda();
        }
        else if(budget < 10) {
            return new Alto();
        }
        return null;
    }
}

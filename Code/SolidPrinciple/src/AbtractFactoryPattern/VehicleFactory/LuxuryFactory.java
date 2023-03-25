package AbtractFactoryPattern.VehicleFactory;

import AbtractFactoryPattern.Vehicle.*;

public class LuxuryFactory implements  VehicleFactory {

    @Override
    public Vehicle getVehicle(int budget) {
        if(budget > 50 &&  budget < 100) {
            return new BMW();
        }
        else if(budget > 100) {
            return new Mercedes();
        }
        return null;
    }
}

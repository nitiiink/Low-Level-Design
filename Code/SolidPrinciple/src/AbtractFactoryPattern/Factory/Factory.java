package AbtractFactoryPattern.Factory;

import AbtractFactoryPattern.VehicleFactory.LuxuryFactory;
import AbtractFactoryPattern.VehicleFactory.OrdinaryFactory;
import AbtractFactoryPattern.VehicleFactory.VehicleFactory;

public class Factory {
    public VehicleFactory getFactory(String input) {
        switch (input) {
            case "Luxury" :
                return new LuxuryFactory();
            case "ORDINARY" :
                return new OrdinaryFactory();
            default:
                return null;
        }
    }
}

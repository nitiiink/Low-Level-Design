package StrategyPattern;

public class SpecialVehicle  extends  Vehicle {

    //constructor injection
    SpecialVehicle() {
        super(new SportsDriveStrategy());
    }
}

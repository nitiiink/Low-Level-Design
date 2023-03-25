package StrategyPattern;

public class NormalVehicle extends Vehicle {
    NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}

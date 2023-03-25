package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("---- Strategy Design Patten -----");

        Vehicle v1 = new OffRoadVehicle();
        v1.drive();
    }
}

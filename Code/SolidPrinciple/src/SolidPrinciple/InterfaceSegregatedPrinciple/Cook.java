package SolidPrinciple.InterfaceSegregatedPrinciple;

public class Cook implements CookInterface {
    @Override
    public void cooksDessert() {
        System.out.println("Cook prepared ice-cream in dessert");
    }

    @Override
    public void cooksDishes() {
        System.out.println("Cook -> Cooks dishes present in menu");
    }
}

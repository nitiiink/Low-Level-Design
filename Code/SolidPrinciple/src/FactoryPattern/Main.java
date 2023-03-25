package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Design Pattern");

        ShapeFactory shapeFactoryObj = new ShapeFactory();
        Shape shapeObj = shapeFactoryObj.getShape("CIRCLE");
        shapeObj.draw();
    }
}

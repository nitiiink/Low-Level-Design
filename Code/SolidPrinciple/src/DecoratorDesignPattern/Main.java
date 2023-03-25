package DecoratorDesignPattern;

import DecoratorDesignPattern.Pizza.BasePizza;
import DecoratorDesignPattern.Pizza.VegPizza;
import DecoratorDesignPattern.Toppings.ExtraCheese;
import DecoratorDesignPattern.Toppings.ExtraOnion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Decorator Design Pattern");
        System.out.println("Menu :: VegPizza : $100, NonVegPizza : $200, ExtraCheese: $20, Onion : $10");

        BasePizza VegExtraCheesePizza = new ExtraCheese(new VegPizza());
        int totalCost = VegExtraCheesePizza.cost();
        System.out.println("Total cost of order VegExtraCheesePizza is $"+ totalCost);
    }
}

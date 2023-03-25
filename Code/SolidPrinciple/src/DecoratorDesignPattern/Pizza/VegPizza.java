package DecoratorDesignPattern.Pizza;

import DecoratorDesignPattern.Pizza.BasePizza;

public class VegPizza extends BasePizza {
    @Override
    public int cost() {
        return 100;
    }
}

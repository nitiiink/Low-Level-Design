package DecoratorDesignPattern.Pizza;

import DecoratorDesignPattern.Pizza.BasePizza;

public class NonVegPizza extends BasePizza {
    @Override
    public int cost() {
        return 200;
    }
}

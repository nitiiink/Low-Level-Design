package DecoratorDesignPattern.Toppings;

import DecoratorDesignPattern.Pizza.BasePizza;

public abstract class ToppingsDecorator extends BasePizza {
    public abstract int cost();
}

package DecoratorDesignPattern.Toppings;

import DecoratorDesignPattern.Pizza.BasePizza;
import DecoratorDesignPattern.Toppings.ToppingsDecorator;

public class ExtraOnion extends ToppingsDecorator {
    BasePizza pz;
   public ExtraOnion (BasePizza pz) {
        this.pz = pz;
    }

    @Override
    public int cost() {
        return this.pz.cost() + 10;
    }
}

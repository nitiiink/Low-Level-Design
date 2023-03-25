package DecoratorDesignPattern.Toppings;

import DecoratorDesignPattern.Pizza.BasePizza;

public class ExtraCheese extends ToppingsDecorator {
    BasePizza pz;
   public ExtraCheese(BasePizza pz) {
       this.pz = pz;
   }

    @Override
    public int cost () {
        return this.pz.cost()+20;
    }
}

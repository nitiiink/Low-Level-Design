package SolidPrinciple.InterfaceSegregatedPrinciple;

public class Main {
    public static void main(String[] args) {
        /*
            Interface Segmented Principle : Client shouldn't implement unnececessary fn that they don't need
            try to segment interface as smaller as possible, eg: cook interface can't have washDishes, as cook won't wash dishes
         */
        Waiter w1 = new Waiter();
        w1.takeOrder();
        Cook c1 = new Cook();
        c1.cooksDishes();
    }
}

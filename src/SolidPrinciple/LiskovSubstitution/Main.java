package SolidPrinciple.LiskovSubstitution;

public class Main {
    /*
       c1 isA c2 is not enough for inheritance
       if your child is not following your method , it is violating the Liskov principle, and hence inheritance should not be allowed else we get error
       Class cycle should follow all the methods of parent class and not narrow it down
     */
    public static void main(String[] args) {
        Motorcycle m = new Motorcycle();
        Cycle c = new Cycle();
        m.turnOnEngine();
        c.turnOnEngine();
    }
}

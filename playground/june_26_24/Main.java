/*
 *  1) Create new classes for each real-world object
 *  that you observed at the beginning of this trail. 
 * Refer to the Bicycle
 *  class if you forget the required syntax.
 * 
2) For each new class that you've created above, 
create an interface that defines its behavior, 
then require your class to implement it. 
Omit one or two methods and try compiling. 
What does the error look like?
 */

package june_26_24;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is main");

        System.out.println("\nTesting pizza\n");
        Pizza pizza = new Pizza();
        pizza.printStates();
        pizza.explode();
        pizza.printStates();

        pizza.freeze(30);
        pizza.microwave(300);
        pizza.printStates();
        System.out.println(pizza);

        System.out.println("\nTesting burger\n");
        Burger burger = new Burger();
        System.out.println(burger);
        burger.microwave(300);
        burger.printStates();
        burger.freeze(1000);
        burger.printStates();

    }
}

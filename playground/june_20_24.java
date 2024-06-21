public class june_20_24 {
    public static void main(String[] args) {
        // System.out.println("this is june 20 2024");
        // Exercise 0
        Calculator c = new Calculator();
        System.out.println("3 + 2 = " + c.add(3, 2));
        System.out.println("5 - 4 = " + c.subtract(5, 4));
        System.out.println("4 * 3 = " + c.multiply(4, 3));
        System.out.println("12 / 3 = " + c.divide(12, 3));
        System.out.println("13 / 3 = " + c.divide(13, 3));
        System.out.println("\n\n");

        // Exercise 1
        FibonacciSeries f = new FibonacciSeries();
        f.generate(-4);
        f.generate(0);
        f.generate(1);
        f.generate(2);
        f.generate(7);
        f.generate(15);
        System.out.println("\n\n");

        // Exercise 2
        for (int count=0; count < 7; count++) {
            System.out.println(count + "! = " + june_20_24.factorial(count));
        }
    }
    /*
     * Exercise 2: Factorial Calculator
Write a method in Java that calculates the factorial
 of a given number using recursion.
 The factorial of n is the product of all positive 
 integers less than or equal to n.
     */
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        
        return n * factorial(n-1);
    }
}

/*
 * Exercise 1: Exercise 1: Fibonacci Series
Create a Java method that generates the first n numbers in the Fibonacci series. 
You'll need to use iteration
 (like a loop) to compute each subsequent number by adding the two preceding numbers.
 */

 class FibonacciSeries {
    public void generate(int n) {
        int a = 0, b = 1, temp;
        if (n <= 0) {
            System.out.println("NULL");
            return;
        }
        System.out.print(a);
        for (int count = 1; count < n; count++) {
            /*
             * 0 1 1 2 3
             * 
             * a = 0, b = 1
             * 
             * temp = b
             * b = a + b
             * a = temp
             * 
             * temp = 1
             * b = 0 + 1 = 1
             * a = 1
             * 
             * temp = 1
             * b = 2
             * a = 1
             */
            temp = b;
            b = a + b;
            a = temp;
            System.out.print(" " + a);
        }
        System.out.println();
    }
 }


/*
 * Exercise 0: Make a class that can add, subtract, multiply, and divide floats
 */

 class Calculator {
    public float add(float number1, float number2) {
        return number1 + number2;
    }

    public float subtract(float number1, float number2) {
        return number1 - number2;
    }

    public float multiply(float number1, float number2) {
        return number1 * number2;
    }

    public float divide(float number1, float number2) {
        return number1 / number2;
    }
 }

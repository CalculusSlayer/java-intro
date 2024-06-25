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
        System.out.println("\n\n");

        // Exercise 3
        for (int count=-1; count <= 7; count++) {
            System.out.println("Is " + count + " prime? : " + june_20_24.primeChecker(count));
        }
        System.out.println("\n\n");
        
        // Exercise 4
        String[] listOfWords = {"abc",
                                "abbac",
                                "cookie",
                                "1234",
                                "",
                                "the quick brown fox",
                                "AaAAAa"};
        
        for (int index=0; index<7; index++) {
            System.out.println(listOfWords[index] +  " -> " + june_20_24.stringReverser(listOfWords[index]));
        }

    }
    /*
     * Exercise 4: String Reverser
    Create a method that takes a string 
    as input and returns the string in reverse 
    order. This will help you work with strings and arrays.
     */
    public static String stringReverser(String s) {
        /*
         * 1) Find the length of String `s` initialize a character array of same size.
         * 2) Loop through the characters in String s backwards while assigning
         * each element in the new character array (we are assuming that Strings
         * in java can be accessed by the index).
         * 3) Create and return new string object from the character array.
         */

         // step 1
         char[] newStringArray = new char[s.length()];

         // step 2
         /*
          * count=4, index=0
            count=3, index=1
            count=2, index=2
            count=1, index=3
            count=0, index=4

            s.length() - 1 - count = index
          */
         for (int count=s.length()-1; count >= 0; count--) {
            newStringArray[s.length() - 1 - count] = s.charAt(count);
         }
        
         // step 3
         return new String(newStringArray);
    }
    /*
     * Exercise 3: Prime Number Checker
        Develop a Java method that checks if a number
        is a prime number.
        A prime number is a number greater than 1 that 
        has no positive divisors other than 1 and itself.
     */

     /*
      * Ex 1: primeChecker(5)
      check 5 % 2 == 0, false
      check 5 % 3 == 0, false
      check 5 % 4 == 0, false
      
      return true

      Ex 2: primeChecker(4)
      check 4 % 2 == 0, true

      return false
      */
     public static boolean primeChecker(int n) {
        if (n <= 1) {
            return false;
        }
        for (int count=2; count < n; count++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;

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

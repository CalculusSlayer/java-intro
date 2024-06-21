public class DataTypes {
    public static void main(String[] args) {
        // intger types
        byte aSingleByte = 100; // -128 to 127
        short aSmallNumber = 20000; // -32,768 to 32,767
        int anInteger = 2147483647; 
        long aLargeNumber = 9223372036854775807L;

        // decimal types
        double aDouble = 1.79769313;
        float aFloat = 3.4028F;

        // boolean types
        boolean isWeekend = false;
        boolean isWorkday = true;

        // characters
        char copyrightSymbol = '\u00A9';

        System.out.println("This is the copyright symbol: " + copyrightSymbol);

        /*
         * It was necessary to cast to an integer
         * here since `Math.pow` returns a double, not an int
         */
        System.out.println((int)Math.pow(2, 3));
    }
}

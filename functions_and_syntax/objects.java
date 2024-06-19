import java.util.ArrayList; // Import statement for ArrayList
import java.util.Collections; // Import Collections class

public class objects {
    public static void main(String[] args) {
        String yell = "GET OUT OF HERE!!!";
        System.out.println(yell);

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        // System.out.println(cars);

        // for loop
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        System.out.println();
        Collections.reverse(cars);

        // for-each loop
        // for (String car: cars.subList(0, 2)) {
        //     System.out.println(car);
        // }

        for (String car: cars) {
            String lowerCaseCar = car.toLowerCase();
            if (lowerCaseCar.equals("mazda") || lowerCaseCar.equals("volvo")) {
                System.out.println(car);
            }
        }
    }
}

public class InterfacesDemo {
    public static void main(String[] args) {
        System.out.println("This is interfaces demo");
        ACMEBicycle b = new ACMEBicycle();
        b.printStates();
        b.changeCadence(2);
        b.changeGear(3);
        b.speedUp(40);
        b.applyBrakes(10);
        b.printStates();

    }
}

interface Bicycle2 {

    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);

}

class ACMEBicycle implements Bicycle2 {
    int cadence = 1, gear = 1, speed = 0;

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    public void printStates() {
        System.out.print("cadence: " + cadence
        + " gear: " + gear
        + " speed: " + speed
        + "\n");
    }
}
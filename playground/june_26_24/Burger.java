package june_26_24;

public class Burger implements Food{
    float temperature = 50;

    @Override
    public void microwave(int time) {
        temperature += 0.5 * time;
    }

    @Override
    public void freeze(int time) {
        temperature -= 0.5 * time;
    }

    public void printStates() {
        System.out.println("temperature: " + temperature);
    }
}

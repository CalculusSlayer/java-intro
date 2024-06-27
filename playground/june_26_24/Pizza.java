package june_26_24;

public class Pizza implements Food{
    float temperature = 70;

    @Override
    public void microwave(int time) {
        temperature += 0.1 * time;
    }

    @Override
    public void freeze(int time) {
        temperature -= 0.1 * time;
    }

    public void explode() {
        temperature += 100;
    }

    public void printStates() {
        System.out.println("temperature: " + temperature);
    }
}

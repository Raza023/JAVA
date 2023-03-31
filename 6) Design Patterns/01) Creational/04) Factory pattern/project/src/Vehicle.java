public class Vehicle {
    private int wheels;

    public Vehicle() {
        this.wheels = 2;
    }

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public String toString() {
        return "Wheel: " + this.getWheels();
    }
}

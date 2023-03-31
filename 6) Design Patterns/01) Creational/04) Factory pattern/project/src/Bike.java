public class Bike extends Vehicle {

    private int wheels;
    public Bike(int w)
    {
        this.wheels = w;
    }
    @Override
    public int getWheels()
    {
        return this.wheels;
    }
    
}

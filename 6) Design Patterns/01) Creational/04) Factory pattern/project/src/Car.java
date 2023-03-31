public class Car extends Vehicle{
    private int wheels;
    public Car(int w)
    {
        this.wheels = w;
    }
    @Override
    public int getWheels()
    {
        return this.wheels;
    }
}

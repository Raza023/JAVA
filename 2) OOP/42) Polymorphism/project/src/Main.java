

public class Main
{
    public static void main(String[] args)
    {
        //polymorphism = greek words for poly - "Many" and morph - "forms"
        //               The ability of an object to identify as more than one type.

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car,bicycle,boat};

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}

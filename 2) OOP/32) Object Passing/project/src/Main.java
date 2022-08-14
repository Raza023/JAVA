

public class Main
{
    public static void main(String[] args)
    {
        //Java object passing.

        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");
        
        Garage garage = new Garage();
        garage.park(car1);                //object passed
        garage.park(car2);                //object passed
    }
}
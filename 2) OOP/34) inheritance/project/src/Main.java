

public class Main
{
    public static void main(String[] args)
    {
        //inheritance = the process in which ane class acquires the data members/methods of another class.
        
        Car car = new Car("BMW",4,4,240);
        car.go(car.name);
        car.stop(car.name);

        System.out.println();

        Bike bike = new Bike("Honda 70",2,2,180);
        bike.go(bike.name);
        bike.stop(bike.name);

        System.out.println();

        System.out.println(car);

        System.out.println(bike);
    }
}
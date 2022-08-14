

public class Main {
    public static void main(String[] args) {
        //There are two methods to copy objects in java.
        //1) obj2.copy(obj1)            //copy method.
        //2) Obj obj2 = new Obj(obj1)   //copy constrctor.


        Car car = new Car("Honda","City",2020);
        Car car2 = new Car("Toyota","Corola",2021);

        //car2 = car;    //by reference (will be sharing same address) (two different names of same values/address) 
        //               //Changing in one object will be applied to other(We don't want this.)
        //               //car.setYear(2022);    it will change the attributes of both objects that refers to same address.

        //Method 1)     //using copy method.
        car2.copy(car);

        //method 2)     //using copy constructor.
        Car car3 = new Car(car);

        System.out.println("Car1 address: "+car);
        System.out.println("Car2 address: "+car2);
        System.out.println("Car3 address: "+car3);

        System.out.println("\nCar 1\nMake: "+car.getMake());
        System.out.println("Model: "+car.getModel());
        System.out.println("Year: "+car.getYear());

        System.out.println("\nCar 2\nMake: "+car2.getMake());
        System.out.println("Model: "+car2.getModel());
        System.out.println("Year: "+car2.getYear());

        System.out.println("\nCar 3\nMake: "+car3.getMake());
        System.out.println("Model: "+car3.getModel());
        System.out.println("Year: "+car3.getYear());
    }
}

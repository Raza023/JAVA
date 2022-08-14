public class Car extends Vehicle{  //decendent
    String name;
    int numOfWheels;
    int numOfDoors;
    Car()
    {
        super(240);
        this.name = "Porsche";
        this.numOfWheels = 4;
        this.numOfDoors = 4;
    }
    Car(String name, int wheels,int doors, double speed)
    {
        super(speed);
        this.name = name;
        this.numOfWheels = wheels;
        this.numOfDoors = doors;
    }

    public String toString()
    {
        return "\nCar Name: "+this.name+"\nCar Wheels: "+this.numOfWheels+"\nCar Doors: "+this.numOfDoors+"\nCar Speed: "+this.speed; 
    }
}

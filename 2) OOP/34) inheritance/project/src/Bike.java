public class Bike extends Vehicle{  //decendent
    String name;
    int numOfWheels;
    int numOfPaddels;
    Bike()
    {
        super(180);
        // super.speed =180;   //same as above
        this.name = "Honda 70";
        this.numOfWheels = 2;
        this.numOfPaddels = 2;
    }
    Bike(String name, int wheels,int paddels, double speed)
    {
        super(speed);
        this.name = name;
        this.numOfWheels = wheels;
        this.numOfPaddels = paddels;
    }

    public String toString()
    {
        return "\nBike Name: "+this.name+"\nBike Wheels: "+this.numOfWheels+"\nBike Paddels: "+this.numOfPaddels+"\nBike Speed: "+this.speed; 
    }
}

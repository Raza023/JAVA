
public class Cars {
    String make = "Civic";
    String made = "Honda";
    int year = 2020;
    String color = "blue";
    double price = 15000000.00;

    void display()
    {
        System.out.println("Car is: "+this.made+" "+this.make);
        System.out.println("Year of the car manufacturing is: "+this.year);
        System.out.println("Color of the car is: "+this.color);
        System.out.println("Price of the car is: "+this.price);
    }

    void drive()
    {
        System.out.println("\nYou are driving a car.");
    }

    void brake()
    {
        System.out.println("\nYou step on the brakes.");
    }
}
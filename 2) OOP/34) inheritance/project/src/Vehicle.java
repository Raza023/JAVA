public class Vehicle {  //ancestor
    double speed;

    Vehicle()
    {
        speed = 0;
    }

    Vehicle(double speed)
    {
        this.speed = speed;
    }

    void go(String name)
    {
        System.out.println("The "+name+" is moving.");
    }
    
    void stop(String name)
    {
        System.out.println("The "+name+" is stopped.");
    }
}

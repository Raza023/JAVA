public abstract class Vehicle {

    abstract void go();

    void stop()  //it can has non-abstract members as well.
    {
        System.out.println("The driver is stoping a car.");
    }
    
}

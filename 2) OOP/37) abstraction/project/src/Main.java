

public class Main
{
    public static void main(String[] args)
    {
        //abstract = abstract classes can not be instantiated but they can have subclasses.
        //           abstract methods are declared without implementation but implemented somewhere in subclasses.
        //           It's more like for security purposes. Add the layer of security to our code.
        //           Abstract class is an idea. That's why it's abstract. We don't want create objects for that class.
        
        //Vehicle v = new Vehicle();     //can't do that because it's abstract.

        Car c =  new Car();
        c.go();
    }
}
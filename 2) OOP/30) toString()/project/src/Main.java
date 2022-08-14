

public class Main
{
    public static void main(String[] args)
    {
        //toString = special method that all objects inherit.
        //           returns a string that 'textually represents' an object.
        //           can be used both implicitly and explicitly.
        
        Car c = new Car();

        System.out.println(c);               //implicitly
        System.out.println(c.toString());       //same as above explicitly
        //without toString it will show Classname@address of c object in memory like (Car@15db9742).

        //now we don't need that code below.
        // System.out.println("Car make: "+c.make);
        // System.out.println("Car made: "+c.made);
        // System.out.println("Car year: "+c.year);
        // System.out.println("Car color: "+c.color);
    }
}
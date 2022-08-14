

public class Main
{
    public static void main(String[] args)
    {
        //method overriding = Declaring a method in sub class which is already present in parent class.
        //                    It is done so that child class can give its own implementation.
        Lion lion = new Lion();
        lion.speak();

        Animal animal = new Animal();
        animal.speak();
    }
}
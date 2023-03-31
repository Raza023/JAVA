import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //polymorphism = greek words for poly - "Many" and morph - "shapes"/"forms"
        //dynamic    =   After compilation (during runtime).   (Dynamic binding)

        Animal animal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which animal do you want to speak?");
        System.out.print("Press 1 for cat.\nPress 2 for dog\nEnter your choice: ");
        int choice = scanner.nextInt();
        if(choice == 1)
        {
            animal = new Cat();
        }
        else if(choice == 2)
        {
            animal = new Dog();
        }
        else
        {
            animal = new Animal();
        }

        animal.speak();
        
        scanner.close();
    }
}

/*

Polymorphism

Types:
1) compile-time(function overloading, operator overloading). Static Binding (also known as Early Binding)(when type of object is determined at compile time).
2) Runtime(Method overridding, virtual function). Dynamic Binding (also known as Late Binding)(when type of object is determined at run time).

*/

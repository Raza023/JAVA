import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Name: "+name);

        System.out.print("Enter your age: ");
        int age = 0;
        try {
            age = scanner.nextInt();
            System.out.println("Age: "+age);
        } catch (Exception e) {
            //handle exception
            System.out.println("Age must be a number.");
            System.out.println("Exception is: "+e);
            // e.printStackTrace();  //detailed view.
        }
        finally{
            //this code always be executed no matter if there is an exception or not.
            scanner.nextLine();       //it will clear the buffer(which having '\n' in it.) for us. And our program will run nicely.
            age=0;
        }
        
        System.out.print("Enter your gender: ");
        String gender = scanner.nextLine();
        System.out.println("Gender: "+gender);

        scanner.close();
    }
}

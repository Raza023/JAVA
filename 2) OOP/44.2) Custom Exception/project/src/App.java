import java.util.Scanner;

public class App {

    public static void checkAge(int age) throws AgeException
    {
        if(age<0)
        {
            throw new AgeException("\nAge can't be less than 0.");
        }
    }

    public static void main(String[] args) throws Exception {
        
        // Exception  = An event after execution that disrupts the normal flow of the program.
        //e.g., Arithmetic Excpetion, ArrayOutOfBoundsException, FileNotFoundException

        //Custom Exception = User Defined Exception
        //ex. DuplicateEmailException, AgeException

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");

        int age = scanner.nextInt();

        try {
            checkAge(age);
            System.out.println("Your Age: "+age);
        } catch (Exception e) {
            System.out.println("A problem occured: "+e);
        }
        
        scanner.close();
    }
}

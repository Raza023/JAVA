import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //exception = an event that occurs during tthe execution of program that disrupts the normal flow of instructions.
        
        Scanner scanner = new Scanner(System.in);
        try
        {
            System.out.print("Enter numerator: ");
            int x = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int y = scanner.nextInt();
            int z=x/y;                                   //1/2=0 (int division)
            System.out.println("Division: "+z);
        }
        catch(ArithmeticException e)
        {
            System.out.println("You can't divide a number by zero! IDIOT!");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter a whole nummber. You dumb! :(");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong :(");
            System.out.println(e); //prints exception
            //e.printStackTrace();   //full detail of exception
        }
        finally   
        {
            //for scanner/file close or other specific code you want to execute at all costs.
            scanner.close();
        }
        System.out.println("Bye! :)");
    }
}

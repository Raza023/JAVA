import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        double marks = scanner.nextDouble();

        double gpa = 0.0;

        if(marks>=85)
        {
            gpa = 4.0;
            System.out.println("Your GPA is: "+gpa);
        }
        else if(marks>=75)
        {
            gpa = 3.7;
            System.out.println("Your GPA is: "+gpa);
        }
        else if(marks>=70)
        {
            gpa = 3.3;
            System.out.println("Your GPA is: "+gpa);
        }
        else if(marks>=65)
        {
            gpa = 3.0;
            System.out.println("Your GPA is: "+gpa);
        }
        else if(marks>=60)
        {
            gpa = 2.7;
            System.out.println("Your GPA is: "+gpa);
        }
        else if(marks>=55)
        {
            gpa = 2.3;
            System.out.println("Your GPA is: "+gpa);
        }
        else if(marks>=50)
        {
            gpa = 2.0;
            System.out.println("Your GPA is: "+gpa);
        }
        else
        {
            System.out.println("You are fail, "+"Your gpa is less than 2.0.");
        }

        //logical Operators.
        // && (both must be true).
        // || (either must be tre).
        // !  (reverse of condition).

        boolean hasBForm = true;
        boolean hasCNIC = false;

        if(hasBForm==true && hasCNIC==true)
        {
            System.out.println("\n"+"You are eligible to apply for admission in university.");
        }
        else
        {
            System.out.println("\n"+"You are not eligible to apply for admission in university.");
        }

        if(hasBForm==true || hasCNIC==true)
        {
            System.out.println("\n"+"You are eligible to apply for scholarship.");
        }
        else
        {
            System.out.println("\n"+"You are not eligible to apply for scholarship.");
        }

        if(!hasCNIC)
        {
            System.out.println("\n"+"You are not an adult.");
        }

        scanner.nextLine();   //clearing buffer which having '\n' in it.

        System.out.println("\nLet's suppose you are playing a game.\n"+"Do you want to quit?");
        System.out.print("Press q to quit: ");
        String status = scanner.nextLine();

        if(status.equals("q") || status.equals("Q"))      //(don't use ==)(must use Object.eqals(Object))
        {
            System.out.println("Ok then bye!");
        }
        else
        {
            System.out.println("Welcome back to game.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        String day =  scanner.nextLine();

        
        switch (day.toLowerCase())
        {
            case "monday":
                System.out.println("Today is ");
                System.out.println("Monday.");
                break;
            case "tuesday":
                System.out.println("Today is tuesday.");
                break;
            case "wednesday":
                System.out.println("Today is wednesday.");
                break;
            case "thursday":
                System.out.println("Today is thursday.");
                break;
            case "friday":
                System.out.println("Today is friday.");
                break;
            case "saturday":
                System.out.println("Today is saturday.");
                break;
            case "sunday":
                System.out.println("Today is sunday.");
                break;
            default:
                System.out.println("It's not a day.");
                break;
        }

        scanner.close();
    }
}

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = i+1;
        }

        System.out.println("Length: "+arr.length);

        for(int i=0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }


        int arr1[] = {1,2,3,4,5,6,7};
        System.out.println("Length: "+arr1.length);
        for(int i=0; i < arr1.length; i++)
        {
            System.out.println(arr1 [i]);
        }

        int SIZE;
        Scanner scanner  = new Scanner(System.in);
        try 
        {
            System.out.print("Enter size of array: ");

            SIZE = scanner.nextInt();
            
            int []arr3 = new int[SIZE];

            for(int i=0;i<SIZE;i++)
            {
                System.out.print("Enter a number "+(i+1)+": ");
                arr[3] = scanner.nextInt();
            }

            for(int i=0;i<SIZE; i++)
            {
                System.out.println("Number "+(i+1)+":"+arr3[i]);
            }
        } 
        catch (InputMismatchException ioe) 
        {
            System.out.println(ioe);
            ioe.printStackTrace();   
        }
        catch (Exception ioe) 
        {
            System.out.println(ioe);
            ioe.printStackTrace();   
        }
        finally{
            scanner.nextLine();
            scanner.close();
        }
        
        System.out.println("Remaining code.");
    }
}

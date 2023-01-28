import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Linear Search =   //Iterate through a collection one element at a time.

        //runtime complexity : O(n)

        //Disadvantages:
        //slow for large data set.
        //elements are not necessary to be sorted.

        //Advantages:
        //First for searches of small to medium dataset.
        //Does not need to be sorted.
        //Useful for data structures that do not have random access.

        int[] array = new int[10];

        for(int i=0;i<array.length;i++){
            array[i]=i+1;
        }

        System.out.print("Enter a number to search in array: ");
        Scanner scanner = new Scanner(System.in);

        int val = scanner.nextInt();

        int index = LinearSearch(array,val);

        if(index!=-1)
        {
            System.out.println("Element found at : "+index);
        }
        else
        {
            System.out.println("Element was nowhere in the picture.");
        }

        scanner.close();
    }

    public static int LinearSearch(int[] arr, int val)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==val)
            {
                return i;
            }
        }
        return -1;
    }
    
}

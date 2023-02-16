import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // binary search  = Search algorithm that finds the position
        //				    of a target value within a sorted array.
        //				    Half of the array is eliminated during each "step"
        //                  larger the dataset binary search becomes more efficient. 
        int array[] = new int[100];

        int target = 42;

        for(int i=0;i<array.length;i++)
        {
            array[i] = i;
        }

        // int index = Arrays.binarySearch(array, target);   //built in (cheap way to do it.)
        //Let's create our own function now.
        int index = binarySearch(array, target);   
         

        if(index == -1)
        {
            System.out.println(target+" not found.");
        }
        else
        {
            System.out.println(target+" found at index: "+index);
        }
    }

    public static int binarySearch(int[] array, int target)
    {    
        int low = 0;
        int high = array.length-1;

        while(low<=high)
        {
            int middle = low+(high-low)/2;
            int value = array[middle];

            System.out.println("Middle value is: "+value);
            
            if(value<target) low =middle + 1;
            else if (value>target) high = middle - 1;
            else return middle;
        }

        return -1;
    }
}

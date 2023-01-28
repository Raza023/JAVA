public class App {
    public static void main(String[] args) throws Exception {
        // bubble sort = pairs of adjacent elements are compared, and the elements
        //               swapped if they are not in order.
 
        //     Quadratic time O(n^2)
        //     small data set = okay-ish
        //     large data set = BAD (plz don't)

        int []arr = {3,8,4,7,9,5,1,6,2};
        
        bubbleSort(arr);

        System.out.println("Ascending Order: ");  //new line

        for(int i : arr)
        {
            System.out.print(i);
        }

        System.out.println("\nDescending Order: ");  //new line

        bubbleSortDesc(arr);

        for(int i : arr)
        {
            System.out.print(i);
        }
    }

    public static void  bubbleSort(int[] arr)
    {
        for(int i=0;i<arr.length-1; i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void  bubbleSortDesc(int[] arr)
    {
        for(int i=0;i<arr.length-1; i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}


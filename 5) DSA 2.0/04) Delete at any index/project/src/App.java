public class App {

    public static int[] deleteInArray(int []arr,int value)
    {
        int newSize = arr.length-1;
        int []newArr = new int[newSize];

        int idx = -1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == value)
            {
                idx = i;                     //finding first occurence index.
                break;
            }
        }

        if(idx == -1)
        {
            return arr;
        }
        else
        {
            for(int i=0; i<arr.length;i++)
            {
                if(i<idx)
                {
                    newArr[i] = arr[i];
                }
                else if(i==idx)
                {
                    //do nothing.
                }
                else if(i>idx)
                {
                    newArr[i-1] = arr[i];
                }
            }
        }

        return newArr;
    }
    public static void main(String[] args) throws Exception {

        int size = 5;
        int []arr = new int[size];

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = i;
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        arr = deleteInArray(arr,0);

        System.out.println("\nAfter removing 0 New Array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        arr = deleteInArray(arr,2);

        System.out.println("\nAfter removing 2 New Array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        arr = deleteInArray(arr,4);

        System.out.println("\nAfter removing 4 New Array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
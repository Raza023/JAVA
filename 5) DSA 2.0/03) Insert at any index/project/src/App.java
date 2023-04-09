public class App {

    public static int[] insertInArray(int []arr,int index,int value)
    {
        int newSize = arr.length+1;
        int []newArr = new int[newSize];
        if(index == arr.length)            //insertion at the end
        {
            for(int i=0;i<index;i++)
            {
                newArr[i] = arr[i];
            }
            
            newArr[index] = value;
        }
        else if(index>=0 && index<arr.length)       //insertion in between
        {
            for(int i=0;i<index;i++)
            {
                newArr[i] = arr[i];
            }

            for(int i=arr.length;i>index;i--)
            {
                newArr[i] = arr[i-1];
            }

            newArr[index] = value;
        }
        else //otherwise return same array (no insertion)
        {
            return arr;
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

        arr = insertInArray(arr,4,100);

        System.out.println("\nNew Array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        arr = insertInArray(arr,5,200);

        System.out.println("\nNew Array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}


public class App {
    public static void main(String[] args) throws Exception {
        // Recursion is the repitition of procedures.
        // Iteration is the repitition of the processes.

        // recursion = When a thing is defined in terms of itself. - Wikipedia
        //			   Apply the result of a procedure, to a procedure.  
        //			   A recursive method calls itself. Can be a substitute for iteration.
        //			   Divide a problem into sub-problems of the same type as the original.
        //			   Commonly used with advanced sorting algorithms and navigating trees
            
        //			   Advantages
        //			   ----------
        //			   easier to read/write
        //			   easier to debug
            
        //			   Disadvantages
        //			   ----------
        //			   sometimes slower
        //			   uses more memory
        
        iterateThrough(5);
        recurseThrough(5);

        //What if val = 100000 //it will through an exception of stackOverflow.
        // recurseThrough(100000);

        int num = fact(7);
        System.out.println("Factorial of 7 is: "+num);

        System.out.println("2^3: "+pow(2,3));

    }

    public static void iterateThrough(int val)
    {
        for(int i = 0 ; i < val; i++)
        {
            System.out.println(i+1);
        }
    }
    public static void recurseThrough(int val)
    {
        if(val < 1)    //base case
        {
            return; 
        }
        System.out.println(val);   //for decending order
        recurseThrough(val-1);
        System.out.println(val);   //for ascending order
    }

    public static int fact(int val)
    {
        // int num = 1;
        if(val <= 1)
        {
            return val;
        }
        return val*fact(val-1);
    }

    public static int pow(int val, int exp)
    {
        // int num = 1;
        if(exp < 1)
        {
            return 1;
        }
        return val*pow(val,exp-1);
    }
}

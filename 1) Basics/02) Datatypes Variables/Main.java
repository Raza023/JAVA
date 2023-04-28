

public class Main 
{
    public static void main(String[] args)
    {
        //declaration
		//int b;
		//assignment statement
		//b=12;
		//intializtion statement (declaring + assignment)
		// int c=23;
		// System.out.println(c);

        //creating different variables.
		
        boolean isTrue = true;
        System.out.println("Boolean: "+isTrue);
        isTrue = false;
        System.out.println("Boolean: "+isTrue);
        
        byte g = 127;
        System.out.println("Byte: "+g);
		g++;
        // g=g+1;    //can't do this for overflow.
		System.out.println("Byte overflow: "+g);

        short s = 32767;
        System.out.println("Short: "+s);
        s++;
		System.out.println("Short overflow: "+s);

        
		int x=123456;
		System.out.println("int: "+x);
		
		long a = 1234L;
		System.out.println("long: "+a);
		
		float  y = 31234567.1234567989898F;          //7 points precision
		System.out.println("float: "+y);             //float: 3.1234567
		
		double z = 3.12345679898982323232323;       //15 points precision
		System.out.println("double: "+z);           //double: 3.123456798989823
		
		char ch = 'A';
        //char ch=65;         //same as above.
        System.out.println("char: "+ch);

        //A to Z characters.
        // for(int i=65; i<65+26; i++)
        // {
        //     System.out.println((char)i);
        // }
        // for(char i=65; i<65+26; i++)
        // {
        //     System.out.println(i);
        // }
        // for(char i='A'; i<65+26; i++)
        // {
        //     System.out.println(i);
        // }

        String name = "Hassan";
		System.out.println("Name: "+name.toUpperCase());

        //Swapping two variables.
        int j = 23;
        int k = 24;
        System.out.println("j: "+j);
        System.out.println("k: "+k);

        int temp=j;
        j=k;
        k=temp;
        
        System.out.println("After swapping: "+"");
        System.out.println("j: "+j);
        System.out.println("k: "+k);

        k = k+j;
        j = k-j;
        k = k-j;

        System.out.println("After swapping using no extra memory: "+"");
        System.out.println("j: "+j);
        System.out.println("k: "+k);

    }   
}

//		datatypes       size          primitive/reference     value

//		boolean         1 bit                p                true/false

//		byte            1 byte               p                -128/127
//		short           2 bytes              p                -32768/32767
//		int             4 bytes              p                -2 billion/2 billion
//		long            8 bytes              p                -9 quintillion / 9 quintillion   

//decimal point number.  (3.14)
//		float           4 bytes              p                6-7 fractional points
//		double          8 bytes              p                15 digits fractional points

//		char            2 bytes              p                 char -'a'/ascii
//		String          unlimited            r                // number of chars+1

//		primitive                                reference
//		8 bytes or less                           varies 
//		quickly(directly)                         step wise
//		1 value                                   more than 1 or 1
//		less memory                               more memory
//		fast                                      slow to execute.

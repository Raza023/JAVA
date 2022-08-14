

public class Main {
    public static void main(String[] args) {
        //Type casting 
		
		//Implicit typecasting    char->int->long->float->double
		char a ='A';    //'A'
		int b=a;        //65
		long c=b;       //65 
		float d=c;
		double e=d;
		
        System.out.println("Implicit type casting:"+"");
		System.out.println("char: "+a);
		System.out.println("int: "+b);
		System.out.println("long: "+c);
		System.out.println("float: "+d);
		System.out.println("double: "+e);
		
        System.out.println();

		//explicit typecasting
		System.out.println("Explicit type casting:"+"");
		String str="12";
        System.out.println("String: "+str);
		
		int i = Integer.parseInt(str);
		System.out.println("String to int: "+i);

		float f = Float.parseFloat(str);
		System.out.println("string to float: "+f);

		double dbl = Double.parseDouble(str);
		System.out.println("string to double: "+dbl);

        double dblv = 12345.923;
        System.out.println("double: "+dblv);

        int intv= (int)dblv;
        System.out.println("double to int: "+intv);

        long longv= (long)dblv;
        System.out.println("double to long: "+longv);

        
    }    
}

//printf = an optional method to control, format and display text on the console window.
//two arguments = format string + (object/variable/value)
//for it we use format specifier.
//  % [flag] [width] [precision] [conversion-character]

// format specifiers  [conversion-characters]
//  %d     (int)decimal number
//  %b     boolean
//  %c     char
//  %s     String
//  %f     float, double

public class Main {
    public static void main(String[] args) {

        //[conversion-character]
        System.out.printf("My name is %s","Hassan Raza");
        System.out.printf("\nMy age is %d",21);
        System.out.printf("\nMy gender is %c",'M');
        System.out.printf("\nI am a %b Pakistani",true);
        System.out.printf("\nMy heights is %f feets",8.67);

        //[width]      (define the width in which your data should display.)
                       // minimum number of characters to be written as output
        //%16s         //defines from right to left and shifted towards right if data is small.
        //%-16s        //defines from left to right and shifted towards left if data is small and remaining space will be empty.
        System.out.printf("\n\nMy name is %16s","Hassan Raza");


        //[precision]
		// sets number of digits of precision when outputting floating-point values
		System.out.printf("\n\nPi is %.3f",3.14159);       //rounded to three precision points.
		
		// [flags]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers >= 1000
		
		System.out.printf("\n\nPrice of torch is %-15f",10000.0);   //second arg must be double for %f
        System.out.printf("\nPrice of torch is %+f",10000.000);     //shows + sign with value 
        System.out.printf("\nPrice of torch is %+f", -10000.000);            //shows - sign with value 
        System.out.printf("\nPrice of torch is %015f",10000.000);
        System.out.printf("\nPrice of torch is %,15f",-10000.000);           //commas added

        System.out.printf("\n\nPrice of torch is %,-+15.2f",-10000.000);       //, / left-align / negative sign everything there. 
    }
}

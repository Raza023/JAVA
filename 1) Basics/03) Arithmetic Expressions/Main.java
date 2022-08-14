
public class Main {
    public static void main(String[] args) {
        //Arithmetic expression = operands+opertors
        //Operands = values,variables,literals
        //Operators = +,-,*,/,%

        int x=10;
        int y=3;

        double result;

        //+
        result=x+y;
        System.out.println("x+y="+result);

        //-
        result=x-y;
        System.out.println("x-y="+result);

        //* 
        result=x*y;
        System.out.println("x*y="+result);

        // (/)        //int division
        result=x/y;
        System.out.println("int division:\nx/y="+result);

        // (/)        //double division
        result=(double)x/y;
        System.out.println("double division:\nx/y="+result);

        //%
        result=x%y;
        System.out.println("Mod x%y="+result);
    }    
}

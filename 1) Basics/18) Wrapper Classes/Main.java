


public class Main {
    public static void main(String[] args) {
        //Wrapper Classes = Use primitive datatype as a Reference datatype.
        //String, Integer, Double, Character, Boolean are all wrapper classes.
        //It has methods can be used with collections.  (like ArrayList and String ....)

        // Primitive Datatype             Wrapper Class(Reference datatype)
        // boolean                        Boolean
        // char                           Character
        // int                            Integer
        //double                          Double
        //                                String

        //Disadvantage of wrapper classes       Advantages of wrapper classes
        //It's slow to execute                  Useful methods

        //Autoboxing = Automatic conversion from primitive datatype to wrapper class type(Reference datatype).
        Boolean a = true;
        Character b= 'A';
        Integer c = 123;
        Double d = 3.00;
        String str = "Hassan Raza";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(str);

        // a.hashCode();
        //now can use useful functions of wrapper classes.

        System.out.println();

        //unboxing = Reverse of Autoboxing (Automatic conversion from wrapper class type(Reference datatype) to primitive datatype.)
        boolean e = a;
        char f = b;
        int g = c;
        double h = d;

        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }    
}

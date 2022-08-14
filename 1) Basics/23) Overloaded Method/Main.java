public class Main {
    public static void main(String[] args) {
        //overloaded methods = methods that have the same name but have different parameters.
        //                     method name + parameters = function signature.

        System.out.println(add(1, 2.0, 3, 4));

    }

    static int add(int a, int b)
    {
        return a+b;
    }
    static int add(int a, int b, int c)
    {
        return a+b+c;
    }
    static int add(int a, int b, int c, int d)
    {
        return a+b+c+d;
    }

    static double add(double a, double b)
    {
        return a+b;
    }
    static double add(double a, double b, double c)
    {
        return a+b+c;
    }
    static double add(double a, double b, double c, double d)
    {
        return a+b+c+d;
    }
}

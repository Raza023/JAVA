

public class Main
{
    public static void main(String[] args) {
        // methods = block of code that is executed when ever it is called.
        hello();
        hello("Bro",22);

        int x=3;
        int y=4;

        int sum = sum(x, y);
        System.out.println("Sum of "+x+" and "+y+" is "+sum+".");
    }

    public static void hello()
    {
        System.out.println("Hello world!");
    }

    public static void hello(String name, int age)
    {
        System.out.println("Hello "+name+". Your age is "+age);
    }

    static int sum(int x,int y)
    {
        return x+y;
    }
}
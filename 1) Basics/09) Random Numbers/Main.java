import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        
        int a=rnd.nextInt();
        System.out.println("Integer random number: "+a);

        int b=rnd.nextInt(6);
        System.out.println("Integer random number less than 6(0-5): "+b);
        
        int c=rnd.nextInt(6)+1;
        System.out.println("Integer random number (1-6): "+c);

        double d = rnd.nextDouble();
        System.out.println("Double random number (0.0-1.0): "+d);

        boolean e = rnd.nextBoolean();
        System.out.println("Boolean random: "+e);
    }
}

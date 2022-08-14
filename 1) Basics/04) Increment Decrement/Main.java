
public class Main {
    public static void main(String[] args)
    {
		// Increment                           Decrement
		// pre  ++x                            pre --x
		// post x++                            post x--
		
		int x=10;
		
		int y=++x;
        x=10;
        int z=x++;
        x=10;

		System.out.println("Value: "+x);
		System.out.println("Pre Increment: "+y);
		System.out.println("Post Increment: "+z);
		
		int a=10;
		
		int b=--a;
        a=10;
        int c=a--;
        a=10;
        
		System.out.println("Value: "+a);
		System.out.println("Pre Decrement: "+b);
		System.out.println("Post Decrement: "+c);
    }    
}

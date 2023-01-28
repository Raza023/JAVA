import java.util.*;

public class App 
{
    public static void main(String args[])
    {
    	long startTime = System.nanoTime();

		//Do your code here whatever you want...............

		try{
			Thread.sleep(3000);           //3 seconds wait
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		for(int i=0;i<100;i++)
		{
			for(int j=0;j<100;j++)
			{
				System.out.print(i+j);
			}
		}
		//code ended.........................................

		long endTime = System.nanoTime();
		long duration = (endTime - startTime)/1000000;  //in mili-seconds		
		System.out.println("\n\nDuration: "+duration+" ms");

    }
}

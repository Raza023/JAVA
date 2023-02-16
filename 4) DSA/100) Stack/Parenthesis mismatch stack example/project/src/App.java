import java.util.Stack;

public class App 
{
    public static void main(String args[])
    {
    	int num=4;
        int size = num*2;
        int noOfCom = (int)(Math.pow(2, size));

        Stack<String> stack = new Stack<String>();
        
        for (int i=0; i<noOfCom; i++)
        {
            String x = Integer.toBinaryString(i);
            while(x.length()!=size)
            {
                x="0"+x;
            }

			for(int j=0; j<x.length(); j++)
			{
				if(x.charAt(j) == '0')
				{
					StringBuilder string = new StringBuilder(x);
					string.setCharAt(j, '(');
					x=string.toString();
					stack.push("(");
					// x = x.substring(0, j) + '(' + x.substring(j + 1);       //x[j] = '('
				}
				else
				{
					StringBuilder string = new StringBuilder(x);
					string.setCharAt(j, ')');
					x=string.toString();
					if(stack.isEmpty())
					{
						stack.push("not valid");
						break;
					}
					else
					{
						stack.pop();
					}
					// x = x.substring(0, j) + ')' + x.substring(j + 1);           //x[j] = ')'
				}
			}
			if(stack.isEmpty())
			{
				System.out.println(x);
			}
			stack.clear();
        }
    }
}

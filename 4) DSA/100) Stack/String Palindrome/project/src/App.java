import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        String str = "abcba";
        System.out.println(str);
        
        Stack<String> stack = new Stack<String>();
        
        for(int i=0;i<str.length();i++)
        {
            stack.push(String.valueOf(str.charAt(i)));
        }
        
        String str2 = "";
        int size = stack.size(); 

        for(int i=0;i<size;i++)
        {
            String s = stack.pop();          //on every pop() size decreases.
            str2 += s;
        }
        
        System.out.println(str2);

        if(str.equals(str2))
        {
            System.out.println(str+" is a palindrome string.");
        }
    }
}

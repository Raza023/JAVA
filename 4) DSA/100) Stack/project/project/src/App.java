import java.util.Stack;

public class App {
    //Stack: LIFO data structure. (Last in first out)
 
    //Useful functions:
    //       push() to add on the top.
    //       pop() to get and remove the top value.
    //       peek() to get the top value.
    //       isEmpty() or empty()  returns a boolean value (true or false)
    //       search() returns the index starting from 1 from top to bottom.

    //Features of stack:
    //1) Undo/redo feature.
    //2) browser forward/backward moving.
    //3) backtracking algos.
    //4) calling functions (functions call stack)

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        
        System.out.println(stack.empty()); // true

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");

        System.out.println(stack.isEmpty()); // false

        System.out.println(stack);   //[A, B, C, D, E]

        // String lastValue = stack.peek();

        System.out.println("Top of the stack: "+stack.peek());  //E

        while(!stack.isEmpty())
        {
            System.out.println("Popped value: "+stack.pop());
        }

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");

        System.out.println("Position of D: "+stack.search("D"));  //2
    }

}

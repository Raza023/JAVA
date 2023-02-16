import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {

        //FIFO - First in first out. 
        //A collection of design for holding elements prior to processing.
        //It's a linear data structure.

        //offer()        Tail   just added to the queue(enqueue)(add)
        //poll()         Head   about to leave(dequeue)(remove)         //returns null if empty 
        //element()      same as poll() but throws an exception that is not the case in poll().
        //peek()         returns head(not remove)
        //isEmpty()      true/false
        //size()         no. of elements in a queue. 
        //contains(obj)  true/false.

        // Why Queue?
        // keyboard buffer
        // printer queue
        // used in LinkedList, priority queue, BFS.

        Queue<String> queue = new LinkedList<String>();
        // Queue<String> queue = new Queue<String>();      //does not work   //it's an interface and we can not instantiate an object of interface.
         
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");

        System.out.println("Queue: "+queue);   //[a, b, c, d, e]
        
        System.out.println("Peek: "+queue.peek());   //a
        
        System.out.println("poll: "+queue.poll());   //a
        System.out.println("poll: "+queue.poll());   //b
        System.out.println("poll: "+queue.poll());   //c
        System.out.println("poll: "+queue.poll());   //d
        System.out.println("poll: "+queue.poll());   //e
        System.out.println("poll: "+queue.poll());   //null
        
        //System.out.println("element: "+queue.element());   //throws exception  (same as poll).

        System.out.println("Empty: "+queue.isEmpty());   //true
        
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");

        System.out.println("Size: "+queue.size());       //5
        
        System.out.println("Contains: "+queue.contains("a"));   //true
        
    }
}

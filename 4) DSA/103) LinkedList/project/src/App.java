import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        // ArrayLists contiguous memory location
        // Takes time in insert and delete into ArrayList(shifting happens here)

        //LinkedList
        //at non contiguous memory locations.
        //No shifting of elements required in insert/delete

        //doubly linked list:
        //can traverse backward and forward but takes even more memory.


        // *******************************************************
        // LinkedList =  Nodes are in 2 parts (data + address)
        //                        Nodes are in non-consecutive memory locations
        //                        Elements are linked using pointers
                    
        //    advantages?
        //    1. Dynamic Data Structure (allocates needed memory while running)
        //    2. Insertion and Deletion of Nodes is easy. O(1) 
        //    3. No/Low memory waste
        
        //    disadvantages?
        //    1. Greater memory usage (additional pointer)
        //    2. No random access of elements (no index [i])
        //    3. Accessing/searching elements is more time consuming. O(n)
        
        //    uses?
        //    1. implement Stacks/Queues
        //    2. GPS navigation
        //    3. music playlist
        // *******************************************************

        LinkedList<String> linkedlist = new LinkedList<String>();  //it's a doubly linked list.
        //can behave like a stack or queue.

        //stack
        linkedlist.push("A");
        linkedlist.push("B");
        linkedlist.push("C");
        linkedlist.push("D");
        linkedlist.push("E");

        System.out.println(linkedlist);

        System.out.println(linkedlist.pop());
        // System.out.println(linkedlist.poll()); //same as above
        
        System.out.println(linkedlist);

        linkedlist.pop();
        linkedlist.pop();
        linkedlist.pop();
        linkedlist.pop();

        //queue
        linkedlist.offer("A");
        linkedlist.offer("B");
        linkedlist.offer("C");
        linkedlist.offer("D");
        linkedlist.offer("E");

        System.out.println(linkedlist);

        System.out.println(linkedlist.poll());
        
        System.out.println(linkedlist);

        linkedlist.add(3,"d");

        System.out.println(linkedlist);

        linkedlist.remove("D");

        System.out.println(linkedlist);
        
        System.out.println("Index of d: "+linkedlist.indexOf("d"));

        //System.out.println("First element: "+linkedlist.peek());  //same as below one.
        System.out.println("First element: "+linkedlist.peekFirst());
        System.out.println("Last element: "+linkedlist.peekLast());

        linkedlist.addFirst("0");
        linkedlist.addLast("F");

        System.out.println(linkedlist);

        String first = linkedlist.removeFirst();
        String last = linkedlist.removeLast();

        System.out.println(linkedlist);
    }
}

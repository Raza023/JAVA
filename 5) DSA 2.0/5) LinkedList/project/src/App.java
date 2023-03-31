public class App {
    public static void main(String[] args) throws Exception {
        LinkedList linkedList = new LinkedList();

        // linkedList.addFirst(1);
        // linkedList.addFirst(2);
        // linkedList.addFirst(3);
        // linkedList.addFirst(4);
        // linkedList.addFirst(5);
        // linkedList.display();     //behave like stack.

        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);

        System.out.println("Length: "+linkedList.length());

        linkedList.display();

        System.out.println("First: "+linkedList.peekFirst());
        System.out.println("Last: "+linkedList.peekLast());

        linkedList.display();

        System.out.println("First removed: "+linkedList.removeFirst());
        System.out.println("Last removed: "+linkedList.removeLast());

        linkedList.display();

        System.out.println("100 added at position 2.");
        linkedList.set(2,100);

        linkedList.display();

        System.out.println("Removed from position 2: "+linkedList.removeAt(3));
        
        linkedList.display();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        CLinkedList cLinkedList = new CLinkedList();

        // cLinkedList.addFirst(1);
        // cLinkedList.addFirst(2);
        // cLinkedList.addFirst(3);
        // cLinkedList.addFirst(4);
        // cLinkedList.addFirst(5);

        // cLinkedList.display();

        cLinkedList.addLast(1);
        cLinkedList.addLast(2);
        cLinkedList.addLast(3);
        cLinkedList.addLast(4);
        cLinkedList.addLast(5);

        cLinkedList.display();

        System.out.println("First Removed: " + cLinkedList.removeFirst());

        cLinkedList.display();

        System.out.println("First Removed: " + cLinkedList.removeLast());

        cLinkedList.display();
    }
}

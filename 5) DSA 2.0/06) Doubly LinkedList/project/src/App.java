public class App {
    public static void main(String[] args) throws Exception {
        DLinkedList dLinkedList = new DLinkedList();

        // dLinkedList.addFirst(1);
        // dLinkedList.addFirst(2);
        // dLinkedList.addFirst(3);

        // dLinkedList.display();

        dLinkedList.addLast(1);
        dLinkedList.addLast(2);
        dLinkedList.addLast(3);
        dLinkedList.addLast(4);

        dLinkedList.display();

        System.out.println("Length: "+dLinkedList.length());

        dLinkedList.set(2, 10);

        dLinkedList.display();

        System.out.println("First removed: "+dLinkedList.removeFirst());

        dLinkedList.display();

        System.out.println("Last removed: "+dLinkedList.removeLast());

        dLinkedList.display();

        System.out.println("Node at position 2 Removed: "+ dLinkedList.remove(2));

        dLinkedList.display();
    }
}


public class DLinkedList {

    Node head = null;
    Node tail = null;

    public int length()
    {
        int count = 0;

        Node temp = head;

        while(temp != null)
        {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            head.prev = null;
        }
    }

    public void set(int position, int data)
    {
        Node newNode = new Node(data);
        if(position == 0)
        {
            addFirst(data);
        }
        else if(position == length())
        {
            addLast(data);
        }
        else if(position>=0 && position<=length())
        {
            Node temp = head;
            Node current = temp.next;

            int i=1;
            while(i<position)
            {
                temp = temp.next;
                current = current.next;
                i++;
            }

            temp.next = newNode;
            newNode.prev = temp;
            current.prev = newNode;
            newNode.next = current;
        }
    }

    public int removeFirst()
    {
        int data = head.data;
        head = head.next;
        head.prev = null;
        return data;
    }

    public int removeLast()
    {
        // Node temp = head;
        // Node cur = temp.next;
        // while(cur.next != null)
        // {
        //     temp = temp.next;
        //     cur = cur.next;
        // }
        // int data = cur.data;

        int data = tail.data;

        tail = tail.prev;
        tail.next = null;

        return data;
    }

    public int remove(int position)
    {
        if(position<=0 && position>length())
        {
            return -999;
        }
        if(position == 1)
        {
            return removeFirst();
        }
        else if(position == length())
        {
            return removeLast();
        }
        else if(position>=1 && position<=length())
        {
            Node temp = head;
            Node current = temp.next;

            int i=1;
            while(i<position-1)
            {
                temp = temp.next;
                current = current.next;
                i++;
            }

            int data = current.data;

            temp.next = current.next;
            current.next.prev = temp;

            return data;
        }
        else
        {
            return -999;
        }
    }

    public void display()  //from head to tail display.
    {
        Node node = head;
        while(node!=null)
        {
            System.out.print(node.data+" <-> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public void display2()    //from tail to head display.
    {
        Node node = tail;
        while(node!=null)
        {
            System.out.print(node.data+" <-> ");
            node = node.prev;
        }
        System.out.println("null");
    }
    
}



public class CLinkedList {

    Node head = null;
    Node tail = null;

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            tail = head;
            tail.next = head;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            tail = head;
            tail.next = head;
        }
        else
        {
            newNode.next = head;
            head = newNode;  
            tail.next = head;
        }
    }

    public int removeFirst()
    {
        if(head == null)
        {
            return -999;
        }
        if(head == tail)
        {
            int data = head.data;
            head = null;
            tail = null;
            return data;
        }
        else
        {
            int data = head.data;
            head = head.next;
            tail.next = head;
            return data;
        }
    }

    public int removeLast()
    {
        if(head == null)
        {
            return -999;
        }
        if(head == tail)
        {
            int data = tail.data;
            head = null;
            tail = null;
            return data;
        }
        else
        {
            int data = tail.data;
            
            Node temp = head;
            while(temp.next != tail)
            {
                temp = temp.next;
            }

            tail = temp;
            tail.next = head;
            
            return data;
        }
    }

    public void display()
    {
        if(head==null)
        {
            System.out.println("empty");
        }
        else
        {
            Node temp = head;
            while(temp != tail)
            {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println(tail.data);
        }
    }
    
}

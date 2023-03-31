public class LinkedList {
    Node head = null;
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            Node node = head;
            Node last = new Node(-1);
            while(node != null)
            {
                last = node;
                node=node.next;
            }
            last.next = newNode;
        }
    }

    public int length()
    {
        Node node = head;

        if(node == null)
        {
            return 0;
        }

        int count = 0;

        while(node != null)
        {
            count++;
            node = node.next;
        }
        return count;
    }

    public void set(int position, int data)
    {
        Node node = head;

        Node newNode = new Node(data);

        if(node == null)
        {
            head = newNode;
            return;
        }

        if(position == 0)
        {
            newNode.next = head;
            head = newNode;
        }

        if(position<=length() && position>=1)
        {
            int i=1;
            while(node != null && i<position)
            {
                node = node.next;
                i++;
            }

            newNode.next = node.next;
            node.next = newNode;
        }
    }

    public void display()
    {
        Node node = head;

        if(node == null)
        {
            System.out.println("Empty");
            return;
        }

        while(node != null)
        {
            System.out.print(node.data+" -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public int peekFirst()
    {
        Node node = head;

        if(node == null)
        {
            return -999;
        }
        else
        {
            return node.data;
        }
    }

    public int peekLast()
    {
        if(head == null)
        {
            return -999;
        }
        else
        {
            Node node = head;
            Node last = new Node(-999);
            while(node != null)
            {
                last = node;
                node=node.next;
            }
            return last.data;
        }
    }

    public int removeFirst()
    {
        Node node = head;

        if(node == null)
        {
            return -999;
        }
        else
        {
            head = head.next;
            return node.data;
        }
    }

    public int removeLast()
    {
        if(head == null)
        {
            return -999;
        }
        else
        {
            Node temp = head;
            Node current = temp.next;
            while(current.next != null)
            {
                temp = temp.next;
                current = current.next;
            }
            int data = current.data;
            temp.next = null;                 //ya karna bohat zroori ha.(node ko direct null nhi krna)
            return data;
        }
    }

    public int removeAt(int position)
    {
        if(head == null)
        {
            return -999;
        }
        
        int data = 0;

        if(position == 0)
        {
            data = head.data;
            head = head.next;
        }
        else if(position==length()-1)
        {
            Node temp = head;
            Node current = temp.next;
            while(current.next != null)
            {
                temp = temp.next;
                current = current.next;
            }
            data = current.data;
            temp.next = null;                 //ya karna bohat zroori ha.(node ko direct null nhi krna)
        }
        else if(position>=1 && position<length())
        {
            Node temp = head;
            Node current = temp.next;
            
            for(int i=0;i<position-1;i++)
            {
                temp = temp.next;
                current = current.next;
            }
            data = current.data;
            temp.next = current.next;
        }
        return data;
    }
}

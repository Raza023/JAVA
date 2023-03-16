import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.offer("1");
        linkedList.offer("2");
        linkedList.offer("3");
        linkedList.offer("4");
        linkedList.offer("5");
        linkedList.offer("6");
        
        int size = linkedList.size();
        if(size%2==0)
        {
            String temp = "";
            for(int i=0; i<size; i++)
            {
                temp = "";
                if(i%2==0)
                {
                    temp = linkedList.get(i);
                    linkedList.set(i, linkedList.get(i+1));
                    linkedList.set(i+1, temp);
                }    
            }
        }
        else
        {
            String temp = "";
            for(int i=0; i<size-1; i++)
            {
                temp = "";
                if(i%2==0)
                {
                    temp = linkedList.get(i);
                    linkedList.set(i, linkedList.get(i+1));
                    linkedList.set(i+1, temp);
                }    
            }
        }
            

        System.out.println(linkedList);
    }
}

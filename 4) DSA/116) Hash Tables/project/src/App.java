import java.util.*;

public class App 
{
    public static void main(String args[])
    {   	
    	//Hash Tables is a collection of key value pairs.
        // Hashtable = A data structure that stores unique keys to values ex.<Integer, String>
    	//			   Each key/value pair is known as an Entry
    	//			   FAST insertion, look up, deletion of key/value pairs
    	// 			   Not ideal for small data sets, great with large data sets
    	
    	// hashing = Takes a key and computes an integer (formula will vary based on key & data type)
    	//		       In a Hashtable, we use the hash % capacity to calculate an index number 
    	
    	//key.hashCode() % capacity = index  
    	
    	// bucket(index) = an indexed storage location for one or more Entries
    	//	               can store multiple Entries in case of a collision (linked similarly a LinkedList)
    	
    	// collision = hash function generates the same index for more than one key
    	//			less collisions = more efficiency
    	
    	// Runtime complexity: Best Case O(1)
    	//                     Worst Case O(n)  (time complexity of one linked list in one bucket)
        
        Hashtable<Integer,String> table = new Hashtable<>(10);           //10 is capacity   (by default it's 11)
        //Hashtable<Integer,String> table = new Hashtable<>(10,0.5F);    //10 is capacity, 0.5 is the load factor(means Dynamically expands when it reaches 50% of the indecies filled by values)   
        //Dynamically expands when it reaches 75% of the indecies filled by values.(by default)

        table.put(100,"Ali");
        table.put(123,"Abbas");
        table.put(321,"Hassan");
        table.put(555,"Hussain");
        table.put(777,"Jawad");

        //System.out.println(table.get(123));   //Abbas

        //table.remove(123);

        System.out.println("\n\n------------Without Collision------------");
        System.out.println("HashCode\tIndex\tKey\tValue");

        for(Integer key: table.keySet())
        {
            System.out.println(key.hashCode()+"\t\t"+key.hashCode() % 10 +"\t"+key+"\t"+table.get(key));   //for Integer key (key.hashCode() = key).
        }


        Hashtable<String,String> table2 = new Hashtable<>(10);   //10 is capacity   (by default it's 11)
        
        table2.put("100","Ali");
        table2.put("123","Abbas");
        table2.put("321","Hassan");
        table2.put("555","Hussain");
        table2.put("777","Jawad");

        //System.out.println(table2.get("123"));   //Abbas

        //table2.remove("123");

        System.out.println("\n\n------------With Collision------------");
        System.out.println("HashCode\tIndex\tKey\tValue");

        for(String key: table2.keySet())
        {
            System.out.println(key.hashCode()+"\t\t"+key.hashCode() % 10 +"\t"+key+"\t"+table2.get(key));   //for Integer key (key.hashCode() = key).
        }


        

        
    }
}

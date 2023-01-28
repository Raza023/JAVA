import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // ArrayList<String> arrayList = new ArrayList<String>();      //it's also a dynamic array to work with.

        DynamicArray dynamicArray = new DynamicArray();  //default size is 10, Or we can give our size here.

        dynamicArray.add("1");
        dynamicArray.add('2');
        dynamicArray.add(3);

        dynamicArray.insert(0, "0");
        dynamicArray.insert(40, "5");
        dynamicArray.delete("1");
        
        System.out.println("2 is at: "+dynamicArray.search('2'));
        System.out.println(dynamicArray);
        System.out.println("Size: "+dynamicArray.getSize());
        System.out.println("Capacity: "+dynamicArray.getCapacity());
        System.out.println("Is Empty: "+dynamicArray.isEmpty());
        
    }
}

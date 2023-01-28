import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        LinkedList<Integer> linkedList =  new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        long startTime;
        long endTime;
        long elapsedTime;

        for(int i=0; i<10000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

        //------------------------------LinkedList------------------------------
        startTime = System.nanoTime();
        
        //do something.

        //-----------------much time
        // linkedList.get(0);          //21600
        // linkedList.get(5000);       //185000
        // linkedList.get(9999);       //34400

        
        // linkedList.remove(0);       //39000
        // linkedList.remove(5000);    //191600
        linkedList.remove(9999);       //34800

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;

        System.out.println("Time taken by LinkedList: "+elapsedTime);

        //------------------------------ArrayList------------------------------

        startTime = System.nanoTime();
        //do something.

        //------------Less time
        // arrayList.get(0);           //14100  
        // arrayList.get(5000);        //70400
        // arrayList.get(9999);        //24400

        // arrayList.remove(0);         //288200    //much time because of shifting
        // arrayList.remove(5000);      //73500     //less time
        arrayList.remove(9999);    //24000          //less time because of no shifting
        

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;

        System.out.println("Time taken by ArrayList: "+elapsedTime);

    }
}

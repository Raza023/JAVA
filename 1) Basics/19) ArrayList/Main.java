import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //ArrayList (Resizeable array or dynamic array.)

        //declaration
        ArrayList<String> foodList = new ArrayList<String>();        //only for String values.
        // ArrayList<Integer> numList = new ArrayList<Integer>();    //only for int values.
        // ArrayList<Object> objList = new ArrayList<Object>();      //for all types(int,double,String....) of data.

        //Insertion
        foodList.add("Pizza");
        foodList.add("Burger");
        foodList.add("Shuwarma");
        foodList.add("Sandwich");
        
        //updation
        foodList.set(2, "Chiken Tika");

        //deletion
        foodList.remove(1);

        //show
        System.out.println(foodList);
        for (int i = 0; i < foodList.size(); i++) {
            System.out.println(foodList.get(i));
        }

        //clean list (delete all values from ArrayList)
        foodList.clear();

        System.out.println(foodList);
    }
}

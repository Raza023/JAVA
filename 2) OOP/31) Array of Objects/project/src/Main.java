

public class Main
{
    public static void main(String[] args)
    {
        //array of objects.

        //simple array syntax
        // int []numArray = new int[3]; 
        // char []charArray = {'a','b','c'};
        // String []strArray = new String[3]; 

        // objects array syntax 1.
        Food f1 = new Food("Pizza");
        Food f2 = new Food("Burger");
        Food f3 = new Food("Shuwarma");

        Food []refrigerator = new Food[3];
        refrigerator[0] = f1;
        refrigerator[1] = f2;
        refrigerator[2] = f3;

        //syntax 2
        // Food []fridge = {f1,f2,f3};   //same as above

        for (int i = 0; i < refrigerator.length; i++) {
            System.out.println(refrigerator[i]);
        }
    }
}
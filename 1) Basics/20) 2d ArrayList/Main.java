import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("Cookies");
        bakeryList.add("Morgan Rusk");
        bakeryList.add("Gourmet Bun");

        System.out.println("Bakery list: "+bakeryList+"\n");

        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("Pepsi");
        drinksList.add("Coca Cola");
        drinksList.add("Bold Sprite");
        drinksList.add("Sting");

        System.out.println("Drinks List: "+drinksList+"\n");

        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
        groceryList.add(bakeryList);
        groceryList.add(drinksList);

        System.out.println("Grocery list: "+groceryList+"\n");
        System.out.println("Grocery list: ");

        for (int i = 0; i < groceryList.size() ; i++)
        {
            for (int j = 0; j < groceryList.get(i).size(); j++)
            {
                System.out.print(groceryList.get(i).get(j)+"\t");
            }
            System.out.println();
        }
    }    
}



public class Main {
    public static void main(String[] args) {
        String name = "Bro";

        if(name.equals("Bro"))
        {
            System.out.println("Name: "+name);
        }

        if(name.equalsIgnoreCase("bro"))
        {
            System.out.println("Samll name: "+name.toLowerCase());
        }

        int lnth = name.length();
        System.out.println("Length of name: "+lnth);

        char ch =name.charAt(0);
        System.out.println("First char of name is: "+ch);

        int ind = name.indexOf("B");
        System.out.println("Index of B in name is: "+ind);

        if(!name.isEmpty())
        {
            System.out.println("Name is defined!");
        }

        System.out.println("NAME: "+name.toUpperCase());
        System.out.println("name: "+name.toLowerCase());

        String secondName = "    bhai    ";
        System.out.println("Second name is: "+secondName.trim()+"!");

        System.out.println("Replaced name: "+name.replace('B', 'P'));

        name = "Bruhh";
        System.out.println("Replaced name: "+name.replace("Br", "Pr"));

        String str = "abcdef";
        
        System.out.print("String Manipulation: ");
        for(int i=0; i<str.length(); i++)
        {
            int chr = str.charAt(i)-32;     //lower case to uppercase conversion
            str = str.substring(0,i)+(char)chr+str.substring(i+1);
        }
        
        System.out.println(str);
    }
}

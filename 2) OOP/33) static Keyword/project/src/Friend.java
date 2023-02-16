public class Friend {
    String name;                      //owned by object
    static int numOfFriends=0;        //owned by class

    Friend()
    {
        this.name="";
        numOfFriends++;
    }
    Friend(String name)
    {
        this.name=name;
        numOfFriends++;
    }

    static void displayFriendsCount()
    {
        System.out.println("I have "+numOfFriends+" best friends.");
    }
}


/*
--------------Static class
A static class is a class in object-oriented programming that can't be instantiated 
and doesn't contain any non-static members. All members of a static class are declared as static, 
which means they belong to the class itself rather than to any particular instance of the class.

public final class MyStaticClass {
    private MyStaticClass() {} // private constructor to prevent instantiation
    
    public static void myStaticMethod() {
        // static method implementation
    }
    
    public static int myStaticField = 42;
}

*/
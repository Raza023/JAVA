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
--------------Static class--------------
A static class is a class in object-oriented programming that 
1) can't be instantiated 
2) and doesn't contain any non-static members. 

All members of a static class are declared as static, which means they belong to the class itself 
rather than to any particular instance of the class.

public final class MyStaticClass {
    private MyStaticClass() {} // private constructor to prevent instantiation
    
    public static void myStaticMethod() {
        // static method implementation
    }
    
    public static int myStaticField = 42;
}

/////////////////In order to use static class//////////////////

public class OuterClass {
    private static int count = 0;

    // Static nested class
    public static class StaticNestedClass {
        
        private MyStaticClass() {} 
        // private constructor to prevent instantiation 
        //but static constructor is not allowed in java(gives compile time error.)

        public static void printMessage() {
            System.out.println("This is a static nested class.");
        }
    }
}

//Object creation
OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();

//access methods
nestedObject.printMessage();
or    
OuterClass.StaticNestedClass.printValue();

//Static constructor is not allowed

1) Static methods can not be inherited from their subclasses because they belong to the class 
in which they are declared. 

2) In the case of a constructor, a constructor is a reusable block of code, which means we can call it from its 
subclasses during the creation of the objects. But, when we declare it as static, it can not be used by its 
subclasses other than the declaring classes. So, it is illegal to declare a constructor as static. 
Thus, it will violate the whole motive of the inheritance concept.

*/
package package1;
import package2.*;

// -----------------------------------Access levels----------------------------------- 

// (modifiers)        class       package       subclass     world
// public             YES         YES           YES          YES
// protected          YES         YES           YES          NO
// No modifier        YES         YES           NO           NO
// private            YES         NO            NO           NO

//To run code:
//project\src\package1> & 'C:\Program Files\Java\jdk1.8.0_74\bin\java.exe' '-cp' 'D:\working\project\bin' 'package1.A' 

public class A {

    protected String protectedModifier = "This is protected.";

    public static void main(String[] args) {
        C c = new C();
        //System.out.println(c.defaultModifier);  //The field c.defaultModifier is not visible here
        System.out.println(c.publicModifier);

        Asub asub = new Asub();
        asub.displayProtected();

        asub.displayDefault();

        c.displayPrivate();
    }
}

// Class access modifier(specifier)
/*

Public: A public class can be accessed from anywhere in the program. 
        It can be accessed by any other class, regardless of which package it belongs to. 
For example:
public class MyClass {
    // class code here
}

Protected: A protected class can be accessed by classes within the same package 
        or by subclasses in any package. 
For example:
protected class MyClass {
    // class code here
}

Default (no modifier specified): A class with default access modifier can be accessed by classes 
within the same package.
For example:
class MyClass {
    // class code here
}

Private: A private class can only be accessed within the same class.
It cannot be accessed from outside the class, even if it belongs to the same package. 
For example:
private class MyClass {
    // class code here
}

*/

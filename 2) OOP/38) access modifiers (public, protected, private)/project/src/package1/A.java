package package1;
import package2.*;

// -----------------------------------Access levels----------------------------------- 

// (modifiers)        class       package       subclass     world
// public             YES         YES           YES          YES
// protected          YES         YES           YES          NO
// No modifier        YES         YES           NO           NO
// private            YES         NO            NO           NO

//To run code:
//project\src\package1>  & 'C:\Program Files\Java\jdk1.8.0_74\bin\java.exe' '-cp' 'D:\working\project\bin' 'package1.A' 

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

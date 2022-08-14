package package2;
import package1.*;

public class C {      // public class objects can be instantiated in other packages. Otherwise not. 

    public String publicModifier = "This is public.";          //accessible anywhere.
    protected String protectedModifier = "This is protected."; //accessible in same class/package and child class using child object.
    String defaultModifier = "This is default.";               //accessible only in same pacakage by class C
    private String privateModifier = "This is private.";       //accessible only in this class.

    public void displayPrivate() {
        System.out.println(this.privateModifier);
    }

}

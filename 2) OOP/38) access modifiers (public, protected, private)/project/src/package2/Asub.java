package package2;
import package1.*;

public class Asub extends A {

    public void displayProtected() {
        Asub asub = new Asub();
        System.out.println(asub.protectedModifier);
    }
    
    public void displayDefault() {
        C c = new C();
        System.out.println(c.defaultModifier);
    }
}

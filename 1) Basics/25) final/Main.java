


public class Main {
    public static void main(String[] args) {

        //it's same like const in other languages.
        final double PI = 3.14159;
				
		//PI = 4;  //You can't change a final variable
		
		System.out.println(PI);
    }    
}

/*

////////////////final class and final methods///////////////////////////////// 
In Java, a final class is a class that cannot be extended or subclassed. When a class is declared as final, 
it means that it is complete and cannot be modified or extended by any other class.

To declare a class as final, simply add the final keyword before the class keyword, like this:

public final class MyClass {
    // Class implementation
}

In this example, MyClass is declared as final, which means that no other class can extend it. 
This is useful when you want to prevent other developers from modifying or subclassing your class, 
for example if you have implemented a sensitive or important functionality in your class that you don't 
want others to change.

Note that when a class is declared as final, its methods are implicitly final as well, which means that 
they cannot be overridden by any subclass.

Here's an example of a final class with a final method:

public final class MyClass {
    private final int value;

    public MyClass(int value) {
        this.value = value;
    }

    public final void printValue() {
        System.out.println("The value is: " + value);
    }
}

VIP: In this example, MyClass is declared as final no other class can extend or modify it. 
and its constructor takes an integer parameter value and initializes a final field with it. 
The printValue() method is also declared as final, which means that it cannot be overridden by any subclass.

To use the MyClass and its methods, you can create an instance of the class and call its methods, like this:

MyClass myObject = new MyClass(42);
myObject.printValue(); // Output: The value is: 42



 */
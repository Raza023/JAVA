public class App {
    // method chaining =  a common syntax for invoking multiple method calls in OOP
    //                    condense code into less lines

    public static void main(String[] args) throws Exception {
        
        String name = "    Bro ";

        // name = name.concat("Hey");
        // name = name.toUpperCase();
        // name = name.trim();

        name = name.concat("Code    ").toUpperCase().trim();

        System.out.println(name);
    }
}

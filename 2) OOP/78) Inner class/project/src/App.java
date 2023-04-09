public class App {
    public static void main(String[] args) throws Exception {
        // inner class =  A class inside of another class.
        // useful if a class should be limited in scope.
        // usually private, but not necessary
        // helps group classes that belong together
        // extremely useful for listeners for specific events
        // precursor for anonymous inner classes   

        Outside outside = new Outside();

        Outside.Inside inside = outside.new Inside();

        // System.out.print(outside.x);
        // System.out.println(inside.y);
        
        inside.greeting();
    }
}

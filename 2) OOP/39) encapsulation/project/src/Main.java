

public class Main {
    public static void main(String[] args) {
        //Encpsulation = Attributes of the class will be hidden/private.
        //               can be accessible only using public methods (getter/setter).
        //               You should make attributes of the class private if you don't have reason to make them public/protected.

        Car car = new Car("Honda","City",2020);
        System.out.println("Make: "+car.getMake());
        System.out.println("Model: "+car.getModel());
        System.out.println("Year: "+car.getYear());

        car.setYear(2022);

        System.out.println("\nMake: "+car.getMake());
        System.out.println("Model: "+car.getModel());
        System.out.println("Year: "+car.getYear());
    }
}

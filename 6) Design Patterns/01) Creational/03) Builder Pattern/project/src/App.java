public class App {
    public static void main(String[] args) throws Exception {
        /*
        1) It's a creational design pattern.
        2) We use it when we have too many argumnets to send in a 
        constructor and it's hard to maintain the order.
        3) when we don't want to send all parameters in object intialisation
        (Generally we send opional parameter as null.)
        */

        Vehicle car = new Vehicle.VehicleBuilder("1500cc", 4).setAirbags(4).build();
        Vehicle bike = new Vehicle.VehicleBuilder("250cc", 2).build();

        System.out.println(car.getEngine());
        System.out.println(car.getWheel());
        System.out.println(car.getAirbags());

        System.out.println(bike.getEngine());
        System.out.println(bike.getWheel());
        System.out.println(bike.getAirbags());
    }
}

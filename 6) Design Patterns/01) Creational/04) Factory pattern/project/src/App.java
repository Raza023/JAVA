


public class App {
    public static void main(String[] args) throws Exception {

        //dynamic polymorphism
        
        Vehicle car = VehicleFactory.getInstance("Car", 4);
        System.out.println(car.getWheels());

        Vehicle bike = VehicleFactory.getInstance("Bike", 2);
        System.out.println(bike.getWheels());
    }   
}

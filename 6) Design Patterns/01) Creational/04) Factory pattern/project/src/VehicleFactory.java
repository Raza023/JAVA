public class VehicleFactory {

    public static Vehicle getInstance(String type, int wheels)
    {
        if(type == "Car")
        {
            return new Car(wheels);
        }
        else if(type == "Bike")
        {
            return new Bike(wheels);
        }

        return null;
    }
    
}

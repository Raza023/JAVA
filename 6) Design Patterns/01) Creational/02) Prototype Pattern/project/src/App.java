import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        01) It's a creational design pattern
        02) It is used when you want to avoid multiple 
        object creation of same instance; instead you
        copy (deep copy) the object to new object & then we can modify
        as per our need.
        03) We clone the object by using override clone().
        */

        Vehicle a = new Vehicle();
        a.insertData();
        
        Vehicle b = (Vehicle) a.clone();
        List<String> list = b.getVehicleList();
        list.add("Honda new Amaze");
        
        System.out.println(a.getVehicleList());
        System.out.println(list);
        
        b.getVehicleList().remove("Audi A4");
        System.out.println(list);
        System.out.println(a.getVehicleList());
    }
}

public class Car {
    String make = "Honda";
    String made = "Civic";
    String color = "red";
    int year = 2022;

    @Override               //no need to write that line by the way.
    public String toString() {
        return "Car Make: "+this.make+"\n"+"Car made: "+this.made+"\n"+"Car color: "+this.color+"\n"+"Car year: "+this.year+"\n";
    }
}

public class Car {
    private String make;
    private String model;
    private int year;

    Car()
    {
        this.make = "Honda";
        this.model = "City";
        this.year = 2020;
    }

    Car(String make,String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    Car(Car c)                  //copy constructor
    {
        this.copy(c);

        // or use following
        // this.setMake(c.getMake());
        // this.setModel(c.getModel());
        // this.setYear(c.getYear());
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void copy(Car c)
    {
        this.setMake(c.getMake());
        this.setModel(c.getModel());
        this.setYear(c.getYear());
    }

    public void go() {
    }
}

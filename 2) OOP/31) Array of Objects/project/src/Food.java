public class Food {
    String name;
    Food()
    {
        this.name = "default food";
    }
    Food(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return "Name of food: "+this.name;
    }
}

public class Hero extends Person
{
    String power;
    Hero()
    {
        super();
        this.power = "";
    }
    Hero(String name, int age, String power)
    {
        super(name,age);
        this.power=power;
    }

    public String toString()
    {
        return super.toString()+" Power: "+this.power;
    }

    // public String toString()   //same as above.
    // {
    //     return "\nName: "+super.name+" Age: "+super.age+" Power: "+this.power;
    // }
}

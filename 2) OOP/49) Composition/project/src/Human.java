public class Human {
    private String name;
    private int age;
    private Organ organ;

    public Human()
    {
        this.name = "";
        this.age = 0;
        this.organ = new Organ();
    }

    public Human(String n, int a, String on, String ot) //composition
    {
        this.name = n;
        this.age = a;
        this.organ = new Organ(on, ot);
    }

    public Human(String n, int a, Organ o)  //aggregation
    {
        this.name = n;
        this.age = a;
        this.organ = o;
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setName(String n)
    {
        this.name = n;
    }

    public void setAge(int a)
    {
        this.age = a;
    }

    @Override
    public String toString()
    {
        return "Name: "+this.name+"\nAge: "+this.age+"\n"+this.organ.toString();
    }
}

public class Human{
    String name;
    int age;
    double weight;
    Human(String name, int age, double weight)
    {
        this.name=name;
        this.age=age;
        this.weight = weight;
    }
    Human()
    {
        this.name = "Hassan Raza";
        this.age=22;
        this.weight = 75;
    }
    void show(int id)
    {
        System.out.println("Human #"+id);
        System.out.println("Name is: "+this.name);
        System.out.println("Age is: "+this.age);
        System.out.println("Weight is: "+this.weight);
    }
    public void nice()
    {
        System.out.println("nice");
    }
}
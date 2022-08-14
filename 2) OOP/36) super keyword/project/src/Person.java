public class Person
{
    String name;
    int age;
    Person()
    {
        this.name = "Hassan";
        this.age = 22;
    }
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String toString()
    {
        return "\nName: "+this.name+" Age: "+this.age;
    }
}
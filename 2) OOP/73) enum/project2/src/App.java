enum Planet
{
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8),
    PLUTO(9);

    int number;
    Planet(int n)
    {
        this.number = n;
    }
}

public class App 
{
    public static void IsHabitable(Planet myPlanet)   //Kabil e Rehaish
    {
        if(myPlanet == Planet.EARTH)
        {
            System.out.println("That is habitable.");
            System.out.println("Planet number is: "+myPlanet.number);
        }
        else
        {
            System.out.println("That is inhabitable.");
            System.out.println("Planet number is: "+myPlanet.number);
        }
    }


    public static void main(String[] args) throws Exception
    {
        // enum = enumerated (ordered listing of items in a collection.);

        Planet myPlanet = Planet.EARTH;
        IsHabitable(myPlanet);

    }
}

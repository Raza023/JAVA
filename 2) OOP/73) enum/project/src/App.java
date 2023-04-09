enum Planet{
    MERCURY,VENUS,EARTH,MARS,JUPITER,SATURN,URANUS,NEPTUNE,PLUTO;
}

public class App {

    public static void IsHabitable(Planet myPlanet)   //Kabil e Rehaish
    {
        if(myPlanet == Planet.EARTH)
        {
            System.out.println("That is habitable.");
        }
        else
        {
            System.out.println("That is inhabitable.");
        }
    }


    public static void main(String[] args) throws Exception {
        
        // enum = enumerated (ordered listing of items in a collection.);

        Planet myPlanet = Planet.EARTH;
        IsHabitable(myPlanet);

    }
}

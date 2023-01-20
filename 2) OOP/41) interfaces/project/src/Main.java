

public class Main {
    public static void main(String[] args) {
        //interface = a template that can be applied to a class.
        //            Similar to inheritance but specifies what class must has to do.
        //            Classes can apply more than one interface. Inheritnce is limited to one super.
        
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        System.out.println();

        Hawk hawk = new Hawk();
        hawk.hunt();
        
        System.out.println();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}

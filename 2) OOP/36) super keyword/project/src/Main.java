

public class Main
{
    public static void main(String[] args)
    {
        //super keyword = it refers to the super class (parent class) of an object.
        //                very similar to the "this" keyword.
        
        Hero hero = new Hero("Spiderman",34,"Throws spider wab");
        System.out.println(hero);

        Hero hero2 = new Hero("Superman",31,"Fly, Eye lazer");
        System.out.println(hero2);

        Hero hero3 = new Hero("Batman",35,"Bat's power");
        System.out.println(hero3);
    }
}
import java.util.Random;


//Global Variables
public class DiceRoller {
    Random rand;
    int num;
    DiceRoller()
    {
        rand = new Random();
        roll();
    }
    void roll()
    {
        num = rand.nextInt(6)+1;
        System.out.println("Dice Number is: "+num);
    }
    void endline()
    {
        System.out.println();
    }
}

//local Variables.
// public class DiceRoller {
//     DiceRoller()
//     {
//         Random rand = new Random();         
//         int num=0;
//         roll(rand,num);
//     }
//     void roll(Random rand,int num)
//     {
//         num = rand.nextInt(6)+1;
//         System.out.println("Dice Number is: "+num);
//     }
// }

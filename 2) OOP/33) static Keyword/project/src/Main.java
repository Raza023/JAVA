

public class Main
{
    public static void main(String[] args)
    {
        //static keyword = It's a modifier. A single copy of variable/method that is created and shared by all the objects of that class.
        //                 sataic member is 'owned' by a class.
        //                 static members called by classname.
        //for Example =    Math.sqrt(25);        //It's also a static method.  (see it's definition by ctrl+leftClick) 

        Friend friend = new Friend("Rauf");
        Friend friend2 = new Friend("Riaz");
        Friend friend3 = new Friend("Sheraz");
        Friend friend4 = new Friend("Raju");

        // System.out.println("I have "+Friend.numOfFriends+" best friends.");
        Friend.displayFriendsCount();       //same as above.

        
    }
}
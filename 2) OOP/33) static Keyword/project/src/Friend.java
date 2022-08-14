public class Friend {
    String name;                      //owned by object
    static int numOfFriends=0;        //owned by class

    Friend()
    {
        this.name="";
        numOfFriends++;
    }
    Friend(String name)
    {
        this.name=name;
        numOfFriends++;
    }

    static void displayFriendsCount()
    {
        System.out.println("I have "+numOfFriends+" best friends.");
    }
}

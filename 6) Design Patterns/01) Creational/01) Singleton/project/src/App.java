public class App {
    public static void main(String[] args) throws Exception {
        Singleton s = Singleton.getInstance();    
        System.out.println(s.data);   //data=10
        s.setData(20);          //data updated to 20
        System.out.println(s.data);

        Singleton s2 = Singleton.getInstance();
        System.out.println(s2.data);  //data remains 20 because only one object was created.
    }
}

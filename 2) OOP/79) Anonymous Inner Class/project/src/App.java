public class App {
    public static void main(String[] args) throws Exception {
        
        Greeting greeting = new Greeting();
        greeting.greeting();

        Greeting greeting2 = new Greeting(){

            @Override
            public void greeting()
            {
                System.out.println("Assalam o Alaikum bro!");
            }

        };

        greeting2.greeting();
    }
}

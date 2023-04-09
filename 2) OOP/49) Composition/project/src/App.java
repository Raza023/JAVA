public class App {
    public static void main(String[] args) throws Exception {
        Human human = new Human("Hassan Raza", 22, "Heart", "Cardiology");

        Organ organ = new Organ("Lung", "Respiratory");
        Human human2 = new Human("Ali Raza", 21, organ);

        System.out.println(human);
        System.out.println(human2);
    }
}

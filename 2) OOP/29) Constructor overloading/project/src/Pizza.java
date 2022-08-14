


public class Pizza{
    String bread;
    String sauce;
    String cheeze;
    String topping;

    Pizza()
    {
        this.bread = "dawn";
        this.sauce = "tomato sauce";
        this.cheeze = "Mozilla";
        this.topping = "Vegetables";
    }

    Pizza(String bread)
    {
        this.bread = bread;
        this.sauce = "tomato sauce";
        this.cheeze = "Mozilla";
        this.topping = "Vegetables";
    }

    Pizza(String bread, String sauce)
    {
        this.bread = bread;
        this.sauce = sauce;
        this.cheeze = "Mozilla";
        this.topping = "Vegetables";
    }

    Pizza(String bread, String sauce, String cheeze)
    {
        this.bread = bread;
        this.sauce = sauce;
        this.cheeze = cheeze;
        this.topping = "Vegetables";
    }

    Pizza(String bread, String sauce, String cheeze, String topping)
    {
        this.bread = bread;
        this.sauce = sauce;
        this.cheeze = cheeze;
        this.topping = topping;
    }

    void show()
    {
        System.out.println("Bread: "+this.bread);
        System.out.println("Sauce: "+this.sauce);
        System.out.println("Cheeze: "+this.cheeze);
        System.out.println("Topping: "+this.topping);
    }

}
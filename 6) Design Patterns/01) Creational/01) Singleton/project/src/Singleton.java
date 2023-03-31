public class Singleton {
    static Singleton s =new Singleton();
    int data = 10;
    private Singleton()
    {
        this.data = 10;
    }
    public static Singleton getInstance()
    {
        return s;
    }
    public int getData()
    {
        return data;
    }
    public void setData(int data)
    {
        this.data = data;
    }
}

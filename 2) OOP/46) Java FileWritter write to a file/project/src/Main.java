import java.io.FileWriter;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            //FileWritter will automatically create a file with the filename given if does not exist.

            //FileWriter writer = new FileWriter("file.txt");  //now it will overwite the file. By default append is false here. File will be overwritten.
            FileWriter writer = new FileWriter("file.txt", true);//now it will be appended at the end.
            writer.write("This is some text\n");
            writer.append("Some text appended\n");
            writer.close();
        }
        catch (IOException e)
        {
            System.out.println("Something went wrong while writing into the file.");
            e.printStackTrace();
        }
    }
}

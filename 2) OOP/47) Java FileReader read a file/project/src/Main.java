import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        //FileReader = allows us to read the content of a file as a character stream. One by one.
        //             read() retrns int value (byte value) that can be cascated into char easily.
        //             read() returns -1 when there is no char to return from a file.
        
        FileReader reader = new FileReader("file.txt");
        try {
            int data = reader.read();
            while(data != -1)
            {
                System.out.print((char)data);
                data = reader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            reader.close();
        }
    }
}

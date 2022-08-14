import java.io.File;


public class Main
{
    public static void main(String[] args)
    {
        //File = an abstract representaion of file and directory pathnames.

        //absolute path
        // File file = new File("C:/Users/HASSAN/Desktop/textfile.txt");
        // File file = new File("C:\\Users\\HASSAN\\Desktop\\textfile.txt");
        
        //relative path
        File file = new File("textfile.txt");
        
        if(file.exists())
        {
            System.out.println("That file exists :)");
            System.out.println("Relative path: "+file.getPath());
            System.out.println("Absolute path: "+file.getAbsolutePath());
            if(file.isFile())
            {
                System.out.println("It's a file not a folder.");
            }
            // if(file.delete())
            // {
            //     System.out.println("File is deleted.");
            // }
        }
        else
        {
            System.out.println("That file does not exist :(");
        }
    }
}

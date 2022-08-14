// import javax.swing.ImageIcon;
// import javax.swing.JFrame;

// import java.awt.Color;

public class Main
{
    public static void main(String[] args)
    {
        //JFrame = A GUI window that allows us to add GUI components to it.
        
        /*
        JFrame frame = new JFrame();   //creates a frame.

        ImageIcon image = new ImageIcon("star.png");    //create Image Icon.
        frame.setIconImage(image.getImage());                    //sets frame icon.

        // frame.getContentPane().setBackground(Color.CYAN);              //must import java.awt.Color;
        // frame.getContentPane().setBackground(new Color(0x123456));   // hex color value.
        frame.getContentPane().setBackground(new Color(0,255,2));  //rgb
        

        frame.setTitle("First JFrame.");                    //sets title of frame
        frame.setSize(420, 420);                    //sets the x-dimension, and y-dimension of frame.
        frame.setResizable(false);                     //prevents frame from resizing.
        frame.setVisible(true);                                //make frame visible.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //exit from application on close byDefaultItIs(JFrame.HIDE_ON_CLOSE)
        */

        new MyFrame();                      //do this if you don't want to use frame name. 
        // MyFrame frame = new MyFrame();        //same as above.
    }
}

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class MyFrame extends JFrame{
    
    MyFrame()
    {
        ImageIcon image = new ImageIcon("star.png");    //create Image Icon.
        this.setIconImage(image.getImage());                    //sets frame icon.

        // this.getContentPane().setBackground(Color.CYAN);              //must import java.awt.Color;
        // this.getContentPane().setBackground(new Color(0x123456));   // hex color value.
        this.getContentPane().setBackground(new Color(0,255,2));  //rgb
        

        this.setTitle("First JFrame.");                    //sets title of frame
        this.setSize(420, 420);                    //sets the x-dimension, and y-dimension of frame.
        this.setResizable(false);                     //prevents frame from resizing.
        this.setVisible(true);                                //make frame visible.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //exit from application on close byDefaultItIs(JFrame.HIDE_ON_CLOSE)
    }

}

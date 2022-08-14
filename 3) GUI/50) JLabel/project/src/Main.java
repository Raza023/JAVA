import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Font;
// import javafx.scene.text.Font;

import java.awt.Color;

public class Main
{
    public static void main(String[] args)
    {
        //JFrame = A GUI window that allows us to add GUI components to it.
        
        
        JFrame frame = new JFrame();   //creates a frame.

        JLabel label = new JLabel();
        label.setText("Welcome to Pakistan!");
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setForeground(Color.GREEN);
        label.setFont(new Font("MV Boli", Font.BOLD, 20));
        label.setIconTextGap(-30);
        ImageIcon icon = new ImageIcon("star.png");
        label.setIcon(icon);
        Border border = BorderFactory.createLineBorder(Color.green, 3);
        label.setBorder(border);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        // label.setBounds(10,10,350,350);
        // frame.setLayout(null);

        ImageIcon logo = new ImageIcon("star.png");    //create Image Icon.
        frame.setIconImage(logo.getImage());                    //sets frame icon.
        // frame.getContentPane().setBackground(new Color(0,255,2));  //rgb
        frame.setTitle("First JFrame.");                    //sets title of frame
        // frame.setSize(620, 620);                    //sets the x-dimension, and y-dimension of frame.
        frame.setResizable(false);                     //prevents frame from resizing.
        frame.setVisible(true);                                //make frame visible.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //exit from application on close byDefaultItIs(JFrame.HIDE_ON_CLOSE)

        frame.add(label);   //label should be added before pack()

        frame.pack();     //for pack() commennt out setBounds, setLayout(null) and setSize.
    }
}

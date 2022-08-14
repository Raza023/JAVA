import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.GridLayout;

public class MyFrame extends JFrame 
{
    MyFrame()
    {
        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("6"));
        this.add(new JButton("7"));
        this.add(new JButton("8"));
        this.add(new JButton("9"));
        // this.add(new JButton("10"));   //this will create new column in grid layout.


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3,3,10,10));   //(rows,cols,hgap,vgap)
        this.setSize(500,500);
        this.setVisible(true);
    }

}

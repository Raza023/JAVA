// import java.awt.Color;
// import java.awt.BorderLayout;
// import java.awt.Font;
import java.awt.*;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class Main
{
    public static void main(String[] args)
    {
        //JPanel = A GUI component that works as container to hold other components.

        JFrame frame = new JFrame();     //Its by default layout is border layout.

        JLabel label = new JLabel();
        label.setText("Pakistan Zindabad!");
        label.setForeground(new Color(255,255,255));
        label.setFont(new Font("MV Boli",Font.BOLD, 20));

        ImageIcon icon = new ImageIcon("star.png");
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);    
        label.setVerticalTextPosition(JLabel.BOTTOM);        
        label.setIconTextGap(-30);
        label.setBounds(0, 0, 300, 300);   //only when Layout is null. 

        JPanel redPanel = new JPanel();  //Its by default layout is flow layout.
        redPanel.setBackground(new Color(255,0,0));
        redPanel.setBounds(0,0,300,300);
        // redPanel.setLayout(new BorderLayout());
        redPanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(new Color(0,255,0));
        greenPanel.setBounds(300,0,300,300);
        // greenPanel.setLayout(new BorderLayout());
        greenPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(new Color(0,0,255));
        bluePanel.setBounds(0,300,600,300);
        // bluePanel.setLayout(new BorderLayout());
        bluePanel.setLayout(null);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);     //because we want to manually place our components here.
        frame.setSize(650,650);
        frame.setVisible(true);
        frame.setResizable(false);

        frame.add(redPanel);
        // redPanel.add(label);

        frame.add(greenPanel);
        greenPanel.add(label);
        
        frame.add(bluePanel);
        // bluePanel.add(label);
    }
}

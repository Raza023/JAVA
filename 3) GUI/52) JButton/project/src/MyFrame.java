import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
// import java.awt.*;




public class MyFrame extends JFrame implements ActionListener
{
    boolean isVisible = false;
    JButton button;
    JLabel label;

    MyFrame()
    {
        button = new JButton();
        button.setBounds(150, 50, 200, 100);
        button.setText("Toggle button");
        button.setFocusable(false);    //removes border around text.
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setIconTextGap(-10);
        button.setFont(new Font("Monospaced", Font.BOLD,20));
        button.setForeground(new Color(255,0,0));
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createLineBorder(new Color(0,255,0), 5, true));
        // button.setEnabled(false);    //to disable button.

        ImageIcon btnIcon = new ImageIcon("star.png");
        Image img = btnIcon.getImage();  
        Image newimg = img.getScaledInstance( 50, 50, java.awt.Image.SCALE_SMOOTH ) ;
        btnIcon = new ImageIcon(newimg);
        button.setIcon(btnIcon);


        button.addActionListener(this);
        // button.addActionListener(e -> System.out.println("no need to implement ActionListener and override method with this lemda statement."));

        label = new JLabel();
        ImageIcon icon = new ImageIcon("star.png");
        label.setIcon(icon);
        label.setBounds(80,100,350,350);
        label.setVisible(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);

        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button)
        {
            if(this.isVisible == false)
            {
                this.isVisible = true;
                label.setVisible(true);
                System.out.println("shown");
            }
            else
            {
                this.isVisible = false;
                label.setVisible(false);
                System.out.println("hidden");
            }
        }
    }

    
}

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args)
    {
        String name=JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null,"Your name is: "+name);
        // System.out.println(name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null,"Your age is: "+age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        JOptionPane.showMessageDialog(null,"Your height is: "+height+"feets!");
    }    
}

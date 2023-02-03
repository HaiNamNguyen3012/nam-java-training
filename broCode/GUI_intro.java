package broCode;
import javax.swing.JOptionPane;
public class GUI_intro {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age") );
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your height") );
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
    }
}

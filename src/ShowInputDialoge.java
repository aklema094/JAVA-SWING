
import javax.swing.JOptionPane;



public class ShowInputDialoge {
    
    public static void main(String[] args) {
        // one parameter--> message
        JOptionPane.showInputDialog("Enter your name ");
        // 2 parameter--> message, edittext hint
         JOptionPane.showInputDialog("Enter your name ","akhi");
         // 4 parameter
         String fName = JOptionPane.showInputDialog(null,"First name","set your first name",-1);
         String lName = JOptionPane.showInputDialog(null,"Last name","set your last name",-1);
         
         String name = fName + " " + lName;
         JOptionPane.showMessageDialog(null, name,"Welcome",1);
         
        
    }
    
}

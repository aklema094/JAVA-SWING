
import javax.swing.JOptionPane;


public class ShowConfirmDia {
    
    public static void main(String[] args) {
       int choice = JOptionPane.showConfirmDialog(null, "Do you want to quit this program","warning",JOptionPane.YES_NO_OPTION,2);
       
       if(choice == JOptionPane.YES_OPTION){
           System.exit(0);
       }else{
           System.out.println("you have clicked no ");
       }
    }
    
}

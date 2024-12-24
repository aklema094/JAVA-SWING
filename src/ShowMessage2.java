import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class ShowMessage2 {
    
    public static void main(String[] args) {
        
        ImageIcon icon = new ImageIcon("D:\\JavaSwing\\JavaSwing\\src\\chat.png");
        JOptionPane.showMessageDialog(null, "new message", "notification", JOptionPane.PLAIN_MESSAGE, icon);
    }
    
}

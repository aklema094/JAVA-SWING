
import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CreateAndSettingJframe1 extends JFrame {
    private ImageIcon icon;
    private Container con;
    
    CreateAndSettingJframe1(){
         setVisible(true);
         setBounds(100,50,300,250);
         setTitle("This is a frame");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         icon = new ImageIcon(getClass().getResource("chat.png"));
         this.setIconImage(icon.getImage());
        con = this.getContentPane();
        con.setBackground(Color.red);
         
    }
    public static void main(String[] args) {
        CreateAndSettingJframe1 frame = new CreateAndSettingJframe1();
        
      
    }   
}


import javax.swing.JFrame;


public class CreateAndSettingJframe {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(400, 300);
        frame.setTitle("frame demo");
        //frame.setLocationRelativeTo(null);
        //frame.setLocation(200, 100);
        frame.setBounds(300, 200, 400, 400);
        frame.setResizable(false);
        
        
        
    }
}


import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class JLevelImage extends JFrame{
    
    private Container c;
    private JLabel imageL;
    private ImageIcon icon;
    
    
    JLevelImage(){
        c = this.getContentPane();
        c.setLayout(null);
        icon = new ImageIcon(getClass().getResource("images.jpeg"));
        imageL = new JLabel(icon);
        imageL.setBounds(50,10,icon.getIconWidth(),icon.getIconWidth());
        c.add(imageL);
        //c.setBackground(Color.red);
        
        
    }
    
    public static void main(String[] args) {
        JLevelImage frame = new JLevelImage();
        frame.setVisible(true);
        frame.setBounds(100,100,400,350);
        frame.setTitle("Image frame demo");
        frame.setResizable(false);
        
    }
    
    
    
}


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class CreateJLevel extends JFrame {
    
    private Container con;
    private JLabel level;
    private Font f;
    
    CreateJLevel(){
         setVisible(true);
         setBounds(100,50,400,350);
         setTitle("This is a frame");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f = new Font("Arial",Font.BOLD,14);
         con = this.getContentPane();
         con.setLayout(null);
         con.setBackground(Color.PINK);
         level = new JLabel();
         level.setText("This is a JLevel");
         level.setBounds(100, 50, 150, 50);
         level.setFont(f);
         level.setForeground(Color.red);
         level.setBackground(Color.BLACK);
         level.setOpaque(true);
         con.add(level);           
    }
    
    public static void main(String[] args) {
        CreateJLevel frame = new CreateJLevel();      
    }
    
}

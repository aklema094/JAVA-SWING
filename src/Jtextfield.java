
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Jtextfield extends JFrame{
    private JTextField fl;
    private Container con;
    private Font f;
    Jtextfield(){
        con = this.getContentPane();
        con.setLayout(null);
        f = new Font("Arial",Font.BOLD+Font.ITALIC,18);
        fl = new JTextField();
        fl.setBounds(50, 50, 150, 60);
        fl.setText("this is JTextField");
        fl.setForeground(Color.BLUE);
        fl.setBackground(Color.GREEN);
        fl.setFont(f);
        con.add(fl);
        con.setBackground(Color.red);
        
        
        
    }
    public static void main(String[] args) {
        Jtextfield frame = new Jtextfield();
        frame.setVisible(true);
        frame.setBounds(50, 50, 400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("JTextFeild");
    }
}

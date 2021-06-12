
package Lab_9;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CreatingFrame extends JFrame
{
    CreatingFrame()
    {
        Font font = new Font("Arial",Font.BOLD,18);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(20,20,450,400);
        this.setResizable(false);
        this.setTitle("First Frame");
        ImageIcon icon = new ImageIcon(("img.png"));       
        this.setIconImage(icon.getImage());
        
        Container c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        JLabel label = new JLabel("Hello");
        label.setBounds(20,20,80,20);
        label.setOpaque(true);
        label.setBackground(Color.gray);
        c.add(label);
        
        JTextField field = new JTextField();
        field.setBounds(120,20,130,20);
        field.setHorizontalAlignment(JTextField.CENTER);
        field.setForeground(Color.gray);
        field.setFont(font);
        c.add(field);
        
        ImageIcon icon2 = new ImageIcon("ice.png");
        JLabel label2 = new JLabel(icon2);
        label2.setBounds(30,0,400,400);
        c.add(label2);
        
    }
    public static void main(String[] args) 
    {
        CreatingFrame frame = new CreatingFrame ();
        frame.setVisible(true);
    }
}

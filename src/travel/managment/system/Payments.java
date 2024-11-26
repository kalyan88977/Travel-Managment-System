
package travel.managment.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Payments extends JFrame implements ActionListener
{
    JButton pay,back;
    
    Payments()
    {
        setBounds(350,85,900,600);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
        Image i2= i1.getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,600);
        add(image);
        
        pay = new JButton("pay");
        pay.setBounds(420,0,80,40);
        pay.addActionListener(this);
        image.add(pay);
        
        back = new JButton("Back");
        back.setBounds(520,0,80,40);
         back.addActionListener(this);
        image.add(back);
        
        setVisible(true);
    } 
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==pay)
        {
            setVisible(false);
            new Paytm();
        }
        else
        {
            setVisible(false);
        }
    }
    
    public static void main(String[] args)
    {
        new Payments();
    }
}

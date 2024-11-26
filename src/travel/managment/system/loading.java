
package travel.managment.system;
import javax.swing.*;
import java.awt.*;

public class loading extends JFrame implements Runnable
{
    Thread t;
    JProgressBar bar;
    String username;
    
    public void run()
    {
        try
        {
            for(int i=1;i<=101;i++)
            {
                int max = bar.getMaximum();//100
                int value= bar.getValue();
                
                if(value < max)
                {
                    bar.setValue(bar.getValue()+1);
                }
                else
                {
                    setVisible(false);
                    new Dashboard(username);
                }
                Thread.sleep(50);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    loading(String username)
    {
        this.username=username;
        t = new Thread(this);
        
       setBounds(500,200,650,400); 
       getContentPane().setBackground(Color.white);
       setLayout(null);
       
       
       JLabel text = new JLabel("Travel and Tourism Application");
       text.setBounds(50,20,600,40);
       text.setForeground(Color.black);
       text.setFont(new Font("Raleway",Font.BOLD,35));
       add(text);
       
       
        
        bar= new JProgressBar();
       bar.setBounds(150,100,300,35);
       bar.setStringPainted(true);
       add(bar);
       
       
       JLabel loading = new JLabel("Loading, Please Wait..");
       loading.setBounds(230,130,150,30);
       loading.setForeground(Color.black);
       loading.setFont(new Font("Raleway",Font.BOLD,16));
       add(loading);
       
       
       JLabel iblusername = new JLabel("Welcome "+username);
       iblusername.setBounds(20,310,400,40);
       iblusername.setForeground(Color.black);
       iblusername.setFont(new Font("Raleway",Font.BOLD,16));
       add(iblusername);
       
       ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("icons/loginnew.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
       
       t.start();
       setVisible(true);
    }
    public static void main(String[] arg)
    {
     new loading("");   
    }
}

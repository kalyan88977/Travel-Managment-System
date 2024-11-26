
package travel.managment.system;
import java.awt.*;
import javax.swing.*;


public class CheckPackage extends JFrame
{
    
    
    CheckPackage()
    {
        setBounds(350,85,900,600);
        
        String[] package1 ={"Gold Package","6 Days and 7 Nights","Airport Assistance","Half Day City Tour","Daily Buffet","Soft Drinks","Full Day 3 Island Cruise","English Speaking Guide","Book Package","Summer Special","RS  12000/-","package1.jpg"};
        String[] package2 ={"Silver Package","5 Days and 6 Nights","Toll Free ","Entrance Free Tickets","Meet and Greet at Airport","Welcome Drinks","Night Safari","Cruise with Dinner","BOOk Now","Winter Special","RS  24000/-","package2.jpg"};
        String[] package3 ={"Brouze Package","6 Days and 5 Nights","Return Airport","Free Clubbing","Horse Riding & Other Games","Hard Drinks Free","Daily Buffet","BBQ Dinner","Book Now","Winter Special","RS 32000/","package3.jpg"};
        
         JTabbedPane tab= new JTabbedPane();
         JPanel p1=CreatePackage(package1);
        tab.addTab("Package 1", null, p1);
        
        JPanel p2=CreatePackage(package2);
       tab.addTab("Package 2", null, p2);
       
       
       JPanel p3=CreatePackage(package3);
       tab.addTab("Package 3", null, p3);
       add(tab);
        
        setVisible(true);
    }
    
    
    public JPanel CreatePackage(String[] pack)
    {
         JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.white);
        
        JLabel l1= new JLabel(pack[0]);
        l1.setBounds(50,5,300,30);
        l1.setForeground(Color.yellow);
        l1.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(l1);
        
        JLabel l2= new JLabel(pack[1]);
        l2.setBounds(30,60,300,30);
        l2.setForeground(Color.red);
        l2.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l2);
        
        
        JLabel l3= new JLabel(pack[2]);
        l3.setBounds(30,110,300,30);
        l3.setForeground(Color.blue);
        l3.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l3);
        
        JLabel i4= new JLabel(pack[3]);
        i4.setBounds(30,160,300,30);
        i4.setForeground(Color.red);
        i4.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(i4);
        
         JLabel i5= new JLabel(pack[4]);
        i5.setBounds(30,210,300,30);
        i5.setForeground(Color.blue);
        i5.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(i5);
        
        JLabel i6= new JLabel(pack[5]);
        i6.setBounds(30,260,300,30);
        i6.setForeground(Color.red);
        i6.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(i6);
        
         JLabel i7= new JLabel(pack[6]);
        i7.setBounds(30,310,300,30);
        i7.setForeground(Color.blue);
        i7.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(i7);
        
         JLabel i8= new JLabel(pack[7]);
        i8.setBounds(30,360,300,30);
        i8.setForeground(Color.red);
        i8.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(i8);
        
        
        JLabel i9= new JLabel(pack[8]);
        i9.setBounds(60,430,300,30);
        i9.setForeground(Color.black);
        i9.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(i9);
        
        
        
        JLabel i10= new JLabel(pack[9]);
        i10.setBounds(80,480,300,30);
        i10.setForeground(Color.MAGENTA);
        i10.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(i10);
        
        
         JLabel I11= new JLabel(pack[10]);
        I11.setBounds(500,480,300,30);
        I11.setForeground(Color.CYAN);
        I11.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(I11);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[11]));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel i12  = new JLabel(i3);
        i12.setBounds(350,20,500,300);
        p1.add(i12);
        
        return p1;
    }
    
  public static void main(String[] args)
  {
      new CheckPackage();
  }
}

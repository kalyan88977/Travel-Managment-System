
package travel.managment.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class Viewbookedhotels extends JFrame implements ActionListener
{
    JButton back;
    String username;
    
    Viewbookedhotels(String username)
    {
        this.username=username;
        setBounds(350,85,900,600);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        
        JLabel text = new JLabel("VIEW BOOKED HOTELS DETAILS");
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        text.setBounds(60,0,400,30);
        add(text);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
                
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        
         JLabel lblhotename = new JLabel("Hotel Name");
        lblhotename.setBounds(30,90,150,25);
        add(lblhotename);
                
        JLabel labelhotelname= new JLabel();
        labelhotelname.setBounds(220,90,150,25);
        add(labelhotelname);
        
        
         JLabel lbltlpersons = new JLabel("Total Persons");
        lbltlpersons .setBounds(30,130,150,25);
        add(lbltlpersons );
                
        JLabel labelpersons = new JLabel();
        labelpersons.setBounds(220,130,150,25);
        add(labelpersons);
        
         JLabel lbldays= new JLabel("Total Days");
        lbldays.setBounds(30,170,150,25);
        add(lbldays);
                
        JLabel labeldays = new JLabel();
        labeldays.setBounds(220,170,150,25);
        add(labeldays);
        
         JLabel lblac = new JLabel("AC/NON-AC");
        lblac.setBounds(30,210,150,25);
        add(lblac);
                
        JLabel labelac = new JLabel();
        labelac.setBounds(220,210,150,25);
        add(labelac);
        
         JLabel lblfood = new JLabel("Food Included?");
        lblfood.setBounds(30,250,150,25);
        add(lblfood);
                
        JLabel labelfood = new JLabel();
        labelfood.setBounds(220,250,150,25);
        add(labelfood);
        
        
        JLabel lblname = new JLabel("Id");
        lblname.setBounds(30,290,150,25);
        add(lblname);
                
        JLabel labelid = new JLabel();
        labelid.setBounds(220,290,150,25);
        add(labelid);
        
        
         JLabel lblnumber = new JLabel("number");
        lblnumber.setBounds(30,330,150,25);
        add(lblnumber);
                
        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(220,330,150,25);
        add(labelnumber);
        
        
         JLabel lblphno = new JLabel("Phno");
        lblphno.setBounds(30,370,150,25);
        add(lblphno);
                
        JLabel labelphno = new JLabel();
        labelphno.setBounds(220,370,150,25);
        add(labelphno);
        
        
        JLabel lblprice = new JLabel("Total Cost");
        lblprice.setBounds(30,410,150,25);
        add(lblprice);
                
        JLabel labelprice = new JLabel();
        labelprice.setBounds(220,410,150,25);
        add(labelprice);
        
        
                    
       
        
        back= new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(130,460,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(450,20,500,400);
        add(Image);
        
        try
        {
            conn conn= new conn();
            String query = "select * from bookhotel where username='"+username+"'";
            ResultSet rs=conn.s.executeQuery(query);
            while(rs.next())
            {
                labelusername.setText(rs.getString("username"));
                labelhotelname.setText(rs.getString("name"));
                labelpersons.setText(rs.getString("person"));
                labeldays.setText(rs.getString("days"));
                labelac.setText(rs.getString("ac"));
                labelfood.setText(rs.getString("food"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("id_number"));
                labelphno.setText(rs.getString("phno"));
                labelprice.setText(rs.getString("price"));
                
            }
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
    }
    public static void main(String[] args)
    {
        new Viewbookedhotels("");
    }
    
}

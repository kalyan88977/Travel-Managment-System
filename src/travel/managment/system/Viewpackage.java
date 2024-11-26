
package travel.managment.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class Viewpackage extends JFrame implements ActionListener
{
    JButton back;
   String username;
    
    Viewpackage(String username)
    {
        this.username=username;
        setBounds(350,85,900,600);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        
        JLabel text = new JLabel("VIEW PACKAGE DETAILS");
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        text.setBounds(60,0,300,30);
        add(text);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
                
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        
         JLabel lblid = new JLabel("package");
        lblid.setBounds(30,90,150,25);
        add(lblid);
                
        JLabel labelpackage= new JLabel();
        labelpackage.setBounds(220,90,150,25);
        add(labelpackage);
        
        
         JLabel lblid_number = new JLabel("Total Persons");
        lblid_number.setBounds(30,130,150,25);
        add(lblid_number);
                
        JLabel labelpersons = new JLabel();
        labelpersons.setBounds(220,130,150,25);
        add(labelpersons);
        
        JLabel lblname = new JLabel("Id");
        lblname.setBounds(30,170,150,25);
        add(lblname);
                
        JLabel labelid = new JLabel();
        labelid.setBounds(220,170,150,25);
        add(labelid);
        
        
         JLabel lblnumber = new JLabel("number");
        lblnumber.setBounds(30,210,150,25);
        add(lblnumber);
                
        JLabel labelid_number = new JLabel();
        labelid_number.setBounds(220,210,150,25);
        add(labelid_number);
        
        
         JLabel lblcountry = new JLabel("Phno");
        lblcountry.setBounds(30,250,150,25);
        add(lblcountry);
                
        JLabel labelphno = new JLabel();
        labelphno.setBounds(220,250,150,25);
        add(labelphno);
        
        
        JLabel lbladdress = new JLabel("price");
        lbladdress.setBounds(30,290,150,25);
        add(lbladdress);
                
        JLabel labelprice = new JLabel();
        labelprice.setBounds(220,290,150,25);
        add(labelprice);
        
        
                    
       
        
        back= new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(130,360,100,25);
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
            String query = "select * from bookpackage where username='"+username+"'";
            ResultSet rs=conn.s.executeQuery(query);
            while(rs.next())
            {
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelid_number.setText(rs.getString("id_number"));
                labelpackage.setText(rs.getString("package"));
                labelprice.setText(rs.getString("price"));
                labelphno.setText(rs.getString("phno"));
                labelpersons.setText(rs.getString("persons"));
                
                
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
        new Viewpackage("");
    }
    
}

package travel.managment.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class ViewCustomer extends JFrame implements ActionListener
{
    JButton back;
   
    
    ViewCustomer(String username)
    {
        setBounds(350,85,900,600);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
                
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        
         JLabel lblid = new JLabel("Id");
        lblid.setBounds(30,100,150,25);
        add(lblid);
                
        JLabel labelid = new JLabel();
        labelid.setBounds(220,100,150,25);
        add(labelid);
        
        
         JLabel lblid_number = new JLabel("Id_Number");
        lblid_number.setBounds(30,150,150,25);
        add(lblid_number);
                
        JLabel labelid_number = new JLabel();
        labelid_number.setBounds(220,150,150,25);
        add(labelid_number);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30,200,150,25);
        add(lblname);
                
        JLabel labelname = new JLabel();
        labelname.setBounds(220,200,150,25);
        add(labelname);
        
        
         JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30,250,150,25);
        add(lblgender);
                
        JLabel labelgender = new JLabel();
        labelgender.setBounds(220,250,150,25);
        add(labelgender);
        
        
         JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(500,50,150,25);
        add(lblcountry);
                
        JLabel labelcountry = new JLabel();
        labelcountry.setBounds(690,50,150,25);
        add(labelcountry);
        
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(500,100,150,25);
        add(lbladdress);
                
        JLabel labeladdress = new JLabel();
        labeladdress.setBounds(690,100,150,25);
        add(labeladdress);
        
        
         JLabel lblphno = new JLabel("Phno");
        lblphno.setBounds(500,150,150,25);
        add(lblphno);
                
        JLabel labelphno = new JLabel();
        labelphno.setBounds(690,150,150,25);
        add(labelphno);
        
        
         JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(500,200,150,25);
        add(lblemail);
                
        JLabel labelemail = new JLabel();
        labelemail.setBounds(690,200,150,25);
        add(labelemail);
        
        back= new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(350,350,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(140,400,600,200);
        add(Image);
        
        try
        {
            conn conn= new conn();
            String query = "select * from customer where username='"+username+"'";
            ResultSet rs=conn.s.executeQuery(query);
            while(rs.next())
            {
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelid_number.setText(rs.getString("id_number"));
                labelname.setText(rs.getString("name"));
                labelgender.setText(rs.getString("gender"));
                labelcountry.setText(rs.getString("country"));
                labeladdress.setText(rs.getString("address"));
                labelphno.setText(rs.getString("phno"));
                labelemail.setText(rs.getString("email"));
                
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
        new ViewCustomer("");
    }
    
}

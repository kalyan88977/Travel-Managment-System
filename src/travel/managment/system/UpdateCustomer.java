
package travel.managment.system;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.*;
import javax.swing.event.*;



public class UpdateCustomer extends JFrame implements ActionListener
{
JLabel labelusername,labelname;
    JComboBox comboid;
    JTextField tfid_number,tfaddress,tfcountry,tfemail,tfphno,tfid,tfgender;
    JRadioButton rmale,rfemale;
    JButton add,back;
    String username,name;
    
    UpdateCustomer(String username)
    {
        this.username=username;
        setBounds(350,85,900,600);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel text= new JLabel("UPDATE CUSTOMER DETAILS");
        text.setBounds(50,0,300,25);
        text.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(text);
        
        JLabel iblusername = new JLabel("Username");
        iblusername.setBounds(30,50,150,25);
        add(iblusername);
        
         labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        
        JLabel iblid = new JLabel("Id");
        iblid.setBounds(30,90,150,25);
        add(iblid);
        
         tfid = new JTextField();
        tfid.setBounds(220,90,150,25);
        add(tfid);
        
        
         JLabel iblid_number = new JLabel("Number");
        iblid_number.setBounds(30,130,150,25);
        add(iblid_number);
        
        tfid_number = new JTextField();
        tfid_number.setBounds(220,130,150,25);
        add(tfid_number);
        
        JLabel iblname = new JLabel("Name");
        iblname.setBounds(30,170,150,25);
        add(iblname);
        
         labelname = new JLabel();
        labelname.setBounds(220,170,150,25);
        add(labelname);
        
        
         JLabel iblgender = new JLabel("Gender");
        iblgender.setBounds(30,210,150,25);
        add(iblgender);
        
        
        tfgender = new JTextField();
        tfgender.setBounds(220,210,150,25);
        add(tfgender);
        
        JLabel iblcountry = new JLabel("Country");
        iblcountry.setBounds(30,250,150,25);
        add(iblcountry);
        
        tfcountry = new JTextField();
        tfcountry.setBounds(220,250,150,25);
        add(tfcountry);
        
        
        JLabel ibladdress = new JLabel("Address");
        ibladdress.setBounds(30,290,150,25);
        add(ibladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(220,290,150,25);
        add(tfaddress);
        
        JLabel iblphno = new JLabel("Phno");
        iblphno.setBounds(30,330,150,25);
        add(iblphno);
        
        tfphno = new JTextField();
        tfphno.setBounds(220,330,150,25);
        add(tfphno);
        
        
        JLabel iblemail = new JLabel("Email");
        iblemail.setBounds(30,370,150,25);
        add(iblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(220,370,150,25);
        add(tfemail);
        
        add = new JButton("Update");
        add.setBackground(Color.black);
        add.setForeground(Color.white);
        add.setBounds(70,430,100,25);
        add.addActionListener(this);
        add(add);
        
        
        back = new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(220,430,100,25);
        back.addActionListener(this);
        add(back);
        
        // ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        //Image i2 = i1.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        //ImageIcon i3 = new ImageIcon(i2);
        //JLabel image = new JLabel(i3);
        //image.setBounds(400,40,400,500);
       // add(image);
        
        try
        {
            conn c= new conn();
            ResultSet rs=c.s.executeQuery("select * from customer where username ='"+username+"'");
            while(rs.next())
            {
                labelusername.setText(rs.getString("username"));
                tfid.setText(rs.getString("id"));
                 tfid_number.setText(rs.getString("id_number"));
                 labelname.setText(rs.getString("name"));
                  tfgender.setText(rs.getString("gender"));
                   tfcountry.setText(rs.getString("country"));
                    tfaddress.setText(rs.getString("address"));
                     tfphno.setText(rs.getString("phno"));
                      tfemail.setText(rs.getString("email"));
                   
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
        if(ae.getSource()==add)
        {
            String username = labelusername.getText();
            String id= tfid.getText();
            String number = tfid_number.getText();
            String name = labelname.getText();
            String gender = tfgender.getText();
            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String phone = tfphno.getText();
            String email = tfemail.getText();
            
            try
            {
                conn c= new conn();
                String query =
               "update customer set username='"+username+"', id='"+id+"',id_number='"+number+"',name='"+name+"',gender='"+gender+"',country='"+country+"',address='"+address+"',phno='"+phone+"',email='"+email+"'";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Customer Details UPAdded Successfully");
                setVisible(false);
                
                
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            
        }
        else
        {
            setVisible(false);
        }
    }
  public static void main(String[] args)
  {
      new UpdateCustomer("");
  }
}
    


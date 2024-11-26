
package travel.managment.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class Addcustomer extends JFrame implements ActionListener
{
    JLabel labelusername,labelname;
    JComboBox comboid;
    JTextField tfnumber,tfaddress,tfcountry,tfemail,tfphno;
    JRadioButton rmale,rfemale;
    JButton add,back;
    String username;
    
    Addcustomer(String username)
    {
        this.username=username;
        setBounds(350,85,900,650);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel iblusername = new JLabel("Username");
        iblusername.setBounds(30,50,150,25);
        add(iblusername);
        
         labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        
        JLabel iblid = new JLabel("Id");
        iblid.setBounds(30,90,150,25);
        add(iblid);
        
        comboid = new JComboBox(new String[]{"Passport","Aadhar Card","Pan Card","Ration Card"});
        comboid.setBounds(220,90,150,25);
        comboid.setBackground(Color.white);
        add(comboid);
        
        
         JLabel iblnumber = new JLabel("Number");
        iblnumber.setBounds(30,130,150,25);
        add(iblnumber);
        
        tfnumber = new JTextField();
        tfnumber.setBounds(220,130,150,25);
        add(tfnumber);
        
        JLabel iblname = new JLabel("Name");
        iblname.setBounds(30,170,150,25);
        add(iblname);
        
         labelname = new JLabel();
        labelname.setBounds(220,170,150,25);
        add(labelname);
        
        
         JLabel iblgender = new JLabel("Gender");
        iblgender.setBounds(30,210,150,25);
        add(iblgender);
        
        rmale= new JRadioButton("Male");
        rmale.setBounds(220,210,70,25);
        rmale.setBackground(Color.white);
        add(rmale);
        
        rfemale= new JRadioButton("Female");
        rfemale.setBounds(300,210,70,25);
        rfemale.setBackground(Color.white);
        add(rfemale);
        
        ButtonGroup bg= new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);
        
        
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
        
        add = new JButton("add");
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
        
        
         ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400,40,600,500);
        add(image);
        try
        {
            conn c= new conn();
            ResultSet rs=c.s.executeQuery("select * from account where username ='"+username+"'");
            while(rs.next())
            {
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
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
            String id= (String)comboid.getSelectedItem();
            String number = tfnumber.getText();
            String name = labelname.getText();
            String gender = null;
            
            if(rmale.isSelected())
            {
                gender ="male";
            }
            else
            {
                gender="female";
            }
            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String phone = tfphno.getText();
            String email = tfemail.getText();
            
            try
            {
                conn c= new conn();
                String query =
               "insert into customer values('"+username+"','"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
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
      new Addcustomer("");
  }
}

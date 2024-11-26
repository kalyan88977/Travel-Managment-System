
package travel.managment.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class BookPackage extends JFrame implements ActionListener
{
    
    Choice cpackage;
    JTextField tfperson;
    String username;
    JLabel labelusername,labelid,labelnumber,labelphno,labeltotalprice,lblperson;
    JButton checkprice,bookpackage,back;
    
    BookPackage(String username)
    {
        this.username=username;
         setBounds(350,85,900,600);
         setLayout(null);
         getContentPane().setBackground(Color.white);
         
         
         JLabel text = new JLabel("BOOK PACKAGE");
         text.setBounds(100,10,200,30);
         text.setFont(new Font("Tahoma",Font.BOLD,20));
         add(text);
         
         JLabel  lblusername = new JLabel("Username");
           lblusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblusername.setBounds(40,70,100,20);
        add(lblusername);
                
         labelusername = new JLabel();
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        labelusername.setBounds(250,70,100,20);
        add(labelusername);
        
        
         JLabel lblpackage = new JLabel("Select Package");
         lblpackage.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblpackage.setBounds(40,110,150,20);
        add(lblpackage);
                
        cpackage = new Choice();
        cpackage.add("Gold Package");
        cpackage.add("Silver Package");
        cpackage.add("Bronze Package");
        cpackage.setBounds(250,110,200,20);
        add(cpackage);
        
        
          lblperson = new JLabel("Total Persons");
         lblperson.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblperson.setBounds(40,150,150,25);
        add(lblperson);
                
        tfperson = new JTextField();
        tfperson.setBounds(250,150,200,25);
        add(tfperson);
        
        JLabel lblid = new JLabel("Id");
        lblid.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblid.setBounds(40,190,150,20);
        add(lblid);
                
         labelid = new JLabel();
        labelid.setBounds(250,190,200,25);
        add(labelid);
        
        
         JLabel lblnumber = new JLabel("Number");
         lblnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblnumber.setBounds(40,230,150,25);
        add(lblnumber);
                
         labelnumber = new JLabel();
        labelnumber.setBounds(250,230,150,25);
        add(labelnumber);
        
        
          JLabel lblphno = new JLabel("Phno");
        lblphno.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblphno.setBounds(40,270,150,20);
        add(lblphno);
                
         labelphno = new JLabel();
        labelphno.setBounds(250,270,200,25);
        add(labelphno);
        
        
          JLabel lbltotalprice = new JLabel("Total Price");
         lbltotalprice.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbltotalprice.setBounds(40,310,150,25);
        add(lbltotalprice);
                
         labeltotalprice = new JLabel();
        labeltotalprice.setBounds(250,310,150,25);
        add(labeltotalprice);
        
         try
        {
            conn conn= new conn();
            String query = "select * from customer where username='"+username+"'";
            ResultSet rs=conn.s.executeQuery(query);
            while(rs.next())
            {
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("id_number"));
                labelphno.setText(rs.getString("phno"));
                
               
                
            }
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        
         checkprice = new JButton("Check Price");
         checkprice.setBackground(Color.black);
         checkprice.setForeground(Color.white);
         checkprice.setBounds(60,380,120,25);
         checkprice.addActionListener(this);
         add(checkprice);
         
         
         bookpackage = new JButton("Bookpackage");
         bookpackage.setBackground(Color.black);
         bookpackage.setForeground(Color.white);
         bookpackage.setBounds(200,380,120,25);
         bookpackage.addActionListener(this);
         add(bookpackage);
         
         back = new JButton("Back");
         back.setBackground(Color.black);
         back.setForeground(Color.white);
         back.setBounds(340,380,120,25);
         back.addActionListener(this);
         add(back);
         
         ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel i12  = new JLabel(i3);
        i12.setBounds(550,50,500,300);
        add(i12);
         
         setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==checkprice)
        {
            String pack =cpackage.getSelectedItem();
            int cost =0;
            if(pack.equals("Gold Package"))
            {
                cost +=12000;
            }
            else if(pack.equals("Silver Package"))
            {
                cost +=25000;
            }
            else
            {
                cost +=32000;
            }
            int persons = Integer.parseInt(tfperson.getText());
            cost *=persons;
            labeltotalprice .setText("Price :"+cost);
        }
        else if(ae.getSource()==bookpackage)
        {
            try
            {
                conn c= new conn();
                c.s.executeUpdate("insert into bookpackage values('"+labelusername.getText()+"','"+cpackage.getSelectedItem()+"','"+tfperson.getText()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphno.getText()+"','"+labeltotalprice.getText()+"')");
                
                JOptionPane.showMessageDialog(null, "Package Booked Successfully");
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
     new BookPackage("");  
    }
}


package travel.managment.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class BookHotels extends JFrame implements ActionListener
{
    
    Choice chotel,cac,cfood;
    JTextField tfperson,tfdays;
    
    JLabel lblusername,lblid,labelnumber,lblphno,lbltotalprice,labelusername,labelid,labelphno,labeltotalprice;
    JButton checkprice,bookpackage,back;
    
    BookHotels(String username)
    {
        
         setBounds(350,85,900,600);
         setLayout(null);
         getContentPane().setBackground(Color.white);
         
         
         JLabel text = new JLabel("BOOK Hotels");
         text.setBounds(100,10,200,30);
         text.setFont(new Font("Tahoma",Font.BOLD,20));
         add(text);
         
           lblusername = new JLabel("Username");
           lblusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblusername.setBounds(40,70,100,20);
        add(lblusername);
                
         labelusername = new JLabel();
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        labelusername.setBounds(250,70,100,20);
        add(labelusername);
        
        
         JLabel lblpackage = new JLabel("Select Hotels");
         lblpackage.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblpackage.setBounds(40,110,150,20);
        add(lblpackage);
                
        chotel = new Choice();
        chotel.setBounds(250,110,200,20);
        add(chotel);
        
        try
        {
            conn c= new conn();
            ResultSet rs=c.s.executeQuery("select * from hotel");
            while(rs.next())
            {
                chotel.add(rs.getString("name"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
         JLabel lblperson = new JLabel("Total Persons");
         lblperson.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblperson.setBounds(40,150,150,25);
        add(lblperson);
                
        tfperson = new JTextField("1");
        tfperson.setBounds(250,150,200,25);
        add(tfperson);
        
        JLabel lbldays = new JLabel("No Of Days");
         lbldays.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbldays.setBounds(40,190,150,25);
        add(lbldays);
                
        tfdays = new JTextField("1");
        tfdays.setBounds(250,190,200,25);
        add(tfdays);
        
         JLabel lblac = new JLabel("ac/Non Ac ");
         lblac.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblac.setBounds(40,230,150,25);
        add(lblac);
        
        
        cac = new Choice();
        cac.add("AC");
        cac.add("NON-AC");
        cac.setBounds(250,230,200,20);
        add(cac);
        
        JLabel lblfood = new JLabel("Food Included");
         lblfood.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblfood.setBounds(40,270,150,25);
        add(lblfood);
        
        
        cfood = new Choice();
        cfood.add("Yes");
        cfood.add("No");
        cfood.setBounds(250,270,200,20);
        add(cfood);
        
         lblid = new JLabel("Id");
        lblid.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblid.setBounds(40,310,150,20);
        add(lblid);
                
         labelid = new JLabel();
        labelid.setBounds(250,310,200,25);
        add(labelid);
        
        
         JLabel lblnumber = new JLabel("Number");
         lblnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblnumber.setBounds(40,350,150,25);
        add(lblnumber);
                
         labelnumber = new JLabel();
        labelnumber.setBounds(250,350,150,25);
        add(labelnumber);
        
        
          lblphno = new JLabel("Phno");
        lblphno.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblphno.setBounds(40,390,150,20);
        add(lblphno);
                
         labelphno = new JLabel();
        labelphno.setBounds(250,390,200,25);
        add(labelphno);
        
        
          lbltotalprice = new JLabel("Total Price");
         lbltotalprice.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbltotalprice.setBounds(40,430,150,25);
        add(lbltotalprice);
                
         labeltotalprice = new JLabel();
        labeltotalprice.setBounds(250,430,150,25);
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
         checkprice.setBounds(60,490,120,25);
         checkprice.addActionListener(this);
         add(checkprice);
         
         
         bookpackage = new JButton("Book Hotel");
         bookpackage.setBackground(Color.black);
         bookpackage.setForeground(Color.white);
         bookpackage.setBounds(200,490,120,25);
         bookpackage.addActionListener(this);
         add(bookpackage);
         
         back = new JButton("Back");
         back.setBackground(Color.black);
         back.setForeground(Color.white);
         back.setBounds(340,490,120,25);
         back.addActionListener(this);
         add(back);
         
         ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel i12  = new JLabel(i3);
        i12.setBounds(500,50,600,300);
        add(i12);
         
         setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==checkprice)
        {
            try
            {
                conn c= new conn();
            ResultSet rs= c.s.executeQuery("select * from hotel where name='"+chotel.getSelectedItem()+"'");
            while(rs.next())
            {
                int cost=Integer.parseInt(rs.getString("costperperson"));
                int food=Integer.parseInt(rs.getString("foodincluded"));
                int ac=Integer.parseInt(rs.getString("acroom"));
                
                int person= Integer.parseInt(tfperson.getText());
                int days= Integer.parseInt(tfdays.getText());
                
                String acselected = cac.getSelectedItem();
                String foodselected =cfood.getSelectedItem();
                
                if(person * days > 0)
                {
                   int total =0;
                   total += acselected.equals("AC") ? ac : 0;
                   total +=foodselected.equals("Yes") ? food : 0;
                   total += cost;
                   total = total*person*days;
                   labeltotalprice.setText("RS:"+total);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please Enter a Valid Number");
                }
                
                
            }
            
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==bookpackage)
        {
            try
            {
                conn c= new conn();
                c.s.executeUpdate("insert into bookhotel values('"+labelusername.getText()+"','"+chotel.getSelectedItem()+"','"+tfperson.getText()+"','"+tfdays.getText()+"','"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphno.getText()+"','"+labeltotalprice.getText()+"')");
                
                JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
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
     new BookHotels("");  
    }
}

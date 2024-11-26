package travel.managment.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Signup extends JFrame implements ActionListener
{
    JButton create,back;
    JTextField tfname,tfusername,tfpassword,tfanswer;
    Choice security;
    
    Signup()
    {
       setBounds(350,200,900,360);
       getContentPane().setBackground(Color.white);
       setLayout(null);
       
       JPanel p1= new JPanel();
       p1.setBackground(new Color(133,199,233));
       p1.setBounds(0,0,500,400);
       p1.setLayout(null);
       add(p1);
     
       JLabel lblusername = new JLabel("Username");
       lblusername.setFont(new Font("Tahoma",Font.BOLD,14));
       lblusername.setBounds(50,20,125,25);
       p1.add(lblusername);
       
        tfusername = new JTextField();
       tfusername.setBounds(150,20,180,25);
       tfusername.setBorder(BorderFactory.createEmptyBorder());
       p1.add(tfusername);
       
       
       JLabel lblname = new JLabel("Name");
       lblname.setFont(new Font("Tahoma",Font.BOLD,14));
       lblname.setBounds(50,60,125,25);
       p1.add(lblname);
       
       tfname = new JTextField();
       tfname.setBounds(150,60,180,25);
       tfname.setBorder(BorderFactory.createEmptyBorder());
       p1.add(tfname);
       
       
        JLabel lblpassword = new JLabel("Password");
       lblpassword.setFont(new Font("Tahoma",Font.BOLD,14));
       lblpassword.setBounds(50,100,125,25);
       p1.add(lblpassword);
       
        tfpassword = new JTextField();
       tfpassword.setBounds(150,100,180,25);
       tfpassword.setBorder(BorderFactory.createEmptyBorder());
       p1.add(tfpassword);
       
       
        JLabel lblsecurity = new JLabel("Security Question");
       lblsecurity.setFont(new Font("Tahoma",Font.BOLD,14));
       lblsecurity.setBounds(50,140,125,25);
       p1.add(lblsecurity);
       
        security = new Choice();
       security.add("Your School Name");
       security.add("Fav Sports");
       security.add("Fav Movie");
       security.add("Fav country");
       security.setBounds(180,140,150,25);
       p1.add(security);
       
       JLabel lblanswer = new JLabel("Answer");
       lblanswer.setFont(new Font("Tahoma",Font.BOLD,14));
       lblanswer.setBounds(50,180,125,25);
       p1.add(lblanswer);
       
        tfanswer = new JTextField();
       tfanswer.setBounds(150,180,180,25);
       tfanswer.setBorder(BorderFactory.createEmptyBorder());
       p1.add(tfanswer);
       
       create= new JButton("Create");
       create.setBackground(Color.WHITE);
       create.setForeground(new Color(133,193,233));
       create.setFont(new Font("Tahoma",Font.BOLD,14));
       create.setBounds(80,250,100,30);
       create.addActionListener(this);
       p1.add(create);
       
       
       back= new JButton("Back");
       back.setBackground(Color.WHITE);
       back.setForeground(new Color(133,193,233));
       back.setFont(new Font("Tahoma",Font.BOLD,14));
       back.setBounds(250,250,100,30);
       back.addActionListener(this);
       p1.add(back);
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2= i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(580,50,250,250);
        add(image);
       
       setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == create)
        {
            String username=tfusername.getText();
            String name=tfname.getText();
            String password=tfpassword.getText();
            String question = security.getSelectedItem();
            String answer=tfanswer.getText();
            
            String query="insert into account values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
            try
            {
                conn c=new conn();
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Account Created Successfully");
                setVisible(false);
                new login();
                
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == back)
         {
             setVisible(false);
             new login();
         }
    }
     
    public static void main(String[] args)
    {
        new Signup();
    }
}

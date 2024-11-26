
package travel.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener
{
    String username;
    JButton addpersonalDetails,viewpersonalDetails,updatepersonalDetails,checkpackage,bookpackage,viewpackage,viewhotels;
    JButton destinations,bookhotels,viewbookhotels,payments,calculators,notepad,about,deletepersonalDetails;
    Dashboard(String username)
    {
        this.username = username;
        
      //setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1= new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2= i1.getImage().getScaledInstance(70, 70,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
        
        
        JPanel p2= new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        
         addpersonalDetails= new JButton("Add Personal Details");
        addpersonalDetails.setBounds(0,0,300,50);
        addpersonalDetails.setBackground(new Color(0,0,102));
        addpersonalDetails.setForeground(Color.white);
        addpersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addpersonalDetails.setMargin(new Insets(0,0,0,60));
        addpersonalDetails.addActionListener(this);
        p2.add(addpersonalDetails);
        
          updatepersonalDetails= new JButton("Update Personal Details");
        updatepersonalDetails.setBounds(0,40,300,50);
        updatepersonalDetails.setBackground(new Color(0,0,102));
        updatepersonalDetails.setForeground(Color.white);
        updatepersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatepersonalDetails.setMargin(new Insets(0,0,0,30));
        updatepersonalDetails.addActionListener(this);
        p2.add(updatepersonalDetails);
        
        
          viewpersonalDetails= new JButton("View Details");
        viewpersonalDetails.setBounds(0,80,300,50);
        viewpersonalDetails.setBackground(new Color(0,0,102));
        viewpersonalDetails.setForeground(Color.white);
        viewpersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewpersonalDetails.setMargin(new Insets(0,0,0,130));
        viewpersonalDetails.addActionListener(this);
        p2.add(viewpersonalDetails);
        
        
        
         deletepersonalDetails= new JButton("Delete Personal Details");
        deletepersonalDetails.setBounds(0,120,300,50);
        deletepersonalDetails.setBackground(new Color(0,0,102));
        deletepersonalDetails.setForeground(Color.white);
        deletepersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletepersonalDetails.setMargin(new Insets(0,0,0,40));
        deletepersonalDetails.addActionListener(this);
        p2.add(deletepersonalDetails);
        
          checkpackage= new JButton("CheckPackage");
        checkpackage.setBounds(0,160,300,50);
        checkpackage.setBackground(new Color(0,0,102));
        checkpackage.setForeground(Color.white);
        checkpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkpackage.setMargin(new Insets(0,0,0,110));
        checkpackage.addActionListener(this);
        p2.add(checkpackage);
        
         bookpackage= new JButton("BookPackage");
        bookpackage.setBounds(0,200,300,50);
        bookpackage.setBackground(new Color(0,0,102));
        bookpackage.setForeground(Color.white);
        bookpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookpackage.setMargin(new Insets(0,0,0,120));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);
        
          viewpackage= new JButton("View Package");
        viewpackage.setBounds(0,240,300,50);
        viewpackage.setBackground(new Color(0,0,102));
        viewpackage.setForeground(Color.white);
        viewpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewpackage.setMargin(new Insets(0,0,0,120));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);
        
         viewhotels= new JButton("View Hotels");
        viewhotels.setBounds(0,280,300,50);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setForeground(Color.white);
        viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewhotels.setMargin(new Insets(0,0,0,130));
         viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
          bookhotels= new JButton("Book Hotels");
        bookhotels.setBounds(0,320,300,50);
        bookhotels.setBackground(new Color(0,0,102));
        bookhotels.setForeground(Color.white);
        bookhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookhotels.setMargin(new Insets(0,0,0,140));
        bookhotels.addActionListener(this);
        p2.add(bookhotels);
        
        
          viewbookhotels= new JButton("View Book Hotels");
        viewbookhotels.setBounds(0,360,300,50);
        viewbookhotels.setBackground(new Color(0,0,102));
        viewbookhotels.setForeground(Color.white);
        viewbookhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewbookhotels.setMargin(new Insets(0,0,0,70));
        viewbookhotels.addActionListener(this);
        p2.add(viewbookhotels);
        
        
         destinations= new JButton("Destinations");
        destinations.setBounds(0,400,300,50);
        destinations.setBackground(new Color(0,0,102));
        destinations.setForeground(Color.white);
        destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
        destinations.setMargin(new Insets(0,0,0,125));
         destinations.addActionListener(this);
        p2.add(destinations);
        
         payments= new JButton("Payments");
        payments.setBounds(0,440,300,50);
        payments.setBackground(new Color(0,0,102));
        payments.setForeground(Color.white);
        payments.setFont(new Font("Tahoma",Font.PLAIN,20));
        payments.setMargin(new Insets(0,0,0,155));
        payments.addActionListener(this);
        p2.add(payments);
        
         calculators= new JButton("Calculators");
        calculators.setBounds(0,480,300,50);
        calculators.setBackground(new Color(0,0,102));
        calculators.setForeground(Color.white);
        calculators.setFont(new Font("Tahoma",Font.PLAIN,20));
        calculators.setMargin(new Insets(0,0,0,145));
        calculators.addActionListener(this);
        p2.add(calculators);
        
        
         notepad= new JButton("Notepad");
        notepad.setBounds(0,520,300,50);
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground(Color.white);
        notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
        notepad.setMargin(new Insets(0,0,0,155));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        
          about= new JButton("About");
        about.setBounds(0,560,300,50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.white);
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,175));
        about.addActionListener(this);
        p2.add(about);
        
        
        ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        
        
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(400,70,1200,70);
        text.setForeground(Color.white);
        text.setFont(new Font("Raleway",Font.PLAIN,40));
        image.add(text);
        
      setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==addpersonalDetails)
        {
            new Addcustomer(username);
        }
        else if(ae.getSource()==viewpersonalDetails)
        {
            new ViewCustomer(username);
        }
        else if(ae.getSource()==updatepersonalDetails)
        {
            new UpdateCustomer(username);
        }
        else if(ae.getSource()==checkpackage)
        {
            new CheckPackage();
        }
        else if(ae.getSource()==bookpackage)
        {
            new BookPackage(username);
        }
        else if(ae.getSource()==viewpackage)
        {
            new Viewpackage(username);
        }
        else if(ae.getSource()==viewhotels)
        {
            new CheckHotels();
        }
        else if(ae.getSource()==destinations)
        {
            new Destinations();
        }
        else if(ae.getSource()==bookhotels)
        {
            new BookHotels(username);
        }
        else if(ae.getSource()==viewbookhotels)
        {
            new Viewbookedhotels(username);
        }
        else if(ae.getSource()==payments)
        {
            new Payments();
        }else if(ae.getSource()==calculators)
        {
           try
           {
               Runtime.getRuntime().exec("calc.exe");
           }
           catch(Exception e)
           {
               e.printStackTrace();
           }
        }
        else if(ae.getSource()==notepad)
        {
            try
            {
                Runtime.getRuntime().exec("notepad.exe");
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==about)
        {
            new About();
        }
        else
        {
            new Deletedetails(username);
        }
    }
    
    
  public static void main(String[] args)
  {
      new Dashboard("");
  }
}

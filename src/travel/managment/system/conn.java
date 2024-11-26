package travel.managment.system;
import java.sql.*;

public class conn 
{
    Connection c;
    Statement s;
    conn()
    {
        try
        {
           Class.forName("oracle.jdbc.driver.OracleDriver"); 
           c=DriverManager.getConnection
                       ("jdbc:oracle:thin:@localhost:1521/orcl","system", "Kalyan12345");
           s=c.createStatement();
           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

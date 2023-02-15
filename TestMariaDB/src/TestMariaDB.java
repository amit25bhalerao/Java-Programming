import java.sql.*;

public class TestMariaDB
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn = null;
            conn =  DriverManager.getConnection("jdbc:mysql://192.168.0.107/" +
                    "user=root&password= ");
            System.out.println("Connection Successful");
        } catch (SQLException e)
        {
            System.out.println("SQL Exception: "+ e.toString());
        }
        catch (ClassNotFoundException cE)
        {
            System.out.println("Class Not Found Exception: "+ cE.toString());
        }
        catch (Exception ex)
        {
            System.out.println("Exception: "+ ex.toString());
        }
    }
}

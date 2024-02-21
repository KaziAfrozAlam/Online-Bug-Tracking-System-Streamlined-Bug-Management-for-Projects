import java.sql.*;
import java.time.Year;
import java.util.Properties;

public class DBConnection<connection> {
    public static final String url = "jdbc:mysql://localhost:3306/bugtracker";
    public static String USERNAME = "root";
    public static String PASSWORD = "Asif@1982";

    public static void main(String[] args) throws SQLException {

    }
    public static Connection getConnection()throws SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, USERNAME,PASSWORD);
            return con;
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
}

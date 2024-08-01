
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCdemo {
    public static void main(String[] args) {
        String username="root";
        String password="";
        String url="jdbc:mysql://localhost:3306/javabatch2";
       try{ 
        Connection connnection=DriverManager.getConnection(url, username, password);
    System.out.println("db connected");}
    catch(SQLException e){
        throw new RuntimeException(e+"not connected");
    }
    }

}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestMySQL {
    public static void main(String[] args) throws Exception {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","root");

        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("SELECT * FROM sakila.actor;");
        while(rs.next())
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));
        con.close();
    }
}




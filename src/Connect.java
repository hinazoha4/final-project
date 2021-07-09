
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author hina,manan
 */
public class Connect {
    Connection con=null;
   
        public static Connection ConnectDB(){
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hp_mgmt_db", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT VERSION()");
            while (rs.next()) {
                return con;
            }
        } catch (ClassNotFoundException | SQLException ex) {
             System.out.println(ex.getMessage());
        }

        return null;    
    }
}

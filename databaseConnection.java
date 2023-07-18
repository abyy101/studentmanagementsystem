
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wambu
 */
public class databaseConnection {
    final static String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    final static String DB_URL="jdbc:mysql://localhost:3306/student";
    
    final static String USER="root";
    final static String PASS="";
    private static java.sql.Connection conn;
    
    
    public static Connection connection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");/*change to cj*/
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
            
            return (Connection) conn;
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        
    }
    
}

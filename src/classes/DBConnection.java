package classes;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {

    public Connection dbConn() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/i_and_a?autoReconnect=false&useSSL=false", "root", "");
            JOptionPane.showMessageDialog(null, "Database Connected");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Not Connected. Check the server");
        }
        return con;
    }

}


package shbpart2;

import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.DriverManager;

/**
 *
 * @author lenovo
 */
public class koneksi {
    public Connection Koneksi;
    public Statement State;
    public void KoneksiDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Koneksi = DriverManager.getConnection("jdbc:mysql://localhost/shb","root","");
            State = Koneksi.createStatement(); 
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi Gagal"+e.getMessage());
        }
    }

    

}

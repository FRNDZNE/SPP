/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Hafiz
 */
public class Koneksi {
    Boolean Status;
    Connection connect;
    Statement state;
    ResultSet result;

    public Koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Success to Load Driver");
            
            String url = "jdbc:mysql://localhost/spp";
            String user = "root";
            String password = "";
            connect = DriverManager.getConnection(url,user,password);
            
            state = connect.createStatement();
            
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to Connect");
        } catch (SQLException es)
        {
            System.out.println("Failed to Connect Database");
        }
    }
    
}

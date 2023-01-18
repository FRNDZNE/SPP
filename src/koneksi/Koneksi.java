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
    public DefaultTableModel model;
    public Boolean statusSimpan;
    public Connection conn;
    public Statement command;
    public ResultSet result;
    public void CreateKoneksi() {
        try {
            // Register
            Class.forName("com.mysql.jdbc.Driver");
//            JOptionPane.showMessageDialog(this, "Success for Driver");
            System.out.println("Driver Berhasil");
            
            //Create Connection
            String url = "jdbc:mysql://localhost/spp";
            String username = "root";
            String password = "";
            
            //Connection to DB
            conn = DriverManager.getConnection(url,username,password);
//            JOptionPane.showMessageDialog(this, "Database Sucessfull", "Information", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("DB Berhasil");
            
            //Create Statement
            command = conn.createStatement();
        } catch (ClassNotFoundException es) {
//            JOptionPane.showMessageDialog(this, "Failed to load driver");
                System.out.println("Driver Gagal");
        } catch (SQLException e){
//            JOptionPane.showMessageDialog(this, "Database Gagal", "Information", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("DB GAGAL");
        }
    }
    
}

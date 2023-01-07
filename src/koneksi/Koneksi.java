/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hafiz
 */
public interface Koneksi {
    public Connection connect;
    public Statement state;
    public ResultSet result;
    public void Koneksi() {
        try {
            // Load Driver
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil Load Driver");
            // Create Database Connection
            String url = "jdbc:mysql://localhost/spp";
            String username = "root";
            String password = "";
            
            //Create Connection
            connect = DriverManager.getConnection(url,username,password);
            System.out.println("Berhasil Connect ke Database");
        } catch (ClassNotFoundException e) {
            System.out.println("Gagal Load Driver");
        } catch (SQLException e){
            System.out.println("Gagal Load Database");
        }
    }
}

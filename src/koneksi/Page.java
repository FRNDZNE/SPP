/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import Pages.*;

/**
 *
 * @author Hafiz
 */
public class Page {
    public void halamanHome()
    {
        Login home = new Login();
        home.setVisible(true);
    }
    public void halamanDashboard()
    {
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
    }
    
}

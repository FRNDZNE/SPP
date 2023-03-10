/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import koneksi.*;

public class Spp extends javax.swing.JInternalFrame {

    Koneksi koneksi = new Koneksi();
    Page page = new Page();
    
    public Spp() {
        initComponents();
        koneksi.model = (DefaultTableModel) tableSpp.getModel();
        koneksi.CreateKoneksi();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        frmId = new javax.swing.JTextField();
        frmAngkatan = new javax.swing.JTextField();
        frmNominal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSpp = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(880, 470));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("No");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Angkatan");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Nominal");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        frmId.setBackground(new java.awt.Color(0, 51, 51));
        frmId.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(frmId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 160, -1));

        frmAngkatan.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(frmAngkatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 160, -1));

        frmNominal.setBackground(new java.awt.Color(0, 51, 51));
        frmNominal.setForeground(new java.awt.Color(255, 255, 255));
        frmNominal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmNominalActionPerformed(evt);
            }
        });
        getContentPane().add(frmNominal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 160, -1));

        tableSpp.setForeground(new java.awt.Color(0, 102, 102));
        tableSpp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No", "Angkatan", "Nominal"
            }
        ));
        tableSpp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSppMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSpp);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 410, 190));

        btnTambah.setBackground(new java.awt.Color(0, 51, 51));
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        btnSimpan.setForeground(new java.awt.Color(0, 102, 102));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 70, -1));

        btnEdit.setBackground(new java.awt.Color(0, 51, 51));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 70, -1));

        btnHapus.setForeground(new java.awt.Color(0, 102, 102));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 70, -1));

        btnBatal.setBackground(new java.awt.Color(0, 51, 51));
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        getContentPane().add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 70, -1));

        btnKembali.setForeground(new java.awt.Color(0, 102, 102));
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        setBounds(0, 0, 900, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void frmNominalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmNominalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frmNominalActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        saveData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        btnTambah.setEnabled(false);
        btnSimpan.setEnabled(true);
        btnEdit.setEnabled(false);
        btnHapus.setEnabled(false);
        btnBatal.setEnabled(true);
        frmId.setEnabled(false);
        frmAngkatan.setEnabled(true);
        frmNominal.setEnabled(true);
        koneksi.statusSimpan = false;
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        dispose();
        page.halamanDashboard();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        addData();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        resetForm();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void tableSppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSppMouseClicked
        // TODO add your handling code here:
        mouseClicked();
    }//GEN-LAST:event_tableSppMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        hapusData();
    }//GEN-LAST:event_btnHapusActionPerformed
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        // TODO add your handling code here:
        Awal();
    }  
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Spp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Spp().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JTextField frmAngkatan;
    private javax.swing.JTextField frmId;
    private javax.swing.JTextField frmNominal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSpp;
    // End of variables declaration//GEN-END:variables
    
    // My Function
    private void Awal()
    {
        btnTambah.setEnabled(true);
        btnSimpan.setEnabled(false);
        btnEdit.setEnabled(false);
        btnHapus.setEnabled(false);
        btnBatal.setEnabled(false);
        frmId.setEnabled(false);
        frmAngkatan.setEnabled(false);
        frmNominal.setEnabled(false);
        koneksi.statusSimpan = false;
        readData();
    }
    
    private void resetForm()
    {
        btnTambah.setEnabled(true);
        btnSimpan.setEnabled(false);
        btnEdit.setEnabled(false);
        btnHapus.setEnabled(false);
        btnBatal.setEnabled(false);
        frmId.setEnabled(false);
        frmAngkatan.setEnabled(false);
        frmNominal.setEnabled(false);
        frmId.setText(null);
        frmAngkatan.setText(null);
        frmNominal.setText(null);
        koneksi.statusSimpan = false;
    }
    
    private void readData()
    {
        try {
            koneksi.result = koneksi.command.executeQuery("select * from spp");
            koneksi.model.setRowCount(0);
            koneksi.model.fireTableDataChanged();
            while (koneksi.result.next()) {
                koneksi.model.addRow(new Object[]{
                    koneksi.result.getString(1),
                    koneksi.result.getString(2),
                    koneksi.result.getString(3)
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database Gagal","Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void addData()
    {
        frmId.setEnabled(true);
        frmAngkatan.setEnabled(true);
        frmNominal.setEnabled(true);
        btnSimpan.setEnabled(true);
        btnBatal.setEnabled(true);
        btnEdit.setEnabled(false);
        btnHapus.setEnabled(false);
        btnTambah.setEnabled(false);
        koneksi.statusSimpan = true;
    }
    
    private void mouseClicked()
    {
        btnTambah.setEnabled(false);
        btnSimpan.setEnabled(false);
        btnEdit.setEnabled(true);
        btnBatal.setEnabled(true);
        btnHapus.setEnabled(true);
        frmId.setText(tableSpp.getValueAt(tableSpp.getSelectedRow(),0).toString());
        frmAngkatan.setText(tableSpp.getValueAt(tableSpp.getSelectedRow(),1).toString());
        frmNominal.setText(tableSpp.getValueAt(tableSpp.getSelectedRow(),2).toString());
    }
    
    private void saveData()
    {
        if (frmId.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Masukkan Id", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if (frmAngkatan.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Masukkan Angkatan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if (frmNominal.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Masukkan Nominal", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (koneksi.statusSimpan == true) {
                try {
                    koneksi.command.executeUpdate("insert into spp values ('"
                    + frmId.getText() + "','"
                    + frmAngkatan.getText() + "','"
                    + frmNominal.getText() + "')");
                
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Gagal Insert" ,"Information", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                try {
                    koneksi.command.executeUpdate("update spp set tahun = " + frmAngkatan.getText() + ", nominal = " + frmNominal.getText() + " where id_spp = " + frmId.getText());
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Gagal Update" ,"Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            resetForm();
            readData();
        }
    }
    
    private void hapusData()
    {
        int answer = JOptionPane.showOptionDialog(null, "Delete this one ?", "Alert", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (answer == JOptionPane.YES_OPTION) {
            try {
                koneksi.command.executeUpdate("delete from spp where id_spp=" + frmId.getText());
                koneksi.model.removeRow(tableSpp.getSelectedRow());
                resetForm();
                readData();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Gagal Menghapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

/**
 *
 * @author User
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Login() {
        initComponents();
        //transparan colom
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        Pw = new javax.swing.JPasswordField();
        jBsimpan = new javax.swing.JButton();
        jBbatal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.lightGray));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setBackground(new java.awt.Color(0, 51, 51));
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.pink, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 207, 288, 38));

        Pw.setBackground(new java.awt.Color(0, 51, 51));
        Pw.setForeground(new java.awt.Color(255, 255, 255));
        Pw.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.pink, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));
        Pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PwActionPerformed(evt);
            }
        });
        jPanel1.add(Pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 285, 288, 35));

        jBsimpan.setBackground(new java.awt.Color(45, 116, 124));
        jBsimpan.setForeground(new java.awt.Color(255, 255, 255));
        jBsimpan.setText("Masuk");
        jBsimpan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jBsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsimpanActionPerformed(evt);
            }
        });
        jPanel1.add(jBsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 380, 78, 30));

        jBbatal.setBackground(new java.awt.Color(255, 87, 87));
        jBbatal.setForeground(new java.awt.Color(255, 255, 255));
        jBbatal.setText("Batal");
        jBbatal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jBbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbatalActionPerformed(evt);
            }
        });
        jPanel1.add(jBbatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 80, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/LOGO2.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 110, 80));

        jLabel3.setText("Masukkan Username dan Password Anda");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("LOGIN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 97, -1, -1));

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Username");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 182, -1, -1));

        jLabel6.setText("Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 350, 440));

        Exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("X");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, -1, -1));

        jLabel1.setBackground(new java.awt.Color(240, 220, 233));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/background2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 610));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        setSize(new java.awt.Dimension(1102, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PwActionPerformed

    private void jBbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbatalActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jBbatalActionPerformed

    private void jBsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsimpanActionPerformed
        String uusername = username.getText();
        String password = Pw.getText();
        
        if (uusername.contains("admin") && password.contains("polnep")) {
            username.setText(null);
            Pw.setText(null);
            dispose();
            Dashboard ds = new Dashboard();
            ds.setVisible(true);
        }
    }//GEN-LAST:event_jBsimpanActionPerformed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_ExitMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JPasswordField Pw;
    private javax.swing.JButton jBbatal;
    private javax.swing.JButton jBsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}

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
public class login_petugas extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login_petugas() {
        initComponents();
        //transparan colom
        username.setBackground(new java.awt.Color(0,0,0,1));
        Pw.setBackground(new java.awt.Color(0,0,0,1));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        Pw = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jBsimpan = new javax.swing.JButton();
        jBbatal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, -1, 20));

        username.setBorder(null);
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 310, 50));

        Pw.setBorder(null);
        Pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PwActionPerformed(evt);
            }
        });
        getContentPane().add(Pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 310, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jBsimpan.setBackground(new java.awt.Color(45, 116, 124));
        jBsimpan.setForeground(new java.awt.Color(255, 255, 255));
        jBsimpan.setText("Masuk");
        jBsimpan.setBorder(null);
        jBsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsimpanActionPerformed(evt);
            }
        });

        jBbatal.setBackground(new java.awt.Color(255, 87, 87));
        jBbatal.setForeground(new java.awt.Color(255, 255, 255));
        jBbatal.setText("Batal");
        jBbatal.setBorder(null);
        jBbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jBsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBbatal, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jBsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 610));

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
        
        if (uusername.contains("admin") && password.contains("admin")) {
            username.setText(null);
            Pw.setText(null);
            dispose();
            Dashboard ds = new Dashboard();
            ds.setVisible(true);
        }
    }//GEN-LAST:event_jBsimpanActionPerformed

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
            java.util.logging.Logger.getLogger(login_petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_petugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Pw;
    private javax.swing.JButton jBbatal;
    private javax.swing.JButton jBsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}

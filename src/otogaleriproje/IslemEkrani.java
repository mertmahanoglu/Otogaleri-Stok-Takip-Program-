/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otogaleriproje;

/**
 *
 * @author Mert
 */
public class IslemEkrani extends javax.swing.JFrame {

    
    /**
     * Creates new form IslemEkrani
     */
    public IslemEkrani() {
        initComponents();
        if (LoginScreen.SendUsername.contains("admin")) {
            btnAdminPanel.setVisible(true);
        }
        else
        {
        btnAdminPanel.setVisible(false);
        
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAracSatinAl = new javax.swing.JButton();
        btnAracKirala = new javax.swing.JButton();
        btnAracSat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAdminPanel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));
        getContentPane().setLayout(null);

        btnAracSatinAl.setText("Araç Satın Al");
        btnAracSatinAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAracSatinAlActionPerformed(evt);
            }
        });
        getContentPane().add(btnAracSatinAl);
        btnAracSatinAl.setBounds(50, 70, 132, 49);

        btnAracKirala.setText("Araç Kirala");
        btnAracKirala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAracKiralaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAracKirala);
        btnAracKirala.setBounds(530, 200, 137, 47);

        btnAracSat.setText("Araç Sat");
        btnAracSat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAracSatActionPerformed(evt);
            }
        });
        getContentPane().add(btnAracSat);
        btnAracSat.setBounds(530, 70, 132, 50);

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Yapmak İstediğiniz İşlemi Seçiniz :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 20, 160, 14);

        btnAdminPanel.setText("Admin Panel");
        btnAdminPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminPanelActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdminPanel);
        btnAdminPanel.setBounds(50, 180, 126, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otogaleriproje/deneme.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(430, 220, 120, 0);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otogaleriproje/6.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 60, 240, 100);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otogaleriproje/3.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(120, 100, 260, 160);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otogaleriproje/1.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(420, 130, 260, 160);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otogaleriproje/5.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(430, 60, 170, 74);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otogaleriproje/2.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(160, 270, 350, 220);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otogaleriproje/JAVA ARKA PLAN-1.jpg"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 0, 720, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAracSatinAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAracSatinAlActionPerformed
        MusteriEkrani ekran = new MusteriEkrani();
        this.setVisible(false);
        ekran.setVisible(true);
    }//GEN-LAST:event_btnAracSatinAlActionPerformed

    private void btnAracSatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAracSatActionPerformed
      SatmaEkrani ekran = new SatmaEkrani();
        this.setVisible(false);
        ekran.setVisible(true);
    }//GEN-LAST:event_btnAracSatActionPerformed

    private void btnAracKiralaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAracKiralaActionPerformed
        MusteriEkrani ekran = new MusteriEkrani();
        this.setVisible(false);
        ekran.setVisible(true);
    }//GEN-LAST:event_btnAracKiralaActionPerformed

    private void btnAdminPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminPanelActionPerformed
       AdminKontrol kontrol = new AdminKontrol();
       this.setVisible(false);
       kontrol.setVisible(true);
       
    }//GEN-LAST:event_btnAdminPanelActionPerformed

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
            java.util.logging.Logger.getLogger(IslemEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IslemEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IslemEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IslemEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IslemEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminPanel;
    private javax.swing.JButton btnAracKirala;
    private javax.swing.JButton btnAracSat;
    private javax.swing.JButton btnAracSatinAl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}

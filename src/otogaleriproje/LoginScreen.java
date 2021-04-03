/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otogaleriproje;

import javax.swing.JOptionPane;

/**
 *
 * @author Mert
 */
public class LoginScreen extends javax.swing.JFrame {

    /**
     * Creates new form LoginScreen
     */
    VeritabaniIslemleri islem = new VeritabaniIslemleri();
    Clock clock = new Clock();
    public static String SendUsername;
    
    public LoginScreen() {
        initComponents();
        clock.Clock(lblClock);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSignup = new javax.swing.JButton();
        txtfPassword = new javax.swing.JPasswordField();
        lblClock = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblKayit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tbUsername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1010, 755));
        getContentPane().setLayout(null);

        btnSignup.setText("Sign In");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignup);
        btnSignup.setBounds(750, 510, 113, 30);
        getContentPane().add(txtfPassword);
        txtfPassword.setBounds(690, 480, 257, 20);

        lblClock.setForeground(new java.awt.Color(51, 0, 0));
        getContentPane().add(lblClock);
        lblClock.setBounds(680, 610, 310, 30);

        jLabel3.setBackground(new java.awt.Color(51, 51, 0));
        jLabel3.setForeground(new java.awt.Color(51, 51, 0));
        jLabel3.setText("Sosyal Medya Hesapları");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 530, 160, 20);

        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Username :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(630, 450, 55, 14);

        lblKayit.setForeground(new java.awt.Color(240, 240, 240));
        lblKayit.setText("Kayıt Ol");
        lblKayit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKayitMouseClicked(evt);
            }
        });
        getContentPane().add(lblKayit);
        lblKayit.setBounds(840, 550, 60, 14);

        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Kayıtlı Değil Misiniz ? ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(718, 550, 120, 14);

        tbUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(tbUsername);
        tbUsername.setBounds(690, 450, 257, 20);

        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Password :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(630, 480, 53, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otogaleriproje/giris ekranı.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1010, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        String kullaniciAdi = tbUsername.getText();
        String parola = new String(txtfPassword.getPassword());
        SendUsername =tbUsername.getText();

        boolean girisBasarili =islem.girisYap(kullaniciAdi, parola);

        if (girisBasarili) {
            JOptionPane.showMessageDialog(this, "Giriş Başarılı");
            IslemEkrani home = new IslemEkrani();
           
            this.setVisible(false);
            home.setVisible(true);
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Giriş Başarısız");
        }
    }//GEN-LAST:event_btnSignupActionPerformed

    private void lblKayitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKayitMouseClicked
       KayitEkrani ekran = new KayitEkrani();
       this.setVisible(false);
       ekran.setVisible(true);
       
       
    }//GEN-LAST:event_lblKayitMouseClicked

    private void tbUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblKayit;
    private javax.swing.JTextField tbUsername;
    private javax.swing.JPasswordField txtfPassword;
    // End of variables declaration//GEN-END:variables
}

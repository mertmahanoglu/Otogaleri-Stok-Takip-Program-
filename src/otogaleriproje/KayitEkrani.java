/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otogaleriproje;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Mert
 */
public class KayitEkrani extends javax.swing.JFrame {
    
VeritabaniIslemleri islemler = new VeritabaniIslemleri();
    public KayitEkrani() {
        
        initComponents();
        btnSignup.setBackground(Color.red);
        btnSignup.setOpaque(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtfUsername = new javax.swing.JTextField();
        btnSignup = new javax.swing.JButton();
        tbPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(txtfUsername);
        txtfUsername.setBounds(170, 190, 200, 30);

        btnSignup.setBackground(Color.red);
        btnSignup.setText("Kayıt Ol");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignup);
        btnSignup.setBounds(130, 280, 250, 50);
        getContentPane().add(tbPassword);
        tbPassword.setBounds(170, 240, 200, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otogaleriproje/kayıtol1.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -20, 500, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed


        LoginScreen login = new LoginScreen();
        String kullaniciAdi = txtfUsername.getText();
        String parola = new String(tbPassword.getPassword());
        
        islemler.kullaniciEkle(kullaniciAdi, parola);
        
        JOptionPane.showMessageDialog(this, "Başarıyla Kayıt Edildi!");
        this.setVisible(false);
        login.setVisible(true);
        
    }//GEN-LAST:event_btnSignupActionPerformed

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
            java.util.logging.Logger.getLogger(KayitEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KayitEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KayitEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KayitEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KayitEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignup;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField tbPassword;
    private javax.swing.JTextField txtfUsername;
    // End of variables declaration//GEN-END:variables
}

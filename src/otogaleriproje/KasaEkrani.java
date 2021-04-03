/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otogaleriproje;

import static otogaleriproje.MusteriEkrani.tblArac;
import static otogaleriproje.MusteriEkrani.lblPersonel;
/**
 *
 * @author Mert
 */
public class KasaEkrani extends javax.swing.JFrame {

    VeritabaniIslemleri islemler = new VeritabaniIslemleri();
    public KasaEkrani() {
        initComponents();
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
        jLabel4 = new javax.swing.JLabel();
        txtfAd = new javax.swing.JTextField();
        txtfTC = new javax.swing.JTextField();
        txtfSoyad = new javax.swing.JTextField();
        txtFTelefon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnBilgi = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Ad :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(53, 106, 27, 19);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Soyad :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(53, 145, 50, 19);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("TC Kimlik No :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(53, 184, 92, 19);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Telefon No :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(53, 223, 82, 19);
        getContentPane().add(txtfAd);
        txtfAd.setBounds(178, 107, 155, 20);
        getContentPane().add(txtfTC);
        txtfTC.setBounds(178, 185, 155, 20);
        getContentPane().add(txtfSoyad);
        txtfSoyad.setBounds(178, 146, 155, 20);
        getContentPane().add(txtFTelefon);
        txtFTelefon.setBounds(178, 224, 155, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Kişisel Bilgileriniz :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(138, 36, 144, 22);

        btnBilgi.setText("Bilgilerimi Ekle");
        btnBilgi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBilgiActionPerformed(evt);
            }
        });
        getContentPane().add(btnBilgi);
        btnBilgi.setBounds(210, 310, 120, 58);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otogaleriproje/JAVA ARKA PLAN-2.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(3, -22, 500, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBilgiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBilgiActionPerformed
        
        
        int selectedRow = tblArac.getSelectedRow(); 
        String personel_Adi = lblPersonel.getText();
        String ad = txtfAd.getText();
        String soyad = txtfSoyad.getText();
        String musteriTC = txtfTC.getText();
        String telefon = txtFTelefon.getText();
        String seciliKS =tblArac.getValueAt(selectedRow, 5).toString();
        String seciliPlaka = String.valueOf(tblArac.getValueAt(selectedRow, 0));
        
        if (seciliKS.contains("S")) {
            seciliKS = "Satıldı";
        }
        else if (seciliKS.contains("K")) {
            
            seciliKS = "Kiralandı";
            
        }
        
         
         
           int seciliFiyat = (Integer.parseInt(tblArac.getValueAt(selectedRow,6).toString()));
          
           
        islemler.aracSatimGuncelle(seciliKS, seciliPlaka);
        islemler.InsertMusteri(ad,soyad,musteriTC,telefon);      
        islemler.InsertFatura(ad, musteriTC, seciliPlaka, personel_Adi, seciliFiyat, seciliKS);
        
        
        
        txtfAd.setText("");
        txtfSoyad.setText("");
        txtfTC.setText("");
        txtFTelefon.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_btnBilgiActionPerformed

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
            java.util.logging.Logger.getLogger(KasaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KasaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KasaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KasaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KasaEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnBilgi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JTextField txtFTelefon;
    public static javax.swing.JTextField txtfAd;
    public static javax.swing.JTextField txtfSoyad;
    public static javax.swing.JTextField txtfTC;
    // End of variables declaration//GEN-END:variables
}
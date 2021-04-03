
package otogaleriproje;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class AdminKontrol extends javax.swing.JFrame {
    DefaultTableModel model;
    Clock clock = new Clock();
    VeritabaniIslemleri islemler = new VeritabaniIslemleri();
    
    
      public void musteriGoruntule()
    {
        
        model.setRowCount(0);
        model.setColumnCount(0);
        model.addColumn("Müşteri ID");
        model.addColumn("Müşteri Adı");
        model.addColumn("Müşteri Soyadı");
        model.addColumn("Müşteri TC");
        model.addColumn("Müşteri Telefon No");
       
        ArrayList<MusteriBilgi> musteriler = new ArrayList<MusteriBilgi>();
        musteriler = islemler.musteriListele();
        
        if (musteriler!=null) {
            for(MusteriBilgi item : musteriler)
            {
             Object[] eklenecek = {item.getMusteri_id(),item.getMusteri_adi(),item.getMusteri_soyadi(),item.getMusteri_TC(),item.getMusteri_telNo()};
             model.addRow(eklenecek);
            }
        }
        
    } 
      
      
      public void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tblAdmin.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(ara));

    }
      
      
      public void personelGoruntule()
    {
        model.setRowCount(0);
        model.setColumnCount(0);
        model.addColumn("Personel ID");
        model.addColumn("Pozisyon");
        model.addColumn("Maaş");
        model.addColumn("Departman");
        model.addColumn("Adı");
        model.addColumn("Soyadı");
        model.addColumn("Galeri ID");
        model.addColumn("TC");
       
       
        ArrayList<PersonelBilgi> personeller = new ArrayList<PersonelBilgi>();
        personeller = islemler.personelListele();
        
        if (personeller!=null) {
            for(PersonelBilgi item : personeller)
            {
             Object[] eklenecek = {item.getPersonel_ID(),item.getPersonel_Maas(),item.getPersonel_Departman(),item.getPersonel_Adi(),item.getPersonel_Soyadi(),item.getPersonel_TC(),item.getPersonel_GalID(),item.getPersonel_Pozisyon()};
             model.addRow(eklenecek);
            }
        }
        
    } 
      
      
       public void aracGoruntule()
    {
        model.setRowCount(0);
        
        model.setColumnCount(0);
        model.addColumn("Plaka");
        model.addColumn("Marka");
        model.addColumn("Model");
        model.addColumn("Araç Tipi");
        model.addColumn("Yakıt Tipi");
        model.addColumn("Kiralık/Satılık");
        model.addColumn("Fiyat");
        model.addColumn("Motor Hacmi");
        ArrayList<AracBilgi> araclar = new ArrayList<AracBilgi>();
        araclar = islemler.aracListele();
        
        if (araclar!=null) {
            for(AracBilgi item : araclar)
            {
             Object[] eklenecek = {item.getArac_Plaka(),item.getArac_Marka(),item.getArac_Model(),item.getArac_Tipi(),item.getArac_YakitTip(),item.getArac_KiraSat(),item.getArac_Fiyat(),item.getArac_MotorHacmi()};
             model.addRow(eklenecek);
            }
        }
        
    } 
       
       
       public void galeriGoruntule()
    {
        model.setRowCount(0);
        
        model.setColumnCount(0);
        model.addColumn("Galeri ID");
        model.addColumn("Galeri Adı");
        model.addColumn("Personel Sayısı");
        model.addColumn("Telefon Numarası");
        model.addColumn("Araç Sayısı");
      
        ArrayList<GaleriBilgi> galeriler = new ArrayList<GaleriBilgi>();
        galeriler = islemler.galeriListele();
        
        if (galeriler!=null) {
            for(GaleriBilgi item : galeriler)
            {
             Object[] eklenecek = {item.getGaleri_id(),item.getGaleri_adi(),item.getGaleri_personelSay(),item.getGaleri_telNo(),item.getGaleri_AracSay()};
             model.addRow(eklenecek);
            }
        }
        
    } 
       
      
    
    public AdminKontrol() {
        initComponents();
         clock.Clock(lblClock);
          model = (DefaultTableModel)tblAdmin.getModel();
         
    }
    
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdmin = new javax.swing.JTable();
        cmbAdmin = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnListele = new javax.swing.JButton();
        btnFaturaListele = new javax.swing.JButton();
        lblClock = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfSorgu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tblAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plaka", "Marka", "Model", "null", "null", "null", "null", "null"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAdmin.getTableHeader().setReorderingAllowed(false);
        tblAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAdmin);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(291, 11, 784, 402);

        cmbAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Müşteri", "Araç", "Personel", "Galeri" }));
        getContentPane().add(cmbAdmin);
        cmbAdmin.setBounds(31, 68, 242, 20);

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Görüntülemek İstediğiniz Tabloyu Seçiniz :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(31, 36, 200, 14);

        btnListele.setText("Listele");
        btnListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListeleActionPerformed(evt);
            }
        });
        getContentPane().add(btnListele);
        btnListele.setBounds(31, 106, 137, 45);

        btnFaturaListele.setText("Fatura Listele");
        btnFaturaListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFaturaListeleActionPerformed(evt);
            }
        });
        getContentPane().add(btnFaturaListele);
        btnFaturaListele.setBounds(31, 169, 137, 45);

        lblClock.setText("jLabel2");
        getContentPane().add(lblClock);
        lblClock.setBounds(930, 606, 34, 14);

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Sorgulamak İstediğiniz Verileri Giriniz :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(31, 232, 179, 14);

        txfSorgu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfSorguKeyReleased(evt);
            }
        });
        getContentPane().add(txfSorgu);
        txfSorgu.setBounds(31, 257, 179, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otogaleriproje/JAVA ARKA PLAN-2.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(600, 0, 500, 650);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otogaleriproje/JAVA ARKA PLAN-2.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 490, 650);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otogaleriproje/JAVA ARKA PLAN-2.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(310, 0, 500, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdminMouseClicked
     
      
    }//GEN-LAST:event_tblAdminMouseClicked

    private void btnListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListeleActionPerformed
      int secim =  cmbAdmin.getSelectedIndex();
      
        if (secim==0) {
            
         musteriGoruntule();
        
            
        }
        else if (secim==1) {
          aracGoruntule();
          
        }
        else if (secim==2) {
           
            personelGoruntule();
           
        }
        else if (secim==3) {
          galeriGoruntule();
          
        }
        
    }//GEN-LAST:event_btnListeleActionPerformed

    private void btnFaturaListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFaturaListeleActionPerformed
        FaturaEkrani ekran = new FaturaEkrani();
        
        ekran.setVisible(true);
          
    }//GEN-LAST:event_btnFaturaListeleActionPerformed

    private void txfSorguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfSorguKeyReleased
        String ara = txfSorgu.getText();
        dinamikAra(ara);
    }//GEN-LAST:event_txfSorguKeyReleased

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminKontrol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFaturaListele;
    private javax.swing.JButton btnListele;
    private javax.swing.JComboBox<String> cmbAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JTable tblAdmin;
    private javax.swing.JTextField txfSorgu;
    // End of variables declaration//GEN-END:variables
}

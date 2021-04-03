
package otogaleriproje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;





public class VeritabaniIslemleri {
    private Baglanti connection = new Baglanti();
     private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
       public void kullaniciEkle(String kullaniciadi,String parola)
    {
        
        String url = "jdbc:mysql://" + connection.host + ":" + connection.port + "/" + connection.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        try {
            con=DriverManager.getConnection(url,connection.kullanici_adi,connection.parola); 
            System.out.println("Connected..");
        } catch (SQLException e) {
            System.out.println("Connection fail.."+e);
        }
        String sorgu = "Insert into kullanicilar (username,user_pwd) VALUES(?,?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, kullaniciadi);
            preparedStatement.setString(2, parola);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
       
       
       public void aracSatimGuncelle(String satilikMi,String plaka)
    {
   
    String url = "jdbc:mysql://" + connection.host + ":" + connection.port + "/" + connection.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        try {
            con=DriverManager.getConnection(url,connection.kullanici_adi,connection.parola); 
            System.out.println("Connected..");
        } catch (SQLException e) {
            System.out.println("Connection fail.."+e);
        }
         String sorgu = "Update Arac set Arac_KiraSat=? where Arac_Plaka ='"+plaka+"'";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, satilikMi);
            
               
               preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
       
        
       public void aracKiraGuncelle(String satilikMi,String plaka)
    {
   
    String url = "jdbc:mysql://" + connection.host + ":" + connection.port + "/" + connection.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        try {
            con=DriverManager.getConnection(url,connection.kullanici_adi,connection.parola); 
            System.out.println("Connected..");
        } catch (SQLException e) {
            System.out.println("Connection fail.."+e);
        }
         String sorgu = "Update Arac set Arac_KiraSat=? where Arac_Plaka ='"+plaka+"'";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, satilikMi);
            
               
               preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public boolean girisYap(String kullaniciAdi,String parola)
    {
        
        String url = "jdbc:mysql://" + connection.host + ":" + connection.port + "/" + connection.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        try {
            con=DriverManager.getConnection(url,connection.kullanici_adi,connection.parola); 
            System.out.println("Connected..");
        } catch (SQLException e) {
            System.out.println("Connection fail.."+e);
        }
    String sorgu = "Select * from kullanici where username=? and user_pwd =? ";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, kullaniciAdi);
            preparedStatement.setString(2, parola);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
   
    public void InsertArac(String arac_plaka_Tf,String arac_marka_tf,String arac_model_tf,String arac_aracTipi_tf,String arac_yakitTip_tf,String arac_ks_tf,int arac_fiyat_tf,String arac_motorHacmi_tf,int satildiMi){
        String url = "jdbc:mysql://" + connection.host + ":" + connection.port + "/" + connection.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        try {
            con=DriverManager.getConnection(url,connection.kullanici_adi,connection.parola); 
            System.out.println("Connected..");
        } catch (SQLException e) {
            System.out.println("Connection fail.."+e);
        }
        String sorgu = "Insert Into Arac (Arac_Plaka, Arac_Marka, Arac_Model, Arac_tipi, Arac_YakitTip, Arac_KiraSat, Arac_Fiyat, Arac_MotorHacmi,Satildi_Mi) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, arac_plaka_Tf);
            preparedStatement.setString(2, arac_marka_tf);
            preparedStatement.setString(3, arac_model_tf);
            preparedStatement.setString(4, arac_aracTipi_tf);
            preparedStatement.setString(5, arac_yakitTip_tf);
            preparedStatement.setString(6, arac_ks_tf);
            preparedStatement.setInt(7,arac_fiyat_tf);
            preparedStatement.setString(8, arac_motorHacmi_tf);
            preparedStatement.setInt(9, satildiMi);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("sıkıntı" + ex);
        }
    }
    
    
      public void InsertPersonel(String per_maas_tf,String per_departman_tf, String per_adi_tf,String per_soyadi_tf,String per_tc_tf,int per_galID_tf1,String per_pozisyon_tf1){  //Database connection information.
        String url = "jdbc:mysql://" + Baglanti.host + ":" + Baglanti.port + "/" + Baglanti.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        try {
            con=DriverManager.getConnection(url,Baglanti.kullanici_adi,Baglanti.parola); 
            System.out.println("Connected..");
        } catch (SQLException e) {
            System.out.println("Connection fail.."+e);
        }
        String sorgu = "Insert Into Personel (Personel_Maas,Personel_Departman, Personel_Adi, Personel_Soyadi, Personel_TC, Personel_GalID, Personel_Pozisyon) VALUES (?,?,?,?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);//3 degisken daha ekle
            preparedStatement.setString(1, per_maas_tf);
            preparedStatement.setString(2, per_departman_tf);
            preparedStatement.setString(3, per_adi_tf);
            preparedStatement.setString(4, per_soyadi_tf);
            preparedStatement.setString(5, per_tc_tf);
            preparedStatement.setInt(6, per_galID_tf1);
            preparedStatement.setString(7, per_pozisyon_tf1);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("sıkıntı" + ex);
        }
    }
    
      
       public void InsertFatura(String fatura_alici_tf,String Fatura_Alici_TC,String fatura_plaka_tf,String Fatura_Personel,int fatura_fiyat_tf,String Fatura_KS){
        String url = "jdbc:mysql://" + Baglanti.host + ":" + Baglanti.port + "/" + Baglanti.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        try {
            con=DriverManager.getConnection(url,Baglanti.kullanici_adi,Baglanti.parola); 
            System.out.println("Connected..");
        } catch (SQLException e) {
            System.out.println("Connection fail.."+e);
        }
        String sorgu = "Insert Into Fatura (Fatura_Alici,Fatura_Alici_TC, Fatura_Plaka, Fatura_Personel, Fatura_Fiyat,Fatura_KS) VALUES (?,?,?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, fatura_alici_tf);
            preparedStatement.setString(2, Fatura_Alici_TC);
            preparedStatement.setString(3,fatura_plaka_tf);
            preparedStatement.setString(4,Fatura_Personel);
            preparedStatement.setInt(5,fatura_fiyat_tf);
            preparedStatement.setString(6,Fatura_KS);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("sıkıntı" + ex);
        }
    }
       
       
       
        public void InsertGaleri(String gal_adi_tf1,int gal_perSay_tf1,String gal_telNo_tf1,int gal_aracSay_tf1){
        String url = "jdbc:mysql://" + Baglanti.host + ":" + Baglanti.port + "/" + Baglanti.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        try {
            con=DriverManager.getConnection(url,Baglanti.kullanici_adi,Baglanti.parola); 
            System.out.println("Connected..");
        } catch (SQLException e) {
            System.out.println("Connection fail.."+e);
        }
        String sorgu = "Insert Into Galeri (Galeri_Adi, Galeri_PersonelSay, Galeri_TelNo, Galeri_AracSay) VALUES (?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, gal_adi_tf1);
            preparedStatement.setInt(2,gal_perSay_tf1);
            preparedStatement.setString(3, gal_telNo_tf1);
            preparedStatement.setInt(4, gal_aracSay_tf1);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("sıkıntı" + ex);
        }
    }
    
        
          public void InsertMusteri(String Musteri_Adi,String Musteri_Soyadi,String Musteri_TC,String Musteri_Telno){
        String url = "jdbc:mysql://" + Baglanti.host + ":" + Baglanti.port + "/" + Baglanti.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        try {
            con=DriverManager.getConnection(url,Baglanti.kullanici_adi,Baglanti.parola); 
            System.out.println("Connected..");
        } catch (SQLException e) {
            System.out.println("Connection fail.."+e);
        }
        String sorgu = "Insert Into Musteri (Musteri_Adi, Musteri_Soyadi, Musteri_TC, Musteri_TelNo) VALUES (?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, Musteri_Adi);
            preparedStatement.setString(2,Musteri_Soyadi);
            preparedStatement.setString(3, Musteri_TC);
            preparedStatement.setString(4, Musteri_Telno);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("sıkıntı" + ex);
        }
    }
     
       
       public void kayitSil(int id)
     {
     String sorgu = "Delete from aractablosu where id=?"; //Sonradan değiştirilecek
        try {
            preparedStatement = con.prepareStatement(sorgu);
             preparedStatement.setInt(1, id);
             preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    
     }
       
        public ArrayList<MusteriBilgi>musteriListele()
    {
        
        
        String url = "jdbc:mysql://" + connection.host + ":" + connection.port + "/" + connection.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        try {
            con=DriverManager.getConnection(url,connection.kullanici_adi,connection.parola); 
            System.out.println("Connected..");
        } catch (SQLException e) {
            System.out.println("Connection fail.."+e);
        }
    ArrayList<MusteriBilgi> cikti = new ArrayList<>();
    
    
        try {
            statement = con.createStatement();
            String sorgu = "Select * from Musteri";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            
            while (rs.next()) { 
                
                int musteriId = rs.getInt("Musteri_ID");
                String musteriAdi = rs.getString("Musteri_Adi");
                String musteriSoyadi = rs.getString("Musteri_Soyadi");
                String musteriTC = rs.getString("Musteri_TC");
                String musteriTelNo = rs.getString("Musteri_TelNo");
                
                
                cikti.add(new MusteriBilgi(musteriId,musteriAdi, musteriSoyadi, musteriTC, musteriTelNo));
               
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            
            return  null;
        }
    
    }
       
    
           public ArrayList<AracBilgi>aracListele()
    {
        {
        
        
        String url = "jdbc:mysql://" + connection.host + ":" + connection.port + "/" + connection.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        try {
            con=DriverManager.getConnection(url,connection.kullanici_adi,connection.parola); 
            System.out.println("Connected..");
        } catch (SQLException e) {
            System.out.println("Connection fail.."+e);
        }
    ArrayList<AracBilgi> cikti = new ArrayList<>();
    
    
        try {
            statement = con.createStatement();
            String sorgu = "Select * from Arac";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            
            while (rs.next()) { 
                
                String Arac_Plaka = rs.getString("Arac_Plaka");
                String Arac_Marka = rs.getString("Arac_Marka");
                String Arac_Model = rs.getString("Arac_Model");
                String Arac_tipi = rs.getString("Arac_tipi");
                String Arac_YakitTip = rs.getString("Arac_YakitTip");
                String Arac_KiraSat = rs.getString("Arac_KiraSat");
                String Arac_Fiyat = rs.getString("Arac_Fiyat");
                String Arac_MotorHacmi = rs.getString("Arac_MotorHacmi");
                
                
                
                cikti.add(new AracBilgi(Arac_Plaka,Arac_Marka, Arac_Model, Arac_tipi, Arac_YakitTip,Arac_KiraSat,Arac_Fiyat,Arac_MotorHacmi));
               
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            
            return  null;
        }
    
    }
    }
       
           
           
           
               public ArrayList<AracBilgi>aracFiltrele(String marka,String aracTipi,String yakitTip,String alimTip,String minMHacmi,String maxMHacmi,String minFiyat,String maxFiyat)
    {
        {
        
        
      {
        
        
        String url = "jdbc:mysql://" + connection.host + ":" + connection.port + "/" + connection.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        try {
            con=DriverManager.getConnection(url,connection.kullanici_adi,connection.parola); 
            System.out.println("Connected..");
        } catch (SQLException e) {
            System.out.println("Connection fail.."+e);
        }
    ArrayList<AracBilgi> cikti = new ArrayList<>();
    
    
        try {
            statement = con.createStatement();
            String sorgu = "Select * from Arac where Arac_Marka='"+marka+"' and Arac_Tipi='"+aracTipi+"' and Arac_YakitTip='"+yakitTip+"'"+ " and Arac_KiraSat ='"+alimTip+"' and Arac_Fiyat BETWEEN '"+minFiyat+"' AND '"+maxFiyat+"' and  Arac_MotorHacmi BETWEEN '"+minMHacmi+"' AND '"+maxMHacmi+"'";
                    
            
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            
            while (rs.next()) { 
                
                String Arac_Plaka = rs.getString("Arac_Plaka");
                String Arac_Marka = rs.getString("Arac_Marka");
                String Arac_Model = rs.getString("Arac_Model");
                String Arac_tipi = rs.getString("Arac_Tipi");
                String Arac_YakitTip = rs.getString("Arac_YakitTip");
                String Arac_KiraSat = rs.getString("Arac_KiraSat");
                String Arac_Fiyat = rs.getString("Arac_Fiyat");
                String Arac_MotorHacmi = rs.getString("Arac_MotorHacmi");
                
                
                
                cikti.add(new AracBilgi(Arac_Plaka,Arac_Marka, Arac_Model, Arac_tipi, Arac_YakitTip,Arac_KiraSat,Arac_Fiyat,Arac_MotorHacmi));
               
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            
            return  null;
        }
    
    }
    }
    }
           
           
           
            public ArrayList<PersonelBilgi>personelListele()
    {
        
        
        String url = "jdbc:mysql://" + connection.host + ":" + connection.port + "/" + connection.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        try {
            con=DriverManager.getConnection(url,connection.kullanici_adi,connection.parola); 
            System.out.println("Connected..");
        } catch (SQLException e) {
            System.out.println("Connection fail.."+e);
        }
    ArrayList<PersonelBilgi> cikti = new ArrayList<>();
    
    
        try {
            statement = con.createStatement();
            String sorgu = "Select * from Personel";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            
            while (rs.next()) { 
                int personelID = rs.getInt("Personel_ID");
                String Personel_Maas = rs.getString("Personel_Maas");
                String Personel_Departman = rs.getString("Personel_Departman");
                String Personel_Adi = rs.getString("Personel_Adi");
                String Personel_Soyadi = rs.getString("Personel_Soyadi");
                String Personel_TC = rs.getString("Personel_TC");
                 int Personel_GalID = rs.getInt("Personel_GalID");
                String Personel_Pozisyon = rs.getString("Personel_Pozisyon");
                
                
                
                cikti.add(new PersonelBilgi(personelID,Personel_Maas,Personel_Departman, Personel_Adi,Personel_Soyadi,Personel_GalID,Personel_TC,Personel_Pozisyon));
               
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            
            return  null;
        }
    
    }
            
             Random r = new Random();
            
           
                
               public ArrayList<PersonelBilgi>personelListele(int id)
    {
        
         id = r.nextInt(34);
            if (id==0)
                id = r.nextInt(34);
                
        String url = "jdbc:mysql://" + connection.host + ":" + connection.port + "/" + connection.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        try {
            con=DriverManager.getConnection(url,connection.kullanici_adi,connection.parola); 
            System.out.println("Connected..");
        } catch (SQLException e) {
            System.out.println("Connection fail.."+e);
        }
    ArrayList<PersonelBilgi> cikti = new ArrayList<>();
    
    
        try {
            statement = con.createStatement();
            String sorgu = "Select Personel_Adi from Personel where Personel_ID='"+id+"'";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            
            while (rs.next()) { 
              
                String Personel_Adi = rs.getString("Personel_Adi");
                
                
                
                
                cikti.add(new PersonelBilgi(Personel_Adi));
               
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            
            return  null;
        }
    
    }
            
            
            
            
            
            
            
  
          public ArrayList<GaleriBilgi>galeriListele()
    {
        
        
        String url = "jdbc:mysql://" + connection.host + ":" + connection.port + "/" + connection.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        try {
            con=DriverManager.getConnection(url,connection.kullanici_adi,connection.parola); 
            System.out.println("Connected..");
        } catch (SQLException e) {
            System.out.println("Connection fail.."+e);
        }
    ArrayList<GaleriBilgi> cikti = new ArrayList<>();
    
    
        try {
            statement = con.createStatement();
            String sorgu = "Select * from Galeri";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            
            while (rs.next()) { 
                int galeri_ID = rs.getInt("Galeri_ID");
                String Galeri_Adi = rs.getString("Galeri_Adi");
                int Galeri_PersonelSay = rs.getInt("Galeri_PersonelSay");
                String Galeri_TelNo = rs.getString("Galeri_TelNo");
                int Galeri_AracSay = rs.getInt("Galeri_AracSay");
                
                
                
                
                cikti.add(new GaleriBilgi(galeri_ID,Galeri_Adi,Galeri_PersonelSay, Galeri_TelNo,Galeri_AracSay));
               
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            
            return  null;
        }
    
    }
        
      public ArrayList<FaturaBilgi>faturaListele()
    {
        
        
        String url = "jdbc:mysql://" + connection.host + ":" + connection.port + "/" + connection.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        try {
            con=DriverManager.getConnection(url,connection.kullanici_adi,connection.parola); 
            System.out.println("Connected..");
        } catch (SQLException e) {
            System.out.println("Connection fail.."+e);
        }
    ArrayList<FaturaBilgi> cikti = new ArrayList<>();
    
    
        try {
            statement = con.createStatement();
            String sorgu = "Select * from Fatura";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            
            while (rs.next()) { 
                int fatura_ID = rs.getInt("Fatura_No");
                String Fatura_Alici = rs.getString("Fatura_Alici");
                String Fatura_Alici_TC = rs.getString("Fatura_Alici_TC");

                String Fatura_Plaka = rs.getString("Fatura_Plaka");
                String Fatura_Personel = rs.getString("Fatura_Personel");
                int Fatura_Fiyat = rs.getInt("Fatura_Fiyat");
                String Fatura_KS = rs.getString("Fatura_KS");
                
                
                
                
                cikti.add(new FaturaBilgi(fatura_ID,Fatura_Alici,Fatura_Alici_TC,Fatura_Plaka, Fatura_Personel,Fatura_Fiyat,Fatura_KS));
               
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            
            return  null;
        }
    
    }    
        
         public void faturaGuncelle(int Fatura_No,String Fatura_Alici,String Fatura_Plaka,int Fatura_galID,int Fatura_Fiyat,int Fatura_PersID)
    {
    String sorgu = "Update aractablosu set Fatura_Alici=?, Fatura_Plaka=?, Fatura_galID=?, Fatura_Fiyat=?,Fatura_PersID=? where Fatura_No=?";
    
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
             preparedStatement.setString(1, Fatura_Alici);
              preparedStatement.setString(2, Fatura_Plaka);
               preparedStatement.setInt(3, Fatura_galID);
               preparedStatement.setInt(4, Fatura_Fiyat);
               preparedStatement.setInt(5, Fatura_PersID);
               preparedStatement.setInt(6, Fatura_No);
               
               preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        
        
        
       
       public void DirectQuery(){
        String url = "jdbc:mysql://" + Baglanti.host + ":" + Baglanti.port + "/" + Baglanti.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        try {
            con=DriverManager.getConnection(url,Baglanti.kullanici_adi,Baglanti.parola); 
            System.out.println("Connected..");
        } catch (SQLException e) {
            System.out.println("Connection fail.."+e);
        }
        
    }
       
       public static void main(String[] args) {
           VeritabaniIslemleri islem = new VeritabaniIslemleri();
           islem.DirectQuery();
        
    }
       
    }  



package otogaleriproje;

public class PersonelBilgi {
    
    
   private  int Personel_ID;
   private  String  Personel_Departman;
   private  String    Personel_Adi ;
   private  String   Personel_Soyadi;
   private  String  Personel_TC;
   private  int Personel_GalID;
   private  String Personel_Pozisyon;
   private  String Personel_Maas;

    public PersonelBilgi(String Personel_Adi) {
        this.Personel_Adi = Personel_Adi;
    }

    public PersonelBilgi(int Personel_ID, String Personel_Departman, String Personel_Adi, String Personel_Soyadi, String Personel_TC, int Personel_GalID, String Personel_Pozisyon, String Personel_Maas) {
        this.Personel_ID = Personel_ID;
        this.Personel_Departman = Personel_Departman;
        this.Personel_Adi = Personel_Adi;
        this.Personel_Soyadi = Personel_Soyadi;
        this.Personel_TC = Personel_TC;
        this.Personel_GalID = Personel_GalID;
        this.Personel_Pozisyon = Personel_Pozisyon;
        this.Personel_Maas = Personel_Maas;
    }

    public int getPersonel_ID() {
        return Personel_ID;
    }

    public void setPersonel_ID(int Personel_ID) {
        this.Personel_ID = Personel_ID;
    }

    public String getPersonel_Departman() {
        return Personel_Departman;
    }

    public void setPersonel_Departman(String Personel_Departman) {
        this.Personel_Departman = Personel_Departman;
    }

    public String getPersonel_Adi() {
        return Personel_Adi;
    }

    public void setPersonel_Adi(String Personel_Adi) {
        this.Personel_Adi = Personel_Adi;
    }

    public String getPersonel_Soyadi() {
        return Personel_Soyadi;
    }

    public void setPersonel_Soyadi(String Personel_Soyadi) {
        this.Personel_Soyadi = Personel_Soyadi;
    }

    public String getPersonel_TC() {
        return Personel_TC;
    }

    public void setPersonel_TC(String Personel_TC) {
        this.Personel_TC = Personel_TC;
    }

    public int getPersonel_GalID() {
        return Personel_GalID;
    }

    public void setPersonel_GalID(int Personel_GalID) {
        this.Personel_GalID = Personel_GalID;
    }

    public String getPersonel_Pozisyon() {
        return Personel_Pozisyon;
    }

    public void setPersonel_Pozisyon(String Personel_Pozisyon) {
        this.Personel_Pozisyon = Personel_Pozisyon;
    }

    public String getPersonel_Maas() {
        return Personel_Maas;
    }

    public void setPersonel_Maas(String Personel_Maas) {
        this.Personel_Maas = Personel_Maas;
    }
    
    
    
    
}


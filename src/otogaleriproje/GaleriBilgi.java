
package otogaleriproje;

public class GaleriBilgi {
    
    private int galeri_id;
    private String galeri_adi;
    private int galeri_personelSay;
    private String galeri_telNo;
    private int galeri_AracSay;

    public GaleriBilgi(int galeri_id, String galeri_adi, int galeri_personelSay, String galeri_telNo, int galeri_AracSay) {
        this.galeri_id = galeri_id;
        this.galeri_adi = galeri_adi;
        this.galeri_personelSay = galeri_personelSay;
        this.galeri_telNo = galeri_telNo;
        this.galeri_AracSay = galeri_AracSay;
    }

    public int getGaleri_id() {
        return galeri_id;
    }

    public void setGaleri_id(int galeri_id) {
        this.galeri_id = galeri_id;
    }

    public String getGaleri_adi() {
        return galeri_adi;
    }

    public void setGaleri_adi(String galeri_adi) {
        this.galeri_adi = galeri_adi;
    }

    public int getGaleri_personelSay() {
        return galeri_personelSay;
    }

    public void setGaleri_personelSay(int galeri_personelSay) {
        this.galeri_personelSay = galeri_personelSay;
    }

    public String getGaleri_telNo() {
        return galeri_telNo;
    }

    public void setGaleri_telNo(String galeri_telNo) {
        this.galeri_telNo = galeri_telNo;
    }

    public int getGaleri_AracSay() {
        return galeri_AracSay;
    }

    public void setGaleri_AracSay(int galeri_AracSay) {
        this.galeri_AracSay = galeri_AracSay;
    }
   
    
    
    
    
    
    
    
    
}

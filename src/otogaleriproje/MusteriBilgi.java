
package otogaleriproje;

public class MusteriBilgi {
    
    
    private int musteri_id;
    private String musteri_adi;
    private String musteri_soyadi;
    private String musteri_TC;
    private String musteri_telNo;

    public MusteriBilgi(int musteri_id,String musteri_adi, String musteri_soyadi, String musteri_TC, String musteri_telNo) {
        this.musteri_id = musteri_id;
        this.musteri_adi = musteri_adi;
        this.musteri_soyadi = musteri_soyadi;
        this.musteri_TC = musteri_TC;
        this.musteri_telNo = musteri_telNo;
    }

    public int getMusteri_id() {
        return musteri_id;
    }

    public void setMusteri_id(int musteri_id) {
        this.musteri_id = musteri_id;
    }

    public String getMusteri_adi() {
        return musteri_adi;
    }

    public void setMusteri_adi(String musteri_adi) {
        this.musteri_adi = musteri_adi;
    }

    public String getMusteri_soyadi() {
        return musteri_soyadi;
    }

    public void setMusteri_soyadi(String musteri_soyadi) {
        this.musteri_soyadi = musteri_soyadi;
    }

    public String getMusteri_TC() {
        return musteri_TC;
    }

    public void setMusteri_TC(String musteri_TC) {
        this.musteri_TC = musteri_TC;
    }

    public String getMusteri_telNo() {
        return musteri_telNo;
    }

    public void setMusteri_telNo(String musteri_telNo) {
        this.musteri_telNo = musteri_telNo;
    }
    
}

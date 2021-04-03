
package otogaleriproje;
public class FaturaBilgi {
    
    private int fatura_no;
    private String fatura_alici;
    private String fatura_plaka;
   
    private int fatura_fiyat;
    private String fatura_Alici_TC;
    private String fatura_personel;
    private String fatura_KS;

    public String getFatura_personel() {
        return fatura_personel;
    }

    public void setFatura_personel(String fatura_personel) {
        this.fatura_personel = fatura_personel;
    }

    public String getFatura_KS() {
        return fatura_KS;
    }

    public void setFatura_KS(String fatura_KS) {
        this.fatura_KS = fatura_KS;
    }


    public FaturaBilgi(int fatura_no, String fatura_alici,String fatura_alici_tc, String fatura_plaka, String fatura_personel, int fatura_fiyat,String fatura_KS) {
        this.fatura_no = fatura_no;
        this.fatura_alici = fatura_alici;
        this.fatura_plaka = fatura_plaka;
        this.fatura_personel = fatura_personel;
        this.fatura_fiyat = fatura_fiyat;
        this.fatura_KS = fatura_KS;
        this.fatura_Alici_TC=fatura_alici_tc;
    }

    public String getFatura_Alici_TC() {
        return fatura_Alici_TC;
    }

    public void setFatura_Alici_TC(String fatura_Alici_TC) {
        this.fatura_Alici_TC = fatura_Alici_TC;
    }

  

    public int getFatura_no() {
        return fatura_no;
    }

    public void setFatura_no(int fatura_no) {
        this.fatura_no = fatura_no;
    }

    public String getFatura_alici() {
        return fatura_alici;
    }

    public void setFatura_alici(String fatura_alici) {
        this.fatura_alici = fatura_alici;
    }

    public String getFatura_plaka() {
        return fatura_plaka;
    }

    public void setFatura_plaka(String fatura_plaka) {
        this.fatura_plaka = fatura_plaka;
    }

    

    public int getFatura_fiyat() {
        return fatura_fiyat;
    }

    public void setFatura_fiyat(int fatura_fiyat) {
        this.fatura_fiyat = fatura_fiyat;
    }
    
    
    
    
    
}

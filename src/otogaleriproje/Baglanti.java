
package otogaleriproje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Baglanti {
 
    
    public static final String kullanici_adi = "allweun1_mert";
    public static final String parola = "arabagaleri123";
    public static final String db_ismi = "allweun1_proje";
     public static final String host = "45.84.190.81";
    public static final String url = "jdbc:mysql://45.84.190.81:3306/"+db_ismi+"?useUnicode=true&characterEncoding=utf8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
   public static final int port =3306;
    
    private static Connection con = null;
    
    private Statement statement = null;
    
    private static PreparedStatement prepState =null;
    
   
    
    

 
    

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
      
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        con = DriverManager.getConnection(url,kullanici_adi,parola);
        prepState   = con.prepareStatement("INSERT INTO deneme VALUES('1','4','5','7')");
        
        int status = prepState.executeUpdate();
        if (status !=0) {
            System.out.println("Database was connection");
            System.out.println("Record was inserted");
        }
    }
    
}

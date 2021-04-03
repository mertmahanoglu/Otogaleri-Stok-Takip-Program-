
package otogaleriproje;

import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JLabel;

public class Clock {
      public void Clock(JLabel label)
    {
     
  Thread clock = new Thread()
        {
        public void run()
        {
            try {
                for(;;){
                   Calendar cal = new GregorianCalendar();
                   int gun = cal.get(Calendar.DAY_OF_MONTH);
                   int ay =  cal.get(Calendar.MONTH);
                   int yil = cal.get(Calendar.YEAR);
    
                   
                   
                   SimpleDateFormat dateFormat = new SimpleDateFormat("kk:mm:ss a");
                   String formattedDate = dateFormat.format(new Date()).toString();
    
                       label.setText("Saat : " +":"+formattedDate+"  " + "Gün :"+gun+"/"+(ay+1)+"/"+yil);
                       sleep(1000);
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        };
        clock.start();
        
       
       
    
    
    }

}

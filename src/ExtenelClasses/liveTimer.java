
package ExtenelClasses;

import java.text.SimpleDateFormat;
import java.util.Date;

public class liveTimer extends Thread {

    public static int min = 29;
    public static int sec = 59;
    
    // timer eka godak sarayak stary unama timer eka pissu natana handa object ekak hadala eka null nn timer object eka hadenwa
    
    
    private static liveTimer ob;
    
    
    public static liveTimer getob(){
    
        if (ob==null) {
            
            ob=new liveTimer();
            
        }
    
    return ob;
    }
    //---------------------------------------------------------------------------
    
    
    
    public void run() {

         while (true) {            
             try {
                 
                 Thread.sleep(1000);
                 
                 Date date = new Date();
                 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                 String time = sdf.format(date);
                 
                 
             } catch (Exception e) {
             
                 e.printStackTrace();
                 
             }
        
             
             

         }
         
        
    }

}

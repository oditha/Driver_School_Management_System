package ExtenelClasses;




import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class dateFormat {
    
    public static SimpleDateFormat sdfYear;
    public static SimpleDateFormat sdfFull;
    public static SimpleDateFormat sdfCS;
    public static SimpleDateFormat sdfCM;
    public static SimpleDateFormat sdct;
    public static SimpleDateFormat sd;
    
    public static String YearOnly(){
    
        if (sdfYear == null) {
            
            sdfYear = new SimpleDateFormat("yyyy");
            
        }
    
        return sdfYear.format(new Date());
        
    }
    
    public static String MonthOnly(){
    
        if (sdfYear == null) {
            
            sdfCM = new SimpleDateFormat("yyyy/MM");
            
        }
    
        return sdfCM.format(new Date());
        
    }
    
    public static String DateFullCurrent(){
    
        if (sdfFull == null) {
            
            sdfFull = new SimpleDateFormat("yyyy/MM/dd");
            
        }
    
        return sdfFull.format(new Date());
        
    }
    
      public static String setDateFull(String Date) throws ParseException{
    
        if (sdfCS == null) {
            
            sdfCS = new SimpleDateFormat("yyyy/MM/dd");
            
        }
        if (sd == null) {
            
            sd = new SimpleDateFormat("yyyy-MM-dd");
            
        }
    
        Date parse = sd.parse(Date);
        
        
        return sdfCS.format(parse) ;
        
    }
    public static String TimeCurrent(){
    
        if (sdct == null) {
            
            sdct = new SimpleDateFormat("hh:mm a");
            
        }
    
        return sdct.format(new Date());
        
    }

  
    
}

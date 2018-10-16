
package ExtenelClasses;

import java.text.DecimalFormat;


public class df {
    
    public static String dcf(double value){
        
        DecimalFormat dcf = new DecimalFormat(".00");
        String format = dcf.format(value);
    
        return format;
    
    }    
}

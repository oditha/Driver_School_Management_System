/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtenelClasses;

import java.text.DecimalFormat;

/**
 *
 * @author owanasinghe
 */
public class dfPrice {
    
    public static String dcf(double value){
        
        DecimalFormat dcf = new DecimalFormat(".00");
        String format = dcf.format(value);
        
        
        
        return format;
    
    }
    
  
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtenelClasses;

import java.sql.ResultSet;

/**
 *
 * @author iamarshrx
 */
public class test {
    
    
    public static void main(String[] args) {
        try {

            ResultSet rs = DB.search("SELECT * FROM `Staff` WHERE IsActive='1'");

            while (rs.next()) {

                ResultSet rs2=DB.search("SELECT * FROM `users` Where idStaff='"+rs.getString("idStaff")+"'");
                
                if (!rs2.next()) {
                          System.out.println(rs.getString("name") + "-" + rs.getString("nic"));
                }
                
                
                
                
          

            }

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
    
    
}

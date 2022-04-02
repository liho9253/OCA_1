/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CH6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author user
 */
public class ch_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
        System.out.println(LocalDate.of(2015, Month.JANUARY, 01));      
        
        StringBuilder sb = new StringBuilder("12345678");       
        sb.setLength(5);       
        sb.setLength(10);       
        System.out.println(sb.length());
        
        String s = "Holle";
        s.replace("H","S");// s = s.replace("H","S"); 
        System.out.println(s);
         
        LocalDateTime dt = LocalDateTime.parse("2015-01-02T17:13:50");
        dt.format(java.time.format.DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(dt);
        dt.toString();
        System.out.println(dt); 
        
        java.time.LocalDate dt1 = 
                java.time.LocalDate.parse("2015-01-01").minusMonths(1).minusDays(1).plusYears(1); 
        // Date 只有到日期
        System.out.println(dt1);
    }
    
}

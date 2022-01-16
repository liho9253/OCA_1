/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author user
 */
public class ja_5 {

    public static String hidePhone(String fullPhoneNumber){ 
        return new StringBuilder("xxx-xxx-")+fullPhoneNumber.substring(8); 
        // return "xxx-xxx-"+fullPhoneNumber.substring(8, 12);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ma = "xxx-xxx";
        // String 沒有 append
        // StringIndexOutOfBoundsException. 
        
        // LocalDateTime greatDay = LocalDateTime.parse("2015-01-01");// 2015-01-01T17:13:50 才會正確
        //String greatDayStr = greatDay.format(DateTimeFormatter.ISO_DATE_TIME); 
        //System.out.println(greatDayStr);//4
        
         LocalDateTime dt = LocalDateTime.parse("2015-01-02T17:13:50"); 
         
        dt.format(java.time.format.DateTimeFormatter.ISO_DATE_TIME);
        dt.toString();
    } 
    
}

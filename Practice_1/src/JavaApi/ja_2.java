/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApi;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList.*;
/**
 *
 * @author user
 */
public class ja_2 {
    // String can use + += .
    // String 沒有 append and insert 因為 String 不能被改變
    // substring(3 ,5) 加入該字串的第3 - 4個字元
    // ensureCapacity() 設置容量
    // Date-Time 用的是 ISO-8601 為默認的日曆
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "a";
        str += "b";
        str = str + "c";
        str = str + str.intern();
        // str ++;
        System.out.println(str);
        
        LocalDate d1 = LocalDate.parse("2015-02-05", DateTimeFormatter.ISO_DATE);
        LocalDate d2 = LocalDate.of(2015, 2, 5);         
        LocalDate d3 = LocalDate.now();         
        System.out.println(d1);         
        System.out.println(d2);         
        System.out.println(d3);
        
        System.out.println(LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));// 下禮拜二
        System.out.println(TemporalAdjusters.next(DayOfWeek.TUESDAY).adjustInto(LocalDate.now())); // 下禮拜二
        System.out.println(LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY))); // 離今天最近的禮拜二包括今天
        
    }
    public static String hidePhone(String fullPhoneNumber){
          
        //return "xxx-xxx-"+fullPhoneNumber.substring(8, 12); 
        return new StringBuilder("xxx-xxx-")+fullPhoneNumber.substring(8); 
    }
}

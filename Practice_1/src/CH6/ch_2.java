/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CH6;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author user
 */
public class ch_2 {

    // charAt 最大值是 length-1
    public static String getMsg(char x){         
        String msg = "Input value must be ";        
        msg = msg.concat("smaller than X");     
        msg.replace('X', x);       
        String rest = " and larger than 0";    
        msg.concat(rest);        
        return msg;
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.ensureCapacity(100);
        LocalDateTime ld = LocalDateTime.of(2015, Month.OCTOBER, 31, 10, 0);  
        ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern")); 
        date = date.plus(Duration.ofDays(1));
        System.out.println(date); 
        
        date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Period.ofDays(1));
        System.out.println(date);
        
        System.out.println(getMsg((char)10));
 
        System.out.println(LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
        System.out.println(TemporalAdjusters.next(DayOfWeek.TUESDAY).adjustInto(LocalDate.now()));
    }
    
}

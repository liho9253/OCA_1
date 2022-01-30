/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATest;

import java.time.LocalDateTime;
import java.util.function.Predicate;

public class t7_Test31 {

    public void test(String s){
        
    }
    void test(String s, int i){
        
    }
    
    String s; // null
    char c;// 空白
    
    public boolean equals(t7_Test31 str){
        return this.s.equalsIgnoreCase(str.toString());
    }
    t7_Test31(String s){
        this.s = s; 
    }
    public static void main(String[] args) {
        Predicate<Integer> p = (n) -> n % 2 == 0;
        Boolean s = p.test(101); // n == 101
        if(s == true){
            System.out.println("true");   
        }else{
            System.out.println("false");
        }
        int r = 5_000_000;
        System.out.println(r);
        /*
        t7_Test31 t = new t7_Test31();
        String t1 = t.s;
        char t2 = t.c;
        System.out.println(t2+" "+t1);*/
        
        int o = 100;
        int z = 0;
        // System.out.println(o/z); ArithmeticException 算術異常
        
        byte b = 1;
        double d = 1;
        System.out.println(b+" "+d);
        
        String s1 = "Moon";
        t7_Test31 s2 = new t7_Test31("Moon");
        if((s1 == "Moon") && (s2.equals("Moon"))){
            System.out.println("A");
        }else{
            System.out.println(s2);
        }
        if(s1.equalsIgnoreCase(s2.s)){
            System.out.println(s2.s);
        }
        
        String[][] chs = new String[5][2];
        chs[0] = new String[2];
        chs[1] = new String[5];
        
        int ans;
        // System.out.println(ans); 沒宣告
        
        // LocalDateTime dt = new LocalDateTime.of(2014,7,31,1,1);
        
    }
    
}

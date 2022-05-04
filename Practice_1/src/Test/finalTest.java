/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.ArrayList;
import java.util.List;

interface House{ 
    public default String getAddress(){  
        return "101 Main Str"; 
    } 
}
public class finalTest {
    public finalTest(){}
    static String str;
    static boolean[] ba = new boolean[1];
    // 拋出例外就不會繼續執行
    // constructor
      // 要跟 class 同名
      // 不能有 return
    // 在 try 裡面定義的變數 catch 裡面看不到
    // ArrayList 是 AbstractList 的子類
    public static void main(String[] args) {
        System.out.println(str);
        System.out.println(1 + 5 < 3 + 7);
         List s1 = new ArrayList( ); 
         s1.add("a"); 
         s1.add("b"); 
         s1.add("c"); 
         s1.add("a"); 
         System.out.println(s1.remove("a")+" "+s1.remove("x"));
        short s = 10;  
        // char c = s; 
        int b = 0b01001110_00100000;// 可以0b開頭
        int hex = 0xCAFE_BABE; 
        float f = 9898_7878.333_333f;
        int bin = 0b1111_0000_1100_1100;
    }
    
}

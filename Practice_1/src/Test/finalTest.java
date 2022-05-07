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
    // 重點
    // 拋出例外就不會繼續執行
    // constructor
      // 要跟 class 同名
      // 不能有 return
    // 在 try 裡面定義的變數 catch 裡面看不到
    // ArrayList
      // ArrayList 是 AbstractList 的子類
      // ArrayList 不能存儲原語。
      // 它允許恆定時間訪問其所有元素。
      // ArrayList 由數組支持。
    // 變數不能數字開頭
    // switch
      // 裡面一定要有 case defaukt {}
    // 運算符 > 比較符
    // Double extends Number
    // B b = new B();
    //    A a = b;
    //    I i = a;  因為對象是 B() 所以都會調用B()的toSting
    // Java的基本類型 不是Object
    // 沒有對調用 null 任何方法就不會有 NullPointerException
    // 關於封裝 數據變量設 pirvate 公開的功能設 public 
    // try 可以只接 finally 
    // static 變數會共用
    // float 十進位制才要加 f
    // s == null 要先判斷 才能判斷 s.length() == 0
    // String class 沒有 reverse()
    // reverse() 是 StringBuilder class
    // == 會比 = 先做
    // List不接受null ArrayList可以
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
        
        int[] intArr;
         
 
 
    }
    
}

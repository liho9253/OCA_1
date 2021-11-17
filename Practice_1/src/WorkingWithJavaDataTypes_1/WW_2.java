/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkingWithJavaDataTypes_1;
import java.util.*;
/**
 *
 * @author user
 */
public class WW_2 {
    static int x = 10;
    final int y = 10;
    public static void main(String[] args) {
        int i1 = 1, i2 = 2, i3 = 3;
        int i4 = i1 + (i2 = i3);
        System.out.println(i4);
        
        ArrayList<Double> al = new ArrayList<>();
        // al.add(111); int 不能加到 Double裡
        System.out.println(al.indexOf(1.0));
        System.out.println(al.contains("string"));
        // Double d = al.get(al.length);    
        
        byte b = -128;
        int i = b;
        b = (byte) i;
        System.out.println(i+" "+b);
        // Range of byte is -128 to 127
        
        char ch = 10;
        Boolean bool = false;
        Object o = new java.io.File("a.txt");
        // Thread t = new Runnable();
        Runnable r = new Thread();
        
    }
}


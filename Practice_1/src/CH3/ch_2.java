/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CH3;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class ch_2 {
    static int[] x = new int[0];
    static{
        // x[0] = 10; java.lang.ExceptionInInitializerError
    }
    public static void incr(int   n ) { n++ ; }
    public static void incr(int[ ] n ) { n [ 0 ]++ ; }
    public static void main(String[] args) { 
        
        int ia[][][] = new int[4][3][3];
        System.out.println(ia.length+" "+ia[0].length+" "+ia[1][0].length);
         
        int i = 1;
        int[] iArr = {1}; 
        incr(i) ;
        incr(iArr) ;
        System.out.println( "i = " + i + "  iArr[0] = " + iArr [ 0 ] ) ;
        
        Object[] name1 = new Object[]{ "aaa", new Object(), new ArrayList(), 10};
        Object[] name2 = new Object[]{ "aaa", new Object(), new ArrayList(),  new String[]{""} };
        //Object[] name3 = new Object[]{ "aaa", new Object(), new ArrayList(), {}};
    }
    
}

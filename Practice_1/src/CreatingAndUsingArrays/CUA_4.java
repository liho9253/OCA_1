/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreatingAndUsingArrays;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class CUA_4 {

    static int[][] table = new int[2][3];
    //----------------------------
    public static void incr(int   n ) { n++ ; }
    public static void incr(int[ ] n ) { n [ 0 ]++ ; }
    
    public static void main(String[] args) {
        for (int x = 0; x < table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {
                table[x][y] = x+y;            
            }         
        }
        //---------------------------
        Object obj = new Object[]{ "aaa", new Object(), new ArrayList(), 10};
        //Object obj2 =  new Object[]{ "aaa", new Object(), new ArrayList(), {} };
        Object obj3 =  new Object[]{ "aaa", new Object(), new ArrayList(), new String[]{""} };
        //Object obj4 =  new Object[1]{ new Object() };
        //----------------------------
        double daaa[][][] = new double[3][][]; 
        double d = 100.0; 
        double[][] daa = new double[1][1];
        //daaa[0] = d;
        daaa[0] = daa;
        //daaa[0] = daa[0];
        //daa[1][1] = d;
        daa = daaa[0];
        //-----------------------------
        int i = 1;
        int[] iArr = {1};
        System.out.println(i+" "+iArr[0]+" "+iArr.length);
        incr(i) ;
        incr(iArr) ;
        System.out.println( "i = " + i + "  iArr[0] = " + iArr [ 0 ] ) ;
        String [][] news = {};
        //------------------------------
        int[][] a = new int[2][];
        a[0] = new int[2];
        a[1] = new int[4];
    }       
    public static void multiply() {
        for (int x = 0; x < table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {
                table[x][y] = table[x][y]*2;            
            }         
        }     
    }
    
}

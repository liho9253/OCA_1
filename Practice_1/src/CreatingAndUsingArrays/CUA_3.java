/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreatingAndUsingArrays;

/**
 *
 * @author user
 */
public class CUA_3 {
    static int[] x = new int[0];   
    static{    
        //x[0] = 10;
    }
    public static void main(String[] args) {
        //CUA_3 ax = new CUA_3();
        //---------------------------------
        boolean[] b1 = new boolean[2]; 
        boolean[] b2 = {true , false}; 
        System.out.println( "" + (b1[0] == b2[0]) + ", "+ (b1[1] == b2[1])  );
        //---------------------------------
        int i = 4;
        int ia[][][] = new int[i][i = 3][i];
        System.out.println( ia.length + ", " + ia[0].length+", "+ ia[0][0].length);
    }
    
}

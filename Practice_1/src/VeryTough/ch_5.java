/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeryTough;

public class ch_5{
    // 參數大小會被忽略但空白不會
    public static int m1() throws Exception{
        throw new Exception("Some Exception");    
    }
    int i =   4;
    void print() { System.out.print(i+" "); }
    public static void main(String[] args) throws Exception{    
        int[] a = null; 
        int i = a [ m1() ];
        
        
    }
    
}

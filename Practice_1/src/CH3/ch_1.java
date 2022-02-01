/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CH3;

/**
 *
 * @author user
 */
public class ch_1 {

    
    public static void main(String[][] at){
        
    }
    public static void main(String[] args) {
        String[] sa = {new String("AAA")};
        String[] sa2 = {"AAA"};
        String[] sa3 = new String[]{"AA"};
        /*
        int size = 10;
        int[] arr = new int[size];
        for(int i = 0;i < size ; ++i) 
            System.out.println(i);
        */
        A[] a,al;
        B[] b;
        a = new A[10]; al = a;
        b = new B[20];
        a = b;
        b = (B[])a;
        b = (B[])al;
        
        // int[][] w = new int[][4];  int[][4] 宣告要從左邊開始
        
    }
    
}
class A{
    
}
class B extends A{
    
}

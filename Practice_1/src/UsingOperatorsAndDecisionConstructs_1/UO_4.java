/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsingOperatorsAndDecisionConstructs_1;

/**
 *
 * @author user
 */
public class UO_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int k = 1;
        int[] a = { 1 };
        k += (k = 4) * (k + 2);
        a[0] += (a[0] = 4) * (a[0] + 2);       
        System.out.println( k + " , " + a[0]);
        
    }
    
}

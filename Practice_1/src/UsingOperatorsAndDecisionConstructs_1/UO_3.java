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
public class UO_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = "java";     
        char[] b = { 'j', 'a', 'v', 'a' };     
        String c = new String(b);     
        String d = a;
        System.out.println(a.equals(c));
        System.out.println(a=="java");
        //-----------------------------------  
        byte b1 = 1;   
        char c1 = 1;   
        short s1 = 1;   
        int i1 = 1;
        //s1 = b1 * b1;
        i1 = b1 + b1;
        s1 *= b1;
        //c1 = c1 + b1;
        s1 += i1;
    }
    
}

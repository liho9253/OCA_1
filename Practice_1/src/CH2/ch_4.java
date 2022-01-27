/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CH2;

/**
 *
 * @author user
 */
public class ch_4 {
    
    public static void main(String[] args) {
        char c = 'b';
        int i = (int)c;
        System.out.println(i);
        
        int value = 1_000_000; 
        int value2 = 1000000; 
        System.out.println(value == value2);
        
        Boolean.valueOf(true);
        Boolean.valueOf("trUE");
    }
    
}

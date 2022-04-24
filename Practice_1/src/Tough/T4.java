/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tough;

/**
 *
 * @author user
 */
public class T4 {

    // main 要有 void
    
    public static void main(String[] args) {    
        int k = 9, s = 5;
        char c = 320;
        double d = 320; 
        byte b = (byte)320;
        float f = 0.0f;
        switch(k){     
            default :         
            if( k == 10) { s = s*2; }    
            else{      
                s = s+4;      
                break;     
            }  
            case 7 : s = s+3;
        }
        System.out.println(s);
        
        f = Float.valueOf(s).floatValue();
        char cA[][] = new char[3][];  
        for (int i=0; i<cA.length; i++) cA[i] = new char[4];
        System.out.println(c);
    }
}

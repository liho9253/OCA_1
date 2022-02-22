/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tough;

class A {
    public int getCode(){ return 2;}
}

class AA extends A { 
 // public long getCode(){ return 3;}
}
public class ch_1 {
    static ch_1 ref;  
    String[] arguments;
    public void func(String[] args){    
        ref.arguments = args;   
    }
    
    int[] array1, array2[]; // array2[] => array2[][]
    int[][] array3;
    int[] array4[], array5[]; // array5[] => array5[][]
    public static void main(String[] args) { 
        byte starting = 3;
        short firstValue = 5; 
        int secondValue = 7; 
        int functionValue = (int) (starting/2 + firstValue/2 + (int) firstValue/3 ) + secondValue/2;
        System.out.println(functionValue);
        
        // bool b = null;
        // boolean b = 1;
        boolean b = true|false;
        System.out.println(b);
        int i = 1, j = 10;
        do {
           if (i++ > --j) continue;
        } while (i < 5);
        System.out.println("i=" + i + " j=" + j);    
        
        ref = new ch_1(); 
        ref.func(args);
   
    }
    
}

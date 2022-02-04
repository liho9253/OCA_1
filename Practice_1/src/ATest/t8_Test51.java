/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATest;

/**
 *
 * @author user
 */
public class t8_Test51 {

    static Character c;
        
    private void re(){
        
    }
    static int[] finM(){
        int[] arr = new int[4];
        return arr;// 回傳[]
    }
    public static void main(String[] args) {
        int[] array = new int[3]; 
        array[0] = 1;
        
        double t = 100.00;
        float f = (float)t;
        
        String str = "  1  ";
        str.trim();// 沒有把空格刪掉
        System.out.println(str.equals("") + " " + str.isEmpty());
        System.out.println(str);
        
        System.out.println(c);// Character 預設值為 null
        
        
    }
    
}

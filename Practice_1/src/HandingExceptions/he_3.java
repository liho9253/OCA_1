/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HandingExceptions;

/**
 *
 * @author user
 */
public class he_3 {

    public static int m1() throws RuntimeException{
        throw new RuntimeException("Some Exception");
    }
    public static void main(String[] args) {
        Float f = null; 
        try{    
            f = Float.valueOf("12.3");
            String s = f.toString();
            int i = Integer.parseInt(s); // NumberFormatException 數字格式異常 String 轉 int 時格式異常
            System.out.println(""+i); 
        } catch(Exception e){
            System.out.println(e);
            System.out.println("trouble : "+f); 
        }
        
        try{
            int[] a = null;
            int i = a[m1()];
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}

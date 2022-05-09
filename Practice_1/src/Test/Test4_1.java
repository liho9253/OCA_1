/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author user
 */
public class Test4_1 {

   public static void sayHello(){ System.out.println("Static Hello World"); } 
    // public void sayHello() { System.out.println("Hello World "); }
     void perform_work(int time){ }
     void Perform_work(int time){ }
    // for 不能當標籤
    // try -> catch -> finally
    // 會經過的地方都要throws  
    // String 沒有 append、insert
    // new String[]也是一個對象 可以放在 array 裡面
    // consturctor 
       // 不能return final static abstract void 
    //LocalDateTime 要有時間 ex: 12:00
    static String j = ""; 
    public static void method( int i){   
        try{   
            if(i == 2){    
                throw new Exception();  
            } 
            j += "1";  
        } catch (Exception e){   
            j += "2";   
            return;  
        } finally{
            j += "3";   
        }  
        j += "4"; // 沒有被catch才會跑這裡
    }
    public static void main(String[] args) {
        
        
    }
    
}

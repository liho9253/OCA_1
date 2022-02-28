/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tough;

// arg 一定會有數
// 關鍵字不能當標籤 ex: for

public class ch_2 {

   
    public int getLoad() {
        return 1;
    }
/*
    public double getLoad(){ 
        return 3.0;
    }*/
    public static void main(String[] args) {
        
        // int value = 1,000,000;
        System.out.println("...");
        {
            System.out.println("no params");
        }
        int i = 0;
      for (i=1 ;  i<5  ; i++) continue;  //(1)
      for (i=0 ;       ; i++) break;       //(2)
      for (    ; i<5?false:true ;    );     //(3)
      
    }
    
}

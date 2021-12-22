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
public class he_2 {
    // Exception 可以記錄意外狀況 另外處理發生的 Exception
    // 處理外部遇到的異常情況 提前編寫出會遇到的Exception
   public int luckyNumber(int seed){
       if(seed > 10) return seed%10;
       int x = 0;             
       try{                
           if(seed%2 == 0) throw new Exception("No Even no.");
           else return x;
       }catch(Exception e){
           return 3;
       }             
       finally{
           return 7;
       }      
       // 因為 finally 最後一定會執行 所以會 return 7
   }
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        System.out.println(a/b);
    }
    
}

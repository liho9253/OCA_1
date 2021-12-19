/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HandingExceptions;

public class he_1 {

    int factorial(int n){        
         if(n==1) return 1;       
         else return n*factorial(n-1);    
     }
    public static void main(String[] args) {
        // try 越下面的Exception越父
        // main 結束前一定會執行finally
        try{
            RuntimeException re = null;
            throw re;
        }
        catch(Exception e){
           System.out.println(e);
        }
    }     
    
}

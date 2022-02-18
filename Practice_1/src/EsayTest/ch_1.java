/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EsayTest;

 class E1 extends Exception{ } // 會有 Exception
class E2 extends E1 { }
public class ch_1 {
    // char 用 ''
    // String 用 "" 
   
    // Test Test( ) { }
    // Test(Test b) { }
    // private final Test( ) { }
    void Test( ) { }
    public static void Test(String args[ ] ) { }
    public static void main(String[] args) {
        for ( ; true ; ) break ;   
        for(int i=0; i<3; i++){    
            System.out.print(args+" ");  
        }
        
        int sum = 0;
        for (int i = 0, j = 10; sum > 20; ++i, --j){
           sum = sum+ i + j;
        }       
        try{       
            throw new E2(); 
        }catch(E1 e){     
            System.out.println("E1"); 
        }catch(Exception e){    
            System.out.println("E");  
        }finally{     
            System.out.println("Finally");   
        }
        
        switch (1) { default : break; }
        // if (true) { break ; }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsingLoopConsturcts;

/**
 *
 * @author user
 */
public class ULC_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] values = { 10, 30, 50 };
        for( int val : values ){
            int x = 0;
            while(x<values.length){
             System.out.println(x+" "+val);
              x++;
            }
        }  
        //---------------------------------
        //if (true) { break ; }
        switch (1) { default : break; }
        //----------------------------------    
        System.out.println("===============================");
        boolean b = false;
        int i = 1;
        do{
           i++ ;
        } while (b = !b);
        System.out.println( i );
        
    }
    
}

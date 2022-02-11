/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CH5;

/**
 *
 * @author user
 */
public class ch_1 {

    // catch 不能在 finall 後面
    public static void main(String[] args) {
        for ( ; true ; ) break ;
        // while ( ) break ;
        do { break ; } while (true) ;
        switch (1) { default : break; }
        // if (true) { break ; } 
        int a = 0;
        for(int i = 0 ; i <= 3 ; i++){
            System.out.println(++a);
        }
        
        int c = 0;
        JACK: while (c < 8){
            JILL: System.out.print(c);
            if (c > 3) 
                break JACK; 
            else c++;
        }
        System.out.println();
        
        boolean b = false;
        System.out.println(b = !b);
        
        // while (false) { x=3; } 
        int x;
        if (false) { x=3; }
        
        
    }
    
}

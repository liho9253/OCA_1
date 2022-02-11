/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CH4;

/**
 *
 * @author user
 */
public class ch_2 {

    public static int m1(int i){
        return ++i;
    }
    public static void main(String[] args) {
        System.out.println(args.length);
        int i = 0;
        System.out.println(++i);
        
        char c = 'a';
        System.out.println(c+=2);
        
        String s = 'b'+63+"a";
        // String s2 = 63 + new Integer(10);
        
        // System.out.println(args[0]);
        
        int k = 1;
        k += 3 + ++k;// k = k + 3 + (++k) => k = 1 + 3 + 2
        System.out.println(k);
          
        Byte condition = 1;
        // Integer condition = new Integer("1");
        switch( condition ){
            case 1  : System.out.println("1");
                break;      
            case 2  : System.out.println("2");
                break;      
            case 3 : System.out.println("3");  
                break;   
        }       
        
    }
    
}

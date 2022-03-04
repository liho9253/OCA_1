/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeryTough;

/**
 *
 * @author user
 */
public class ch_1 {

        static boolean a1;  
        static boolean b1;   
        static boolean c1;   
        
        String s1 = "green mile";  
        
        public void generateReport( int n ){      
            String local;
            if( n > 0 ) local = "good";
            else local = "bad";
            System.out.println( s1+" = " + local );  
        }
        
    public static void main(String[] args) {
        Integer i = new Integer(1) ;   
        Long m = new Long(1);    
        if( i.equals(m)) System.out.println("equal");     
        int[] a = { 1 };    
        a[0] += (a[0] = 4) * (a[0] + 2);
        System.out.println(a[0]); 
        // System.out.println(null + true); 
        // System.out.println(true + null); 
        // System.out.println(null + null);      
        boolean bool = (a1 = true) || (b1 = true) && (c1 = true);     
        System.out.println(a1 + ", " + b1 + ", " + c1);  
        /*
        ch_1 s = new GoodSpeak();
        ((Tone)s).up(); 
        ((GoodSpeak)s).up(); 
        */
         // System.out.println("12345".charAt(6));
}
 static class GoodSpeak extends ch_1 implements Tone{  
    public void up(){      
        System.out.println("UP UP UP");  
    }
}

interface Tone{     
    void up(); 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tough;

class Tough { int i = 10;  int m1( ) { return i; } } 
class B extends Tough { int i = 20;  int m1() { return i; } } 
class C extends B { int i = 30;  int m1() { return i; } }

class ABCD{
   int x = 10;
   static int y = 20;
}
class MNOP extends ABCD{
   int x = 30;
   static int y = 40;
}
public class ch_3 {

    public static void main(String[] args) {       
        String s = "MINIMUM";      
        System.out.println(s.substring(4, 7));
        System.out.println(s.substring(5));     
        System.out.println(s.substring(s.indexOf('I', 3)));
        // System.out.println(s.substring(s.indexOf('I', 4)));        
        
        Tough o1 = new C( );  
        B o2 = (B) o1;    
        System.out.println(o1.m1( ) );   
        System.out.println(o2.i );
        
        System.out.println(new MNOP().x+", "+new MNOP().y);
    }
    
}

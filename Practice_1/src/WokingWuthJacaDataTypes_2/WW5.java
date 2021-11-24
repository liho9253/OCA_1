/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WokingWuthJacaDataTypes_2;

/**
 *
 * @author user
 */
public class WW5 {
    
    static int si = 10;
    int i;
    final boolean bool;
    { bool = (si > 5); 
    i = 1000; }     
    public static void testInts(Integer obj, int var){
        obj = var++;         
        obj++;     
    }
       String a = "x";
       static char b = 'x';
       String  c = "x";
       class Inner{
            String  a = "y";
            String  get(){
                String c = "temp"; 
                c = ""+b;
                c = WW5.this.a;
                c = ""+WW5.b;
                return c;
          }
       }
    
    WW5() { 
        System.out.println(  new Inner().get()  ); 
    }
    
    
    public static void main(String[] args) {         
        Integer val1 = new Integer(5);         
        int val2 = 9;         
        testInts(val1++, ++val2);         
        System.out.println(val1+" "+val2);    
        new WW5();  
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Missed;

class Base{
   public short getValue(){ return 1; } //1
}
class Base2 extends Base{
   // public byte getValue(){ return 2; } //2
}
class A{
   A() {  print();   }
   void print() { System.out.print("A "); }
}
public class ch_1 extends A{
    // interface 是 static final public 的
    
    int i = 4;
    
   void print() { System.out.print(i+" "); }
   
    public void initData(String[] arr){
        int ind = 0;         
        for(String str : arr){
            str.concat(str+" "+ind);
            ind++;        
        }  
    }        
    public void printData(String[] arr){    
        for(String str : arr){ 
            System.out.println(str);      
        }   
    }
    public static void main(String[] args) {
        
    A a = new ch_1();
    a.print();
    System.out.println();
    
    Base b = new Base();
    System.out.println(b.getValue()); //3
    
    System.out.println("");
    ch_1 ot = new ch_1();
    String[] arr = new String[2];         
    // ot.initData(arr);  
    ot.printData(arr);
               
    System.out.println("");
    short s = 9;
    int i = 9; System.out.println(s == i);
    Integer i1 = 9; System.out.println( s == i1 );
    
    char c;
    int i2;
    c = 'a';//1
    i2 = c;  //2
    i2++;    //3
    // c = i2;  //4
    c++;    //5
    System.out.println("");
    
    int a2 = Integer.MIN_VALUE;
    int b2 = -a2;
    System.out.println( a2+ "   "+b2);
    }
    
}

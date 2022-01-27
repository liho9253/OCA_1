/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CH2;

/**
 *
 * @author user
 */
class A {
    public int getCode(){ return 2;}
}

class AA extends A { 
  // public long getCode(){ return 3;}
} 
class Fruit{     
    int seeds;     
    String taste;     
    boolean edible; 
}  
class TropicalFruit extends Fruit{
    double weight;
    TropicalFruit(){
        seeds = 0;
        taste = "sweet";
        weight = 10.0;
    } 
}  
class Banana extends TropicalFruit{
    double calories;     
    Banana(){
        seeds = 10;
        weight = 20.0;
        calories = 200;     
    } 
}

public class ch_3 {
  
 /*
public abstract class Car{
       public abstract int getDailyRate();
       public abstract void printDetails(); 
}*/


    public static void main(String[] args) {
        
        // unsigned byte b = 0;    
        
        A a = new A();
        AA aa = new AA();
        a = aa;
        
        System.out.println("a = "+a.getClass());
        System.out.println("aa = "+aa.getClass());
        
        Banana b = new Banana();        
        System.out.println(b.edible+" "+b.weight+" "+b.calories);
        
         
        float f = -123; 
        long g = 012 ;
    }
    
}

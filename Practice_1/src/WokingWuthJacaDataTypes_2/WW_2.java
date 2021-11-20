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

public class WW_2 {    
    //3
    public static void testInts(Integer obj, int var){
        obj = var++;
        obj++;
    }         
    public static void main(String[] args) {
        // 1
        Banana b = new Banana();         
        System.out.println(b.edible+" "+b.weight+" "+b.calories);
        System.out.println("====================================");
        // 2
        int i, j, k;
        i = j = k = 9;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println("====================================");
        //3
        Integer val1 = new Integer(5);
        int val2 = 9;         
        testInts(val1++, ++val2);
        System.out.println(val1+" "+val2);
    }
} 




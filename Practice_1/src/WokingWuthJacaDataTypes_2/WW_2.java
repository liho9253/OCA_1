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
public class WW_2 {
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
    public class TestClass {
        public void main(String[] args) {
            Banana b = new Banana();         
            System.out.println(b.edible+" "+b.weight+" "+b.calories);
        }
    } 
   
    
}

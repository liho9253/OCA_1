/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkingWithConstructorsAndMethodsAndEncapsulation;

/**
 *
 * @author user
 */
public class WCME_2 {
   public void method(Object o){
      System.out.println("Object Version");
   }
   public void method(java.io.FileNotFoundException s){
      System.out.println("java.io.FileNotFoundException Version");
   }
   public void method(java.io.IOException s){
      System.out.println("IOException Version");
   }
   //-----------------------------
    public static void printSum(double a, double b){
        System.out.println("In double "+(a+b));   
    }   
    //----------------------------
    public double methodX( byte by){
        double d = 10.0;
        return (long) by/d*3;
    }
    public static void printSum(float a, float b){
        System.out.println("In float "+(a+b));   
    }   
    public static void main(String[] args) {
        WCME_2 tc = new WCME_2();
        tc.method(null);
        //------------------------
        printSum(1.0, 2.0);      
        //------------------------
        int a = 10;
        long b = 10;
        long c = a+b;
    }
    
}

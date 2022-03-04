/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeryTough;

 abstract class A{   
     protected int m1(){
         return 0; 
     } 
 } 
class B extends A{ 
    int m1(){ 
        return 1;
    } 
}
public class ch_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int k = 1;
        k += 3 + ++k;
        System.out.println(k);
    }
    
}

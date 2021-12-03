/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkingWithConstructorsAndMethodsAndEncapsulation;


class Baap {     
    public int h = 4;    
    public int getH() {         
        System.out.println("Baap " + h);         
        return h;     
    } 
}
public class WCME_3 extends Baap{
    public int h = 44;
    public int getH() {
        System.out.println("Beta " + h);
        return h;     
    }     
    public static void main(String[] args) throws Exception {
        WCME_3 b = new WCME_3();
        System.out.println(b.h + " " + b.getH());
        WCME_3 bb = (WCME_3) b;
        System.out.println(bb.h + " " + bb.getH());
        //-------------------------------
    }
    
}

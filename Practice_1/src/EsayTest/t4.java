/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EsayTest;

/**
 *
 * @author user
 */
public class t4 {
    public class t1{}
    // 只要 == null 就可以 garbage collected
    // final class 不能當子類
    abstract class Automobile{
        void honk(){};   //(3)
    }   
    abstract class Automobile2{
        abstract void honk();   //(5)
    }
    public static void main(String[] args) {
        int i;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InstanceofOperator;

/**
 *
 * @author user
 */
class A implements T1, T2{}
class B extends A implements T1{}
interface T1 { } 
interface T2 { }
public class ioo_1 {
    // instanceof 左邊和右邊不能相同
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println((a instanceof T1));
        System.out.println((a instanceof T2));
        System.out.println((b instanceof T1));
        System.out.println((b instanceof T2));
        System.out.println("==========================");
        
        short s = 9;
         
        int i = 9; 
        System.out.println(s == i); 
        Integer j = 9; 
        System.out.println( s == j );
        // (o instanceof B) && (!(o instanceof C)) == ! ( !(o instanceof B) || (o instanceof C))
    }
    
}

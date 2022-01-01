/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InstanceofOperator;

interface Flyer{ }
class Bird implements Flyer { }
class Eagle extends Bird { }
class Bat { }
public class ioo_3 {

    static class A { } 
    static class B extends A { } 
    static class C extends B { } 
    static class D extends C { }
    public static void main(String[] args) {     
        B b = new C();     
        A a = b;     
        if (a instanceof A) System.out.println("A");
        if (a instanceof B) System.out.println("B");
        if (a instanceof C) System.out.println("C");
        if (a instanceof D) System.out.println("D");
        Flyer f = new Eagle();
        Eagle e = new Eagle();
        Bat bc = new Bat();
        
        if(f instanceof Flyer) System.out.println("f is a Flyer");
        if(e instanceof Bird) System.out.println("e is a Bird");
        //if(bc instanceof Bird) System.out.println("b is a Bird");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objective_wise_JavaClassDesgin;

/**
 *
 * @author user
 */
public class T3 {

    class A
    {
      public A() {} // A1
      public A(String s) {  this();  System.out.println("A :"+s);  }  // A2
    }
    class B extends A
    {
      public int B(String s) {  System.out.println("B :"+s);  return 0; } // B1
    }
    class C extends B
    {
        private C(){ super(); } // C1
        public C(String s){  this();  System.out.println("C :"+s);  } // C2
        public C(int i){} // C3
    }
    public static void main(String[] args) {
        // <T,T> => <T,T> 或是不寫
        // <?,?> => <?,?> 不寫
    }
    
}

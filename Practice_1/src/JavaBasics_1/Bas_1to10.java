/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasics_1;

/**
 *
 * @author user
 */
import java.io.*;
import java.util.*;
// import static
public class Bas_1to10 {
    // void mian一定要連在起
    // mainc
    // public class 的name要跟f method 要 statiile一樣
    // main class 可以沒有 public 
    // static 不能被override 但可以被hidden
    // final 不能被 override
    // 沒有import 要打package的全名
    
    //public OtherClass oc = OtherClass();
    
    public static void main(String[] args)throws IOException {
        System.out.println(new Bas_1to10().main);
    }   
    int main;
}
class OtherClass{     
    int value; 
}
//---------------------------------------------------
class A{
   public A() { }
   public A(int i) {   System.out.println(i );    }    
} 
class B{
   static A s1 = new A(1);
   A a = new A(2);
   public static void main(String[] args){
      B b = new B();
      A a = new A(3);
   }
   static A s2 = new A(4);
}
// 1 4 2 3
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkingWithInheritance;

class Base{
    public Object getValue(){ return new Object(); } //1 
} 
class Base2 extends Base{    
    public String getValue(){ return "hello"; } //2 
} 
//-----------------------------------
class A{
   A() { this("hello", " world");  }
   A(String s) { System.out.println(s); }
   A(String s1, String s2){ this(s1 + s2); }
}
class B extends A{
   B(){ super("good bye"); };
   B(String s){ super(s, " world"); }
   B(String s1, String s2){ this(s1 + s2 + " ! "); }
}
//----------------------------------
class Super {  }
class Sub extends Super {  }
//----------------------------------
class A1{
   private int i = 10;// 改成public 就可以呼叫
   public void  f(){}
   public void g(){}
}
class B1 extends A1{
   public int i = 20;
   public void g(){}
}
//--------------------------------
class A5 { int i = 10;  int m1( ) { return i; } } 
class B5 extends A5 { int i = 20;  int m1() { return i; } } 
class C5 extends B5 { 
    int i = 30;  
    int m1(){ 
        return i; 
    } 
}
public class WWI_1 {
    static int si = 10;
    public WWI_1(){       
        System.out.println(123);    
    }    
    public String toString(){
        return "TestClass.si = "+this.si;    
    }
    public static void main(String[] args) {
        Base b2 = new Base2();       
        System.out.println(b2.getValue());
        //-----------------------------------
        A b = new B("good bye");
        //-----------------------------------
        Super s1 = new Super(); //1
        Sub s2 = new Sub();     //2
        s1 = (Super) s2;        //3
        //----------------------------------
        A1 a = new A1();//1
        A1 b4 = new B1();//2
        //System.out.println(b4.i);
        // ----------------------------------
        // 當 A 是 B 的子類  A = (A)B 要轉型
        //---------------------------------
        A5 o1 = new C5( );
        B5 o2 = (B5) o1;       
        System.out.println(o1.m1( ) );
        System.out.println(o2.i );
        //------------------------------
        new WWI_1();
    }
    
}

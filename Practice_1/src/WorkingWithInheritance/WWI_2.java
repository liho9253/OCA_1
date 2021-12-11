/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkingWithInheritance;

class ABCD{
   int x = 10;
   static int y = 20;
}
class MNOP extends ABCD{
   int x = 30;
   static int y = 40;
} 
//------------------------------
class Baap{
    public int h = 4;
    public int getH(){
        System.out.println("Baap "+h); return h;     
    } 
}
class Base3{
   void methodA(){
      System.out.println("base - MethodA");
   }
}
public class WWI_2 extends Base3{    
    public int h = 44;
    public int getH(){
        System.out.println("Beta "+h); 
        return h;     
    }    
    //---------------------------
   public void methodA(){
      System.out.println("sub - MethodA");
   }
   public void methodB(){
      System.out.println("sub - MethodB");
   }
    public static void main(String[] args) {
        ABCD a = new MNOP();// 看左邊(父)
        System.out.println(a.x);
        System.out.println(a.y);
        System.out.println(new MNOP().x+", "+new MNOP().y);
        //---------------------
        // 子 = 父 要轉型
        //---------------------
        //Baap b = new WWI_2();// 方法抓右邊
        //System.out.println(b.h+" "+b.getH());
        //WWI_2 bb = (WWI_2) b;
        //System.out.println(bb.h+" "+bb.getH());
        // interface 可以 extends interface
        //-------------------------------
        Base3 b4=new WWI_2(); 
        b4.methodA(); 
        //b4.methodB();   methodB()沒有在Base3中宣告
    }
    
}

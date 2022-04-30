/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;


interface I1{
   int VALUE = 1;
   void m1();
}
interface I2{
   int VALUE = 2;
   void m1();
}
public class Test2_1  implements I1, I2 {
    // public class n(){} 只能有一個 public class
    // while 宣告的變數只有自己能用 其他也可以宣告同名的變數 互不影響
    // 要讓變數只能讀的話 設為 private 並建立 public getid() 方法 return 該值
    // override return 的 tpye 要相同
    // interface 可以有 static 但是要有主體
    // 可以沒有 public
    // constractors 不能有 return 跟 void
    // StringBuilder 可修改
    public void m1() { System.out.println("Hello"); }
    public static void main(String[] args){
        if(false){ }
        // while(false){}
      Test2_1 tc = new Test2_1();
      ( (I1) tc).m1();
    }
    
}

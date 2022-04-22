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
public class Test_2 {
    // String Buffer String Builder 都是可變的
    // composition 組合  如果需要多個類就不用 extends 了 (set 跟 get) 有封裝的效果
    // 沒有 modifier 就是 default 的意思
    // The Singleton patterns 單例模式 保證一個類只會產生一個物件且要提供存取物件的統一方法
      // 把 constructor 宣告成 private 
      // 在 class 中添加同一個 private static 的 class
      // 添加 public static 通常命名為 getinstace() 然後 return 第二步的 class 成員
    String isbn;
    String title;
    public Test_2(String isbn, String title){
        this.isbn = isbn;
        this.title = title;
    }
    public boolean equals(Object b)  throws NullPointerException{
        return true;
    }
    public static void main(String[] args) {
        Test_2 t1;// 這時候就會呼叫 Test_2 的 static
        Object b1 = new Test_2("1111", "Thinking in Java");
        Object b2 = new Test_2("1111", "Java in 24 hrs");
        System.out.println(b1.equals(b2));
    }
    
}

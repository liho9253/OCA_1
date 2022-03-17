/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

interface T1{ } 
interface T2{  
    int VALUE = 10;   
    void m1();
} 
interface T3 extends T1, T2{ 
    public void m1();  
    public void m1(int x);
}
public class Test1_1 {

    // char 'a' String "a"
    // 只要對 null 做事情一定會錯誤
    // overload 方法名相同 參數不同
    // override 方法名相同 參數相同
    // finally 一定會執行 不管有沒有被catch
    // Math.round(-0.5) = 0.0
    // 運算符 . 會優先於 強制轉型 
    public static void main(String[] args) {
        char c;
        int i;
        c = 'a';
        i = c;// int 可以接 char
        System.out.println(i);
        // c = i; char 不能接 int
        
        char s1 = 'a';
        String s2 = "a";
        // String a = 'a';
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_809;

class V1Exception extends Exception{
    
}
class V1{
    void T1() throws V1Exception{// line 2
        System.out.println("T1");
    }
}
class V2 extends V1{
    public void T2() throws Exception{// line 1
        super.T1();
    }
}
// V1 為父 line 1 public 要比 line 2 defult 要廣\
// 父方法拋出的例外要相等或其子類別或不寫
// =====================================

class T1<T>{
    private T t;
    public T get(){
        return t;
    }
}
// Foo<?,?> Test = new Foo<>(93,95); 後面空白會自動補()內的類型
// T 都是同樣的類型 泛型是限制 如果 T == String 就只能用 String 
//=========================================

class Book{
    private String read(String name){
        return "R";
    }
}
class EBook extends Book{
    public String read(String name){// 不是複寫 因為看不到上面是 private
        return "r";
    }
}
//=========================================

interface Ex{
    void export();// 前面沒寫是省略 public 
}
class Tool implements Ex{
    // protected void export(){} 子類別不能比父類小
    public void export(){}
}
public class c_1 {
    // catch() 裡用 | 分隔的異常不能有父子關係
    // ex: catch(ArithmeticException | NumberFormatException)
    
    // [L Array.名稱;@hashcode
    
    // Class C extends A implements X,n...{}   extends只能有一個 implements可以多個
    
    // abstract 不能有 final 
    // final 要給初始值
    public static void main(String[] args) throws V1Exception, Exception {
        // C2 obj1 = new C1();
        // C3 obj2 = new C1();
        // C2 s = (C2)obj2; 要轉型
        //===================================
        
        // s.name();  如果 s == null 會拋出 NullPointerException 
        
    }
    
}

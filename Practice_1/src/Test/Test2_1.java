/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author user
 */
public class Test2_1 {

    // char 'a' String "a"
    // 只要對 null 做事情一定會錯誤
    // overload 方法名相同 參數不同
    public static void main(String[] args) {
        char c;
        int i;
        c = 'a';
        i = c;// int 可以接 char
        System.out.println(i);
        // c = i; char 不能接 int
        char s1 = 'a';
        String s2 = "a";
        
        
    }
    
}

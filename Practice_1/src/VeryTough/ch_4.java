/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeryTough;

public class ch_4 {

    // byte * byte = int
    // char + byte = int 
    // type 的多重繼承包括實現多個 interface 的能力和從多個類 extends 的能力
    // state 的多重繼承包括從多個 class extends 實例字段的能力。
    static String url = "jdbc://derby://localhost:1527//mydb"; 
    static ch_4 getDatabase(){    
        System.out.println("Getting DB");   
        return null;  
    }
    public static void main(String[] args) {
        System.out.println( getDatabase().url );
        System.out.println(10/4-30);
    }
    
}

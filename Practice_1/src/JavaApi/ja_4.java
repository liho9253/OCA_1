/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApi;

/**
 *
 * @author user
 */
public class ja_4 {
// java JVM 空間不足 就會 java.lang.OutOfMemoryError    (OOM)
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        StringBuilder sb = new StringBuilder("12345678");
        sb.setLength(10);// 多加空白在後面
        System.out.println(sb.length());
        System.out.println(sb);
        
        String s = "MINIMUM";
        System.out.println(s.substring(4, 7));
        
        s += s;
        System.out.println(s);
       
        // charAt() 第幾個索引值 從0開始
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CH6;

/**
 *
 * @author user
 */
public class ch_1 {
    // 正確格式
    //  printUsefulData(al, (Data d)-> { return d.value>2; }  );
    // printUsefulData(al, d-> d.value>2 );
    // String class 沒有 append
    
    // String 不可變 ex:replace 不會改變
    // StringBulider 可以變
    // StringBuilder extends Object
    
    // java.lang.Boolean、java.lang.Integer、java.lang.Long、java.lang.Short 
    //  String、StringBuilder 、StringBuffer 、java.lang.System 都是 final
    // java.lang.Number 不是 final 
    public static void main(String[] args) {       
        String blank  = " "; 
        String line = blank + "hello" + blank + blank;
        line.concat("world");// line = line.concat("world"); 才會加上去
        String newLine  =  line.trim();
        System.out.println(line.length());
        System.out.println(newLine.length());
        System.out.println((int)(line.length() + newLine.length()));
    }
    
}

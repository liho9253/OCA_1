/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApi;
import java.util.*;
class StringWrapper {
    private String theVal;
    public StringWrapper(String str){
        this.theVal = str; 
    } 
}
public class ja_1 {

    /* 
     
    trim( ) in String class.
    
    StringBuilder
      ensureCapacity(int )
      reverse( )
      setLength(int)
      append(boolean)
     */
    public static void main(String[] args) throws Exception{         
        StringWrapper sw = new StringWrapper("How are you?");
        StringBuilder sb = new StringBuilder("How are you?");
        System.out.println("Hello, "+sw);
        System.out.println("Hello, "+sb);
        
        List  al = new ArrayList();
        al.add(111); 
        //System.out.println(al.get(al.size()));  
        
        String blank  = " ";  
        String line = blank + "hello" + blank + blank;
        line.concat("world");
        String newLine  =  line.trim();
        System.out.println((int)(line.length() + newLine.length()));
    }
    
}

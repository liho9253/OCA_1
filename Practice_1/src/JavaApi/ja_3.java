/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ja_3 {
    public StringBuilder sb = new StringBuilder();
    public void logMsg (String location, String message){
        sb.append(location);
        sb.append("-");
        sb.append(message);
    }
    public void dumplog(){
        System.out.println(sb.toString());
        sb.delete(0, sb.length());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List s1 = new ArrayList( );         /*
        try{             
            while(true){
                s1.add("sdfa");
            }         
        }catch(RuntimeException e){
            // 拋出java.lang.OutOfMemoryError => java.lang.Error 的子類
            e.printStackTrace();         
        } 
        System.out.println(s1.size());*/
        s1.add(111);
        //System.out.println(s1.get(s1.size()));// java.lang.IndexOutOfBoundsException
        //s1.add(2, "value2");//java.lang.IndexOutOfBoundsException
        // s.equals(t) == true => s.intern() == t.intern() 
        // equalsIgnoreCase() 不考慮大小寫 做比較
        "    hello java guru   ".trim();
        // StringBuilder extends Object
        //  StringBuilder is a final class.
        // 跟日期相關大都不可變
        // String沒有append()
    }
    
}

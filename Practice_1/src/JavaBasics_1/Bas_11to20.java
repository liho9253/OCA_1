/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasics_1;
// 不能 static import java.lang.System.*;
import static java.lang.System.*;
/**
 *
 * @author user
 */
class Test{}
public class Bas_11to20 {
    // print is a method not a class
    // java 可以繼承多類型 不能一個類繼承多個類 => 不能 多static繼承
    
    String global = "111";
    public int parse(String arg){         
        int value = 0;         
        try{             
            String global = arg;                         
            value = Integer.parseInt(global);         
        }catch(Exception e){
            System.out.println(e.getClass());
        }         
        System.out.print(global+" "+value+" ");         
        return value;     
    }
    public static void main(String[] args) {
        Bas_11to20 ct = new Bas_11to20();
        System.out.println(ct.parse("333"));
        
        // double x=10, double y;
        double x=10, y;
        // int b = 10.0;
        int a = (int)10.0;
        
    }
    
}

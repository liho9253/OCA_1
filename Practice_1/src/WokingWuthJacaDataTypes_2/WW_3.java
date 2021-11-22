/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WokingWuthJacaDataTypes_2;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class WW_3 {
    // System.gc() == Runtime.getRuntime().gc()
    int a;
    int b = 0;
    static int c ;// 預設值 == 0
    public void m(String[] args) {
        int d;// 無預設值
        int e = 0;
        a++;
        b++;
        c++;
    //    d++;
        e++;
    }
    public static String getType(Object a){
        return a.getClass().toString();
    }
    public static void main(String[] args) {
        ArrayList<Double> al = new ArrayList<>();
        System.out.println(al.indexOf(1.0));
        System.out.println(getType(al.indexOf(1.0))); 
        System.out.println(al.contains("string"));
        
    }
    
}

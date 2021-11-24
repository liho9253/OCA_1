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
    public Object getOcj(){
        Object obj = new String("aaaaa");   //1
        Object objArr[] = new Object[1]; //2
        objArr[0] = obj; //3      
        obj = null;      //4     
        objArr[0] = null;//5 會被放至GC     
        return obj;      //6
    }
    public static void main(String[] args) {
        ArrayList<Double> al = new ArrayList<>();
        System.out.println(al.indexOf(1.0));
        System.out.println(getType(al.indexOf(1.0))); 
        System.out.println(al.contains("string"));
        System.out.println("==============================");
        char c = 320;
        float f = 320;
        double d = 320;
        // byte b = 320;
        float f1 = 22.0f/7.0f;
        System.out.println("=============================");
        int hex = 0xCAFE_BABE; 
        float f2 = 9898_7878.333_333f; 
        int bin = 0b1111_0000_1100_1100;
        System.out.println(hex);
        System.out.println(f2);
        System.out.println(bin);
    }
    
}

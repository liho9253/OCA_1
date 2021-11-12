package Foundation_Test;
import java.lang.String;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Foundation_Test_1_10 {
    public int updata(int a, int offset){
        a = a + offset;
        return a;
    } 
    public static void main(String[] args){
        Foundation_Test_1_10 u = new Foundation_Test_1_10();
        int a = 99;
        a = u.updata(a, 111);
        //System.out.println(a);
        System.out.println("---------------------");
        StringBuilder b1 = new StringBuilder("snorkler");
        StringBuilder b2 = new StringBuilder("yoodler");
//        b1.append(b2.substring(2, 5).toUpperCase());
//        System.out.println(b1);
//        System.out.println(b2);
        
//        b2.insert(3, b1.append("a"));
//        System.out.println(b1);
//        System.out.println(b2);
        
        b1.replace(3, 4, b2.substring(4)).append(b2.append(false));
        System.out.println(b1);
        System.out.println(b2);
        System.out.println("---------------------");
        Integer i1 = 1;
        Integer i2 = new Integer(1);
        int i3 = 1;
        Byte b_b1 = 1;
        Long g1 = 1l;
        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
        // System.out.println(i1 == b_b1);
        System.out.println(i1.equals(i2));
        System.out.println(i1.equals(g1));
        System.out.println(i1.equals(b_b1));
        System.out.println("---------------------");
    }
    
}

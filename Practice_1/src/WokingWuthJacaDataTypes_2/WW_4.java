/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WokingWuthJacaDataTypes_2;

/**
 *
 * @author user
 */
public class WW_4 {
    static int MAX = 111;
    // static final String CLASS_GUID;
    static boolean bool;
    public static void main(String[] args) {
        double i = 100.0;
        double d = 10_000_000;
        System.out.println(Boolean.parseBoolean("true"));
        // System.out.println(new Boolean());
        System.out.println(new Boolean("trUE")); 
        System.out.println(Boolean.valueOf("trUE"));
        System.out.println(Boolean.valueOf(true));
        System.out.println(Boolean.TRUE);
        System.out.println("================================");
        //--------------------------------------
        String a = "x";
        char b = 'x';
        System.out.println(a.equals(b));
        //--------------------------------------
        int z,j,k;
        z = j = k = 9;
        System.out.println(z);
        System.out.println(j);
        System.out.println(k);
        //------------------------------------
        System.out.println(bool);
        //------------------------------------
        /*int value = 1,000,000; 
        switch(value){             
            case 1_000_000 : 
                System.out.println("A million 1");
              break;         
            case 1000000 : 
            System.out.println("A million 2");                
            break;         
        }*/
        int a1 = 1000000;
        int a2 = 1_000_000;
        System.out.println(a1 == a2);
    }
    
}

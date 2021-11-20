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
public class WW_1 {
    //1
    public static int getSwitch(String str){
        return (int) Math.round( Double.parseDouble(str.substring(1, str.length()-1)) );
   }
    //2
    private Object o;
    void doSomething(Object s){  o = s;   }
    //3
    static double percent;   
    int offset = 10, base= 50;    
    public static double calc(double value) {
        int coupon, offset, base;         
        if(percent <10){          
            coupon = 15;             
            offset = 20;             
            base = 10;         
        }         
        return 1;//coupon*offset*base*value/100; 變數沒有初始值
    }
    public static void main(String[] args) {
        /*//1
        switch(getSwitch(args[0])){
            case 0 : System.out.print("Hello ");
            case 1 : System.out.print("World"); break;
            default : System.out.print("Good Bye");
        }*/
        //2
        Object obj = new Object(); 
        WW_1 tc = new WW_1();
        tc.doSomething(obj);
        obj = new Object();
        obj = null;
        tc.doSomething(obj);
    }
    
}

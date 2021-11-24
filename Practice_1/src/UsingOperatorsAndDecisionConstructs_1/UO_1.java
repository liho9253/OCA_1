/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsingOperatorsAndDecisionConstructs_1;

/**
 *
 * @author user
 */
public class UO_1 {
    // switch 中不能用 double/float/long/boolean   bdfl
    int k = 5;     
    public boolean checkIt(int k){
        return k-->0?true:false;     
    }
    public void printThem(){
        while(checkIt(k)){
            System.out.print(k--);
        }     
    }
    void test(int x){    
        switch(x){       
            case 1:       
            case 2:       
            case 0:       
            default :       
            case 4:    
        } 
    }
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = obj1;
        System.out.println(obj1.equals(obj2));
        //------------------------------------
        int[] arr = new int[10];
        System.out.println(arr[2]);
        //------------------------------------
        double d1 = 3.8;
        float f1 = 5.5f;
        System.out.println((int)(d1+f1));
        System.out.println((int)d1);
        System.out.println((int)f1);
        //------------------------------------
        new UO_1().printThem();
        //------------------------------------
        int i1 = 0;
        int i2 = 1;
        if(i1 == 0 & i2 == 2)System.out.println("123");
        //-----------------------------------
        Boolean bool = false;
        
        

    }
    
}

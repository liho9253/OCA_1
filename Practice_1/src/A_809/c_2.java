/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_809;

class MyException extends RuntimeException{}
public class c_2 {

    // 抽象方法不能有實作{}
    // enum 建構子只能用private 且不用 new
    // 88
    
    public static void main(String[] args) {
        if(new Boolean("true")){System.out.println("OK");}
        if(new Boolean("TRUE")){System.out.println("AOK");}
        try{
            m1();
        }catch(MyException e){
            System.out.println("A");
        }
    }
    
    public static void m1(){
        try{
           throw Math.random() > 0.5 ? new MyException():new RuntimeException(); //因為 MyException 繼承 RuntimeException 所以都匯回傳 RuntimeException
        }catch(RuntimeException e){
            System.out.println("B");
        }
    }
}

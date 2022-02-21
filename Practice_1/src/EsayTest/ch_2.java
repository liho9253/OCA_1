/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EsayTest;

/**
 *
 * @author user
 */
public class ch_2 {

    // finally 一定要在 catch 後面
    static int si = 10;
    public ch_2(){
        System.out.println(this);  
    } 
    public String toString(){   
        return "TestClass.si = "+this.si;
    }
    public static void main(String[] args) {

    int count = 0, sum = 0;
    do{
           if(count % 3 == 0) continue;
           sum+=count;
    }
    while(count++ < 11);
    System.out.println(sum);
     new ch_2();
    }
    
}

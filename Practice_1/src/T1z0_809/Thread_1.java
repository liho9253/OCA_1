/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1z0_809;

/**
 *
 * @author user
 */
public class Thread_1 extends Thread{
    private String msg;
    public Thread_1(String msg){
        this.msg = msg;
    }
    public void run(){
        System.out.println("Thread msg is: " + this.msg);
    }
    public static void main(String[] args) {
        Thread_1 t1 = new Thread_1("msg1");
        t1.start();
        
        
    }
    
}

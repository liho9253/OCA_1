/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1z0_809;

import java.util.concurrent.locks.ReentrantLock;

class Widget {

    String data = "data";
    public void doWidgetStuff() {
      System.out.println(data);
    }

}

class GoodWidget extends Widget{
    String data = "big data";

    public void doWidgetStuff() {
    }
}
public class Test1 extends Thread{ 

    public void run(){
        for(;;);
    }
    public static void main(String[] args) {
        Widget w = new GoodWidget();
        ((Widget)w).doWidgetStuff();
        
        ReentrantLock rc = new ReentrantLock();
        //boolean t1 = rc.lock();
        //System.out.println(t1);
        
        
        System.out.println("Starting Main");
        new Test1().start();
        System.out.println("Main returns");
        
    }
    
}

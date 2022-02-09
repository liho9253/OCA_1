/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1z0_809;

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
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Widget w = new GoodWidget();
        ((Widget)w).doWidgetStuff();
    }
    
}

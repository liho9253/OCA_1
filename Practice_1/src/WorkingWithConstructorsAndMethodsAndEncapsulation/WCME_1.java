/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkingWithConstructorsAndMethodsAndEncapsulation;

class Wrapper{
    int w = 10;
}
class XXX{     
    public void m() throws Exception{
        throw new Exception();     
    } 
} 
class YYY extends XXX{
    public void m() {  
    } 
}
public class WCME_1 {
    static Wrapper cw(Wrapper w){
        w = new Wrapper();
        w.w += 9;
        return w;
    }
    //1-------------------------
    long l1;
    public void TestClass(long pLong) { l1 = pLong ; }
    public static void main(String[] args) {
        Wrapper w = new Wrapper();
        w.w = 20;
        System.out.println(w.w);
        cw(w);
        w.w += 30;
        System.out.println(w.w);
        w = cw(w);
        System.out.println(w.w);
        //1-------------------------
        WCME_1 a, b ;
        a = new WCME_1();  //(2)
        //b = new WCME_1(5l);  //(3)
        //------------------------
        YYY obj = new YYY();
        obj.m();
    }
    
}

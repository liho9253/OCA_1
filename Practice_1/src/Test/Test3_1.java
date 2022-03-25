/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author user
 */
public class Test3_1 {
    // finally 之後不能接 return
    // String 沒有 append   
    // List s = new ArrayList();
    // List 為 Type, ArrayList 為 object
    
    static Test3_1 ref;  
    String[] arguments;  
    public void func(String[] args){    
        ref.arguments = args; 
    }
    public static void main(String[] args) {
        B c = new C();
        System.out.println(c.max(10, 20)); 
        
        int i = 4;
        int ia[][][] = new int[i][i = 3][i];
        System.out.println( ia.length + ", " + ia[0].length+", "+ ia[0][0].length);
        
        ref = new Test3_1();     
        ref.func(args);
        
    }
    
}
class A{
    int max(int x, int y)  { if (x>y) return x; else return y; }
}
class B extends A{
      int max(int x, int y)  {  return 2 * super.max(x, y) ; }// 這裡會執行*2
}
class C extends B{
    int max(int x, int y)  {  return super.max( 2*x, 2*y); }
}
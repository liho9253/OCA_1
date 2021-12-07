/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkingWithConstructorsAndMethodsAndEncapsulation;
import java.util.*;
/**
 *
 * @author user
 */
public class WCME_4 {
    char c;
    public void m1(){
        char[ ] cA = { 'a' , 'b'};
        m2(c, cA);
        System.out.println( ( (int)c)  + "," + cA[1] );
    }
    public void m2(char c, char[ ] cA){
        c = 'b';
        cA[1] = cA[0] = 'm';
    }
    public static void main(String[] args) {
        new WCME_4().m1();
        //-------------------------
        int a = 'a';
        char c = 5;
        System.out.println(a);
        System.out.println(c);
        //------------------------      
        Stack s1 = new Stack ();
        Stack s2 = new Stack ();
        processStacks (s1,s2);
        System.out.println (s1 + "    "+ s2);
        //constructor NO has final static void synchronized
    }
    public static void processStacks(Stack x1, Stack x2){
        x1.push (new Integer ("100")); //assume that the method push adds the passed object to the stack.
        x2 = x1;
   }
}

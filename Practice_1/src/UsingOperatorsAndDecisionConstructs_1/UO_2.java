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
public class UO_2{

    public static int ml(int i){
        return ++i;
    }
    public static void main(String[] args) {
        int k = ml(args.length);
        k += 3 + ++k;
        System.out.println(k);
        System.out.println(args.length);
        //-------------------------------
        System.out.println("1" + 2 + 3); 
        System.out.println(4 + 1.0f);
        //------------------------------
        char i;
        LOOP: for (i=0;i<5;i++){
            switch(i++){
                case '0': System.out.println("A");
                case 1: System.out.println("B"); break LOOP;
                case 2: System.out.println("C"); break;
                case 3: System.out.println("D"); break;
                case 4: System.out.println("E");
                case 'E' : System.out.println("F");
            }
        }
        //-----------------------------       
        /*
        switch(Integer.parseInt(args[1])){
            case 0 :
               boolean b = false;
               break;

            case 1 :
               b = true; //2
               break;
        }
       
        if(false) 
            System.out.println(args[2]);*/
        // --------------------------------
        Integer i1 = 1; 
        Integer i2 = new Integer(1); 
        int i3 = 1;
        System.out.println(i1 == i2);//*
        System.out.println(i1 == i3);
        System.out.println(i1.equals(i2));
        //--------------------------------
        char c;
        int ia;
        c = 'a';
        ia = c;  
        System.out.println(ia);
        ia++;   
        //c = ia; 
        c++;   
        System.out.println(c);
        //--------------------------------
        Object t = new Integer(107);     
        int x = ((Integer) t).intValue()/9;  
        System.out.println(x);
        //--------------------------------    
    }
}
    


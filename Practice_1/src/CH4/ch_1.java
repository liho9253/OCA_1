/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CH4;

/**
 *
 * @author user
 */
public class ch_1 {

    // if(str == null) 為真時 NullPointerException
    
    public void testRefs(String str, StringBuilder sb){
      str = str + sb.toString();
      sb.append(str);
      str = null;
      sb = null;
    }
    public static void main(String[] args) {
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
        
        String s = "aaa";
        StringBuilder sb = new StringBuilder("bbb");
        new ch_1().testRefs(s, sb);
        System.out.println("s="+s+" sb="+sb);
        
        int x1 = -4;
        int x2 = x1--; // x1 會更著變
        int x3 = ++x2;
        System.out.println(x1+" "+x2);
    }
}

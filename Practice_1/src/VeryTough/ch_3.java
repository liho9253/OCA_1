
package VeryTough;

class Baap{   
    public int h = 4;  
    public int getH(){ 
        System.out.println("Baap "+h); return h;    
    } 
}
public class ch_3 extends Baap{

    // new Long(str) 裡面一定要有數
    // Boolean.parseBoolean("true") 返回字串  
    public int h = 44;   
    public int getH(){ 
        System.out.println("Beta "+h); return h;  
    }    
    public static void main(String[] args) {
        String str = "String";
        str = str.replace('g','g');
        System.out.println("String" == str);
        
        int x  = 0;
        labelA:   for (int i=10; i<0; i--){
           int j = 0;
           labelB:
           while (j < 10){
              if (j > i) break labelB;
              if (i == j){
                 x++;
                 continue labelA;
              }
              j++;
           }
           x--;
        }
        System.out.println(x);
        
        Baap b = new ch_3();
        System.out.println(b.h+" "+b.getH()); 
        
        if (false) { x=3; } 
        // while (false) { x=3; }
    }
    
}

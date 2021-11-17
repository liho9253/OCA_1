/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkingWithJavaDataTypes;

/**
 *
 * @author user
 */
public class WW_1 {
    void Test(){
        MyClass obj = new MyClass();
        obj.name = "jack";
        obj = null;
        
    }
    public static void main(String[] args) {
        Integer i = new Integer(42);
        Long ln = new Long(42);
        Double d = new Double(42.0);
        System.out.println(i.equals(d));
        System.out.println(d.equals(ln));
        System.out.println(ln.equals(42));
        
         
        Boolean.parseBoolean(" true ");// 有空格會return false
        Boolean.parseBoolean("true");// 返回的不是Boolean包裝的object
        Boolean.valueOf(true); 
        // Boolean.TRUE;
        Boolean.valueOf("trUE");
        
        char c = 320; 
        float f = 320; 
        double v = 320; 
        // byte q = 320; 
        float w = 22.0f/7.0f;
        
        Integer s = new Integer(1) ;      
        Long m = new Long(1);
        if(s.equals(m)) System.out.println("equal");
        else System.out.println("not equal");
              
        int r = Integer.parseInt(args[1]);      
        System.out.println(args[r]);//java.lang.ArrayIndexOutOfBoundsException
        
        float f2 = 123_345_667F;
    }
    
}

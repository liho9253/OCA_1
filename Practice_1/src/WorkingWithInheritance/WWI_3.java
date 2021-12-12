/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkingWithInheritance;

interface Flyer{ 
    String getName(); 
}  
class Bird implements Flyer{
    public String name;
    public Bird(String name){
        this.name = name;     
    }     
    public String getName(){
        return name; 
    } 
}  
class Eagle extends Bird {
    public Eagle(String name){
        super(name);     
    } 
}

class A12{
    public static void sM1() {
         System.out.println("In base static");
    } 
} 
class B32 extends A12{
     public static void sM1() {  System.out.println("In sub static"); }  
    // public  void sM1() {  System.out.println("In sub non-static"); } 
    // static 不能被 non-static 覆蓋    non-static 也不能被 static 覆蓋 
}
public class WWI_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Flyer f = new Eagle("American Bald Eagle");
        System.out.println(f.getName()); 
        System.out.println(((Eagle)f).name);
        System.out.println(((Bird)f).getName());
    }
    
}

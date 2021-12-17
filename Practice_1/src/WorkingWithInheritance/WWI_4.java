/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkingWithInheritance;

class Car{
   public int gearRatio = 8;
   public String accelerate() {  return "Accelerate : Car";  }
}
class SportsCar extends Car{
   public int gearRatio = 9;
   public String accelerate() {  return  "Accelerate : SportsCar";  }
   public static void main(String[] args){
      Car c = new SportsCar();
      System.out.println( c.gearRatio+"  "+c.accelerate() );
   }
}
class ABCDE{
   int x = 10;
   static int y = 20;
}
class MNOPP extends ABCDE{
   int x = 30;
   static int y = 40;
}
public class WWI_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(new MNOP().x+", "+new MNOP().y);
    }
    
}

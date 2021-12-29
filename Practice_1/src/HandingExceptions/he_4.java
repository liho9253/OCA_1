/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HandingExceptions;


class NewException extends Exception {}
class AnotherException extends Exception {}

class MyException extends Throwable{} 
class MyException1 extends MyException{} 
class MyException2 extends MyException{} 
class MyException3 extends MyException2{}

public class he_4 {

    public static void m2() throws NewException { throw new NewException(); }

    public static void m3() throws AnotherException{ throw new AnotherException(); }
    
    void myMethod() throws MyException{
        throw new MyException3();    
    }
    public static void main(String[] args) {
        try{
            m2();
        }
        /*finally{  // finally 不能在 try catch 中間
            m3();
        }*/
        catch (NewException e){}
        //---------------------------------
        he_4 et = new he_4();
        try{          
            et.myMethod();       
        }catch(MyException me){
            System.out.print("MyException thrown");
        }/*catch(MyException3 me3){ // 越下越父 不能亂排
            System.out.println("MyException3 thrown");
        }*/finally{          
            System.out.println(" Done");       
        }
        //---------------------------------
        try{
            System.out.print("try ");
        }catch(Exception e){
            System.out.print("catch ");       
        }finally{          
            System.out.print("finally ");       
        }       
        System.out.println("out ");
    }
    
}

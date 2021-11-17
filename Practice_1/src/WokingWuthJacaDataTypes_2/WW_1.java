/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WokingWuthJacaDataTypes_2;

/**
 *
 * @author user
 */
public class WW_1 {

    public static int getSwitch(String str){
        return (int) Math.round( Double.parseDouble(str.substring(1, str.length()-1)) );
   }
    public static void main(String[] args) {
        switch(getSwitch(args[0])){
            case 0 : System.out.print("Hello ");
            case 1 : System.out.print("World"); break;
            default : System.out.print("Good Bye");
        }
    }
    
}

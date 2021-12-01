/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsingLoopConsturcts;

/**
 *
 * @author user
 */
public class ULC_2 {
    private int j;
    void showj(){
        while(j<=5){
            for(int j=1; j <= 5;){
                System.out.print(j+" ");                 
                j++;             
            }             
            j++;         
        }
    }
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0, j = 10; sum > 20; ++i, --j){
            sum = sum+ i + j;
        }
        //---------------------------------
        /*
        for(;;Math.random()){
            System.out.println("1");
        }*/
        //--------------------------------
        String[] st = {"1","2","3"};
        int index = 0;
        for(String data : st){
            if(index == 3){
                break;
            }else{
                continue;
            }            
        }
        System.out.println(index);
        //-------------------------
        /*k要初始化
        for(int k;k<0;k++){
            
        }*/
        //------------------------
        new ULC_2().showj();
    }
    
}

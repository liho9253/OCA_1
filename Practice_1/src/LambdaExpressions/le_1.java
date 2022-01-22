/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaExpressions;

import java.util.Arrays;
import java.util.List;

//checkList(new ArrayList(), al -> al.add("hello")); ArrayList 中使用.add會返回布林直
public class le_1 {
    int value;    
    le_1(int value){
        this.value = value;
    }     
    public String toString(){ return ""+value; }
    public static void main(String[] args) {         
        le_1[] dataArr = new le_1[]{ new le_1(1), new le_1(2), new le_1(3), new le_1(4) };
        List<le_1> dataList = Arrays.asList(dataArr); //1          
        for(le_1 element :  dataList){              
        dataList.removeIf( (le_1 d) -> { return d.value%2 ==  0; } );
        //System.out.println("Removed "+d+", ");  d 只能用在 Lambda 裡面
        }   
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATest;

import java.util.ArrayList;

/**
 * 
 * @author user
 */
class t3 {
    // static 方法裡面沒有 this
    // Lambda 有 return 就要有 {}
    // 有 static 叫類別方法
    private char var;
    public static void main(String[] args) {
        ArrayList<Integer> points = new ArrayList();
        points.add(1);
        points.add(2);
        points.add(3);// index(2)
        points.add(null);
        points.remove(2);// remove index(2)
        // 如果要移除2 => points.remove(Integer.valueOf(2));
        System.out.println(points);
        
        if(points.remove(null)){// remove 會回傳 true or false 碰到就執行
            points.remove(5);// 因為 remove 成功 所以會執行 沒有移除成功回傳 false
        }
        
        int numbers[] = {12,58,23,45,2,1,8};
        int max = findMax(numbers);
        // int max = new t3().findMax(numbers); 沒有 static 要間接呼叫有 static (new)
        
        t3 obj1 = new t3();// 參考資料型別
        t3 obj2 = obj1;// 指向同一個 new t3()
        obj1.var = 'i';
        obj2.var = 'o';// 也可以改 var 的值
        System.out.println(obj1.var+","+obj2.var);
        
        Object z = new int[2][3];// 可以用 Object 呼叫
    }
    static int findMax(int[] numbers){//如果這裡想要 public int findMax(int[] numbers)
        int max = 0;
        return max;
    }
}

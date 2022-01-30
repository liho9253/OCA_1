/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATest;

public class t6_Test1 {
    // package 裡不一定要包含 main 方法
    public A a;
    public class A{}
    int b;
    public static void display(){
        // System.out.println(b++); b 不是 static 所以不能呼叫
    }
    
    static class A1{
        static int i;
        static void print(){
            System.out.println("A class"+ i);
        }
    }
    
    static class B1 extends A1{
        static void print(){
            System.out.println("B class" + i);
        }
    }
    public static void main(String[] args) {
        A1.i = 100;
        B1.i = 200;
        A1.print();
        B1.print();
        
        int arr[][] = new int[2][4];
        arr[0] = new int[]{1,3,5,7};
        arr[1] = new int[]{1,3};
        for(int[] a : arr){
            for(int i = 0;i<arr.length;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
        System.out.println(arr[1][2]);
    }
    
}

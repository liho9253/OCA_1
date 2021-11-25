/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreatingAndUsingArrays;

/**
 *
 * @author user
 */
public class CUA_1 {

    public static int[ ] getArray() {  return null;  }
    //---------------------------------
    int[][] matrix = new int[2][3];
    
    int a[] = {1, 2, 3};
    int b[] = {4, 5, 6};
    public int compute(int x, int y){
        return a[x]*b[y];
    }    
    public void loadMatrix(){
        for(int x=0; x<matrix.length; x++){
            for(int y=0; y<matrix[x].length; y++){
                matrix[x][y] = compute(x, y);
            }
        }
    }
    public static void main(String[] args) {
        A[] a, a1;
        B[] b;
        a = new A[10]; a1  = a;
        b =  new B[20];
        a = b; 
        b = (B[]) a;  
        //b = (B[]) a1; 
        //-----------------------------
        int index = 1;       
        try{          
            getArray()[index=2]++;       
        }catch (Exception e){  }  //empty catch       
        System.out.println("index = " + index);    
        //----------------------------
        char[][] cA = {  { 'a', 'b', 'c' },  { 'a', 'b', 'c' }   };
        
    
    }
    
}
class A { } 
class B extends A { }
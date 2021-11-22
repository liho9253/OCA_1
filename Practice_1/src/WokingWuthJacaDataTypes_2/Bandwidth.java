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
public class Bandwidth {
    public int available = 0;
    public int getAvailable(){
        return available;     
    }     
    public Bandwidth(int quota){
        this.available = quota;     
    }     
    public void addMore(int more){
        available += more;     
    }     
    public static void main(String[] args) {
        Bandwidth bw = new Bandwidth(100); 
        // bw(0);
        bw.available = 0;      
        // bw.setAvailable(0); 沒有 setAvailable method
        // bw = new Bandwidth(); 
        bw.addMore(-bw.getAvailable()); 
        --bw.available;//會減1
        System.out.println(bw.getAvailable());
    }
    
}

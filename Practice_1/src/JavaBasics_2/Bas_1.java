/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasics_2;

public class Bas_1 {
    public class S{}
    int a ;
    
    public String title;
    public int id;
    public Bas_1(String title, int id){
        this.title = title;
        this.id = id;
    }
    final static public void main(String[] args) {     
        // private int b = 0;
        System.out.println("Hello");
        Bas_1[] papers =  {
            new Bas_1("T1",1),
            new Bas_1("T2",2),
            new Bas_1("T3",3)
        };
        System.out.println(papers);
        System.out.println(papers[1]);
        System.out.println(papers[1].id);
    }
    
}

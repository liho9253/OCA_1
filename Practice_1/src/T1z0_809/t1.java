/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1z0_809;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

class Address implements Comparable<Address>{
    String street;
    String zip;
    public Address(String street, String zip){
        this.street = street; this.zip = zip;
    }
    public int compareTo(Address o) {
        int x = this.zip.compareTo(o.zip);
        return x == 0? this.street.compareTo(o.street) : x;
    }
}
public class t1 implements Runnable{
    int x = 0, y = 0;
    public void run()
    {
      while(true)
      {
        x++; y++;
        System.out.println(" x = "+x+" , y = "+y);
      }
    }
    public static void main(String[] args) {
        /*
        Path p1 = Paths.get("\\personal\\readme.txt");
        Path p2 = Paths.get("\\index.html");
        Path p3 = p1.relativize(p2);
        System.out.println(p3);
        
        t1 tc = new t1();
        new Thread(tc).start();
        new Thread(tc).start();
        
        ReentrantLock rlock = new ReentrantLock();
        boolean f1 = rlock.lock(); 沒有Lock.lock
        System.out.println(f1);
        boolean f2 = rlock.lock();
        System.out.println(f2);
        */
        
        ArrayList<Address> al = new ArrayList<>();
        al.add(new Address("dupont dr", "28217"));
        al.add(new Address("sharview cir", "28217"));
        al.add(new Address("yorkmont ridge ln", "11223"));        
        Collections.sort(al);
        for(Address a : al) System.out.println(a.street+" "+ a.zip);
        
        // equals 方法被覆蓋也代表 hsahcode 也被覆蓋
        
        // List<?> list = new ArrayList<>(Arrays.asList(names));
        // List<String> list = new ArrayList<>(Arrays.asList(names));
          // 前面問號後面可以不寫 
          
          /*
        Locale(String language)
          Construct a locale from a language code.
        Locale(String language, String country)
            Construct a locale from language, country.
        Locale(String language, String country, String variant)
            Construct a locale from language, country, variant.
          */
    }
    
}

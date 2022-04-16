/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T1z0_809;

/**
 *
 * @author user
 */
public class synchronization_1 {
    // synchronization public void syncMenthod(){} 
      // 鎖定 Method 的 instance
      // 此物件被 new 一次 要用的時候就會到這裡拿出來執行 加以保護
      // 如果超過一次就有可能保護不到
    // synchronized static public void syncMethod() {}
      // 鎖定 Method 的 class
      // 不管被 new 出幾次 同一時間只會用到一次
    // public void syncMethod() {synchronized(this) {}}
      // 鎖定 Method 的 intance
    // public void syncMethod() {synchronized(SomeObject) {}}
      // 鎖定 SomeObject 
      // SomeObject 為不同的 instance 就可能會同時執行
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

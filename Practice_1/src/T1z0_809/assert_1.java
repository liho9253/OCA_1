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
public class assert_1 {
    // assert 為了除錯用的
    
        static int value;
        static boolean flag;
        
    public static void main(String[] args) {
        assert value == 10 : value;
        assert value == 10 : flag;
        assert flag: value == 10 ;
        assert flag : new Integer(value);
        // assert value : flag;

    }
    
}

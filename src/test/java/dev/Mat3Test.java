/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev;

import glm.mat._3.Mat3;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author GBarbieri
 */
public class Mat3Test {
    
    public Mat3Test(){
        
    }
    
    @Test
    public void test_invTransp_a() {
        System.out.println("invTransp_a");
        Mat3 mat = new Mat3(7,2,1,0,3,-1,-3,4,-2);
        Mat3 expResult = new Mat3(-2f, 3f, 9f, 8f, -11f, -34f, -5f, 7f, 21f);
        mat.invTransp(mat);
        assertTrue(mat.equals(expResult));
    }
}

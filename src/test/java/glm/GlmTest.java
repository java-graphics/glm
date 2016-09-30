/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author GBarbieri
 */
public class GlmTest {

    @Test
    public void test_ceilMultiple_a() {
        System.out.println("ceilMultiple_a");
        int result = Glm.ceilMultiple(60, 256);
        int expResult = 256;
        Assert.assertEquals(result, expResult);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.relational;

import glm.vec._2.Vec2;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author GBarbieri
 */
public class ArithmeticOperators {
    
    @Test
    public void add_Vec2() {
        
        Vec2 a, b, c;
        
        a = new Vec2(1.0f);
        b = new Vec2(1.0f);        
        assertTrue(a.equals(b));
        assertFalse(a.equals(b));
        
    }
}

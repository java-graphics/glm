/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm;

import static org.junit.Assert.assertTrue;
import glm.vec._2.b.Vec2b;
import org.junit.Test;

/**
 *
 * @author GBarbieri
 */
public class _ArithmeticOperators {

    @Test
    public void vec2() {

        Vec2b a, b, c;

        a = new Vec2b(1);
        c = a.add_(1);
        a.add(1);
        assertTrue(a.equals(new Vec2b(2)));
        assertTrue(a.equals(c));

        a = new Vec2b(1);
        b = new Vec2b(2, -1);
        c = a.add_(b);
        a.add(b);
        assertTrue(a.equals(new Vec2b(3, 0)));
        assertTrue(a.equals(c));

        a = new Vec2b(1);
        c = a.sub_(1);
        a.sub(1);
        assertTrue(a.equals(new Vec2b(0)));
        assertTrue(a.equals(c));

        a = new Vec2b(1);
        b = new Vec2b(2, -1);
        c = a.sub_(b);
        a.sub(b);
        assertTrue(a.equals(new Vec2b(-1, 2)));
        assertTrue(a.equals(c));

        a = new Vec2b(1);
        c = a.mul_(2);
        a.mul(2);
        assertTrue(a.equals(new Vec2b(2)));
        assertTrue(a.equals(c));

        a = new Vec2b(2);
        b = new Vec2b(2);
        c = a.div_(b);
        a.div(b);
        assertTrue(a.equals(new Vec2b(1)));
        assertTrue(a.equals(c));
        
        a = new Vec2b(1, 2);
        b = new Vec2b(4, 5);
        
        c = a.add_(b);
        assertTrue(c.equals(new Vec2b(5, 7)));
        
        c = b.sub_(a);
        assertTrue(c.equals(new Vec2b(3)));
        
        c = a.mul_(b);
        assertTrue(c.equals(new Vec2b(4, 10)));
        
        c = b.div_(a);
        assertTrue(c.equals(new Vec2b(4, 2)));
        
        c = a.add_(1);
        assertTrue(c.equals(new Vec2b(2, 3)));
        
        c = b.sub_(1);
        assertTrue(c.equals(new Vec2b(3, 4)));
        
        c = a.mul_(2);
        assertTrue(c.equals(new Vec2b(2, 4)));
        
        c = b.div_(2);
        assertTrue(c.equals(new Vec2b(2)));
    }
}
